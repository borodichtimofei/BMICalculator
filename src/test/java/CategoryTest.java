import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CategoryTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp (){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void categoryStarvationPositiveTest (){
         /*
        1. Открыть браузер
        2. Перейти по ссылке https://healthunify.com/bmicalculator/
        3. В поле Weight вводим число 40
        4. В поле Height вводим число 170
        4. Нажать Calculate
        5. Проверить, что надпись Your category is Starvation видна
         */
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("40");
        driver.findElement(By.name("ht")).sendKeys("170");
        driver.findElement(By.name("cc")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals("Your category is Starvation", category, "Category does not match");
    }

    @Test
    public void categoryUnderweightPositiveTest (){
         /*
        1. Открыть браузер
        2. Перейти по ссылке https://healthunify.com/bmicalculator/
        3. В поле Weight вводим число 50
        4. В поле Height вводим число 170
        4. Нажать Calculate
        5. Проверить, что надпись Your category is Underweight видна
         */
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("50");
        driver.findElement(By.name("ht")).sendKeys("170");
        driver.findElement(By.name("cc")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals("Your category is Underweight", category, "Category does not match");
    }

    @Test
    public void categoryNormalPositiveTest (){
         /*
        1. Открыть браузер
        2. Перейти по ссылке https://healthunify.com/bmicalculator/
        3. В поле Weight вводим число 60
        4. В поле Height вводим число 170
        4. Нажать Calculate
        5. Проверить, что надпись Your category is Normal видна
         */
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("60");
        driver.findElement(By.name("ht")).sendKeys("170");
        driver.findElement(By.name("cc")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals("Your category is Normal", category, "Category does not match");
    }

    @Test
    public void categoryOverweightPositiveTest (){
         /*
        1. Открыть браузер
        2. Перейти по ссылке https://healthunify.com/bmicalculator/
        3. В поле Weight вводим число 80
        4. В поле Height вводим число 170
        4. Нажать Calculate
        5. Проверить, что надпись Your category is Overweight видна
         */
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("80");
        driver.findElement(By.name("ht")).sendKeys("170");
        driver.findElement(By.name("cc")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals("Your category is Overweight", category, "Category does not match");
    }

    @Test
    public void categoryObesePositiveTest (){
         /*
        1. Открыть браузер
        2. Перейти по ссылке https://healthunify.com/bmicalculator/
        3. В поле Weight вводим число 90
        4. В поле Height вводим число 170
        4. Нажать Calculate
        5. Проверить, что надпись Your category is Obese видна
         */
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("90");
        driver.findElement(By.name("ht")).sendKeys("170");
        driver.findElement(By.name("cc")).click();
        String category = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals("Your category is Obese", category, "Category does not match");
    }

    @AfterMethod
    public void tearDown (){
        driver.quit();
    }


}
