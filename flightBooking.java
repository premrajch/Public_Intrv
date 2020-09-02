package FlightBooking;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FireFoxDriver;
public class flightBooking {
WebDriver driver;

	public flightBooking() {
		
	}
// launch firefox
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		driver = new FireFoxDriver();
		driver.get("https://blazedemo.com/");
	}
	
	public void searchFligh() throws InterruptedException {
		driver.findElement(By.name("fromPort")).sendKeys("Paris");
		driver.findElement(By.name("toPort")).sendKeys("Buenos Aires");
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		///html/body/div[3]/form/div/input
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("inputName")).sendKeys("Premraj");
		driver.findElement(By.id("address")).sendKeys("Bangalore");
		driver.findElement(By.id("city")).sendKeys("Bengaluru");
		driver.findElement(By.id("state")).sendKeys("Karnataka");
		driver.findElement(By.id("zipCode")).sendKeys("12345");
		driver.findElement(By.id("creditCardNumber")).sendKeys("1234567891234567");
		driver.findElement(By.id("creditCardMonth")).sendKeys("11");
		driver.findElement(By.id("creditCardYear")).sendKeys("2017");
		driver.findElement(By.id("nameOnCard")).sendKeys("Premraj Chaudhary");
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		Thread.sleep(3000);
		///html/body/div[2]/form/div[11]/div/input
		///html/body/div[2]/div/table/tbody/tr[1]/td[2]
		WebElement txnId = driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[1]/td[2]"));
		if(txnId.isDisplayed())
		{
			System.out.println("Transaction ID Came"+txnId);
		}
		else
		{
			System.out.println("Transaction ID Did not Come");
		}
	}
	
	
	
	public void searchSecondPayment() throws InterruptedException {
		driver.findElement(By.name("fromPort")).sendKeys("Paris");
		driver.findElement(By.name("toPort")).sendKeys("Buenos Aires");
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("inputName")).sendKeys("Premraj");
		driver.findElement(By.id("address")).sendKeys("Bangalore");
		driver.findElement(By.id("city")).sendKeys("Bengaluru");
		driver.findElement(By.id("state")).sendKeys("Karnataka");
		driver.findElement(By.id("zipCode")).sendKeys("12345");
		driver.findElement(By.id("cardType")).sendKeys("America Express");
		driver.findElement(By.id("creditCardNumber")).sendKeys("1234567891234567");
		driver.findElement(By.id("creditCardMonth")).sendKeys("11");
		driver.findElement(By.id("creditCardYear")).sendKeys("2017");
		driver.findElement(By.id("nameOnCard")).sendKeys("Premraj Chaudhary");
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		Thread.sleep(3000);
		///html/body/div[2]/form/div[11]/div/input
		///html/body/div[2]/div/table/tbody/tr[1]/td[2]
		WebElement txnId = driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[1]/td[2]"));
		if(txnId.isDisplayed())
		{
			System.out.println("Transaction ID Came"+txnId);
		}
		else
		{
			System.out.println("Transaction ID Did not Come");
		}
	}
	
	
	public void searchThirdPayment() throws InterruptedException {
		driver.findElement(By.name("fromPort")).sendKeys("Paris");
		driver.findElement(By.name("toPort")).sendKeys("Buenos Aires");
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("inputName")).sendKeys("Premraj");
		driver.findElement(By.id("address")).sendKeys("Bangalore");
		driver.findElement(By.id("city")).sendKeys("Bengaluru");
		driver.findElement(By.id("state")).sendKeys("Karnataka");
		driver.findElement(By.id("zipCode")).sendKeys("12345");
		driver.findElement(By.id("cardType")).sendKeys("Diner's Club");
		driver.findElement(By.id("creditCardNumber")).sendKeys("1234567891234567");
		driver.findElement(By.id("creditCardMonth")).sendKeys("11");
		driver.findElement(By.id("creditCardYear")).sendKeys("2017");
		driver.findElement(By.id("nameOnCard")).sendKeys("Premraj Chaudhary");
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		Thread.sleep(3000);
		///html/body/div[2]/form/div[11]/div/input
		///html/body/div[2]/div/table/tbody/tr[1]/td[2]
		WebElement txnId = driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[1]/td[2]"));
		if(txnId.isDisplayed())
		{
			System.out.println("Transaction ID Came"+txnId);
		}
		else
		{
			System.out.println("Transaction ID Did not Come");
		}
	}
	
	public void closebrowser() {
		driver.quit();
	}
	// launch app
	
	//do rest
	public static void main(String[] args) throws InterruptedException {
		flightBooking obj = new flightBooking();
		obj.launchBrowser();
		obj.searchFligh();
		obj.closebrowser();
		obj.launchBrowser();
		obj.searchSecondPayment();
		obj.closebrowser();
		obj.launchBrowser();
		obj.searchThirdPayment();
		obj.closebrowser();
	}

}
