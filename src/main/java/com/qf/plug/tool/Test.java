package com.qf.plug.tool;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Test {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.chrome.driver";
        String value = "C:/Users/qinfei/AppData/Local/Google/Chrome/Application/chromedriver.exe";
        System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://frontier.beij.95306.cn/gateway/hydzsw/Dzsw/login_bur.jsp");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("j_username")).sendKeys("3031067");
		driver.findElement(By.id(" j_password")).sendKeys("123456");
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.findElement(By.id("hid869")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("cid3828")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.switchTo().frame("navTab");
		driver.switchTo().frame("xq1");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("keyword")).sendKeys("201611PY360232");
		Thread.sleep(5000);
		driver.findElements(By.className("ac_results")).get(0).click();
		driver.findElement(By.id("dddxtz")).click();
		driver.findElement(By.id("qqds")).clear();
		driver.findElement(By.id("qqds")).sendKeys("180");
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.className("ui-button-text")).click();
		Thread.sleep(5000);
//		driver.switchTo().defaultContent();
//		driver.switchTo().frame("navTab");
		((JavascriptExecutor) driver).executeScript("$('.content').css('overflow-y','auto').parent('body').css('overflow','hidden')"); 
		((JavascriptExecutor) driver).executeScript("$('.content').scrollTop(500)"); 
//		driver.switchTo().frame("xq1");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.id("cb_grid")).click();
		driver.findElement(By.cssSelector("span.ui-icon.reportbtn")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("rdAgree")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("button.ui-button.ui-widget.ui-state-default.ui-corner-all.ui-button-text-only")).click();
		driver.switchTo().defaultContent();
	}
    private void pageTest(){
//    	String driver="webdriver.chrome.driver";
//        String value = "C:/Users/qinfei/AppData/Local/Google/Chrome/Application/chromedriver.exe";
//        System.setProperty(pjson.getString("driver"), pjson.getString("driverPath"));
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://frontier.beij.95306.cn/gateway/hydzsw/Dzsw/login_bur.jsp");
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		3031067
//		123456
//		driver.findElement(By.id("j_username")).sendKeys(pjson.getString("username"));
//		driver.findElement(By.id(" j_password")).sendKeys(pjson.getString("password"));
//		String img=downloadPicture("https://frontier.beij.95306.cn/gateway/hydzsw/Dzsw/security/jcaptcha.jpg");
//		WebElement element=driver.findElement(By.id("captchaImage"));
//		String img=realPath()+"image.jpg";
//		try {
//			screenShotForElement(driver,element,img);
//			ClearImageHelper.cleanImage(new File(img), realPath());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		Runtime rt = Runtime.getRuntime();
//        try {
//			rt.exec("cmd.exe /C  "+pjson.getString("ocr")+" "+img.substring(1)+"  "+realPath().substring(1)+"image -1 ");
//			Thread.sleep(1000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//        String sign=readFile(realPath()+"image.txt");
//        new File(img).delete();
//        new File(realPath()+"image.txt").delete();
//		driver.findElement(By.id("j_captcha")).sendKeys(sign.replace(" ", ""));
//		driver.findElement(By.className("a1")).click();
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		Alert al=driver.switchTo().alert();
//		if(al!=null){
//			al.accept();
//		}
//        
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.id("hid869")).click();
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		driver.findElement(By.id("cid3828")).click();
//		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//		driver.switchTo().frame("navTab");
//		driver.switchTo().frame("xq1");
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		driver.findElement(By.id("keyword")).sendKeys("201611PY360232");
//		driver.findElement(By.id("dddxtz")).click();
//		driver.findElements(By.className("ac_results")).get(0).click();
//		driver.findElement(By.id("qqds")).clear();
//		driver.findElement(By.id("qqds")).sendKeys("180");
//		driver.findElement(By.id("submitBtn")).click();
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		driver.findElement(By.className("ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only")).click();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.findElement(By.id("cb_grid")).click();
//		driver.findElement(By.className("ui-icon reportbtn")).click();
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		driver.findElement(By.id("rdAgree")).click();
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		driver.findElement(By.className("ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only")).click();
//		driver.switchTo().defaultContent();
    }
}
