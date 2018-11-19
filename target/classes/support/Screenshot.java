package support;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
    public static void Tirar (WebDriver navegador, String arquivo){
        File screenshot = ((TakesScreenshot)navegador).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(screenshot, new File(arquivo));
        } catch (Exception e){
            System.out.println("houve problema" + e.getMessage());
        }
    }
}