package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_9bqbl508i4_e&adgrpid=60612964962&hvpone=&hvptwo=&hvadid=486380734071&hvpos=&hvnetw=g&hvrand=8970823447197610309&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007810&hvtargid=kwd-296458777401&hydadcr=14454_2154375&gclid=CjwKCAjw9-KTBhBcEiwAr19ig8_4QAhsCOQ-6Ps9LFi57CYrFOMGm4qnMYh1h--vsUnEQnj3Hf-J-BoCJ64QAvD_BwE");
		driver.findElement(By.xpath("//a[text()='Fashion']")).click();
	}

}
