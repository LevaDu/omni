import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSample {
    public static void main(String[] args) {

        System.out.println("正在启动谷歌浏览器");
//        System.setProperty("webdriver.gecko.driver","usr/bin");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com");
        System.out.println("启动谷歌浏览器成功");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='kw']")).sendKeys("你好");
        driver.findElement(By.xpath("//*[@id=\"su\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"1\"]/h3/a")).click();

    }
}
