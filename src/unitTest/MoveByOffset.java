package unitTest;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 date : 2019.03.11
 MoveByOffset
 */

public class MoveByOffset {
	private WebDriver driver;
	
	@Before
	  public void setUp()throws Exception{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		  }	
	  
	@Test
	public void test() throws Exception {
		driver.get("file:///E:/Selenium%20WebDriver%20Practical%20Guide/Chapter%202/HTML/Selectable.html");
		WebElement three = driver.findElement(By.name("three"));
		
		System.out.println("X coordinate: " + three.getLocation().getX()
				+ "  Y coordinate: " + three.getLocation().getY());
		Actions builder = new Actions(driver);
		builder.moveByOffset(three.getLocation().getX() + 1, three
				.getLocation().getY() + 1).click();
		builder.perform();
		
		Thread.sleep(2000);
		driver.quit();
		System.out.println("MoveByOffset success");  
	}
	
	@After
    public void tearDown()throws Exception {
		
    }
}