package com.js.crawler.websites.porn85;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by root on 2017/3/2.
 */
public class Connection {

    public static String getTimeDiff(Date startTime, Date endTime) {
        long executeTime = endTime.getTime() - startTime.getTime();
        return String.format("%d min, %d sec",
                TimeUnit.MILLISECONDS.toMinutes(executeTime),
                TimeUnit.MILLISECONDS.toSeconds(executeTime) -
                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(executeTime))
        );
    }
    public static WebDriver getWebDriver() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setJavascriptEnabled(true);
        caps.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS,"--ignore-ssl-errors=true");
        caps.setCapability(
                PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
                "C:\\phantomjs.exe"
        );
        return new PhantomJSDriver(caps);
    }
}
