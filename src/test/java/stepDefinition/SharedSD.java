package stepDefinition;

import com.sun.tools.internal.jxc.ConfigReader;
import cucumber.api.Scenario;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import runnerTest.webPage.ElementUtil;
import util.BasePage;
import util.configReader;
import org.apache.log4j.Logger;


public class SharedSD {
    //Hook class
    ElementUtil elementUtil = new ElementUtil();
    private static Logger logger = Logger.getLogger(SharedSD.class);
    @Before
    public void setUp(){
        logger.info("***************************");
        logger.info("Test is starting.......!");
        configReader.getProperty("browser");
        BasePage.get().get(configReader.getProperty("url"));
        BasePage.get().manage().window().fullscreen();
    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            logger.error("Test failed");
            byte[] screenshot = ((TakesScreenshot)BasePage.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
            elementUtil.getScreenShot("pic");
        }else{
            logger.info("Cleanup...!");
            logger.info("Test was completed");
        }
        logger.info("*******************");
        BasePage.closeBrowser();
    }
}
