package testRunner;

import org.openqa.selenium.WebDriver;

import pages.CartPageObject;
import pages.ProductPageObject;

public class CartFunctionTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = Base.getDriver("Chrome");

	Base.successLogin();

		Thread.sleep(3000);

		ProductPageObject pp = new ProductPageObject(driver);
		pp.addingitemtoCart();

		CartPageObject cp = new CartPageObject(driver);
		cp.clickCartButton();
		cp.clickCheckoutButton();

	}

}
