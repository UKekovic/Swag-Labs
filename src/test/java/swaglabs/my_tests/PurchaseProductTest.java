package swaglabs.my_tests;

import swaglabs.functions.AddProductToCartFun;
import swaglabs.functions.MyAccountFun;
import swaglabs.functions.PaymentInformationFun;
import swaglabs.functions.PersonalDataFun;
import org.testng.annotations.Test;
import swaglabs.utility.BeforeAndAfter;

public class PurchaseProductTest extends BeforeAndAfter {

    @Test
    public void purchaseProduct() throws InterruptedException {


        MyAccountFun.validLogIn(driver,wait);
        AddProductToCartFun.addToCart(driver,wait);
        PersonalDataFun.PersonalData(driver,wait);
        PaymentInformationFun.PaymentInformation(driver,wait);

    }

}
