package tutorial.selenium;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WaitTest {
    private static WebDriver wb;
    
    @BeforeClass
    public void setUpDriver() {
	System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
	wb=new FirefoxDriver();
    }
    
    @Test
    public void test() {
	wb.get("https://www.expedia.com/");
	WebElement hotelTab_ = wb.findElement(By.xpath("//span[@class='tab-label' and contains(text(), 'Hotel')]"));
	/*WebDriverWait wait = new WebDriverWait(wb, 100);	
	Function<WebDriver, WebElement> isTrue =  wb->{
	    return ExpectedConditions.visibilityOf(hotelTab_).apply(wb);
	};
	wait.until(isTrue);
	
	Wait<WebDriver> waitFluent = new FluentWait<WebDriver>(wb)
		.withTimeout(10, TimeUnit.SECONDS)
		.pollingEvery(250, TimeUnit.MILLISECONDS)
		.ignoring(NoSuchElementException.class);
	Function<WebDriver, WebElement> isTrue =  wb->{
	    return ExpectedConditions.visibilityOf(hotelTab_).apply(wb);
	};
	waitFluent.until(isTrue);
	
	hotelTab_.click();*/
    }
}
