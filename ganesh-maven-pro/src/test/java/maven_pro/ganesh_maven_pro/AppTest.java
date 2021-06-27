package maven_pro.ganesh_maven_pro;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	@Test
	public void Launchchrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ant.aliceblueonline.com/");
		driver.manage().window().maximize();
	}
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        System.out.println("hello i am automation tester");
    }
}
