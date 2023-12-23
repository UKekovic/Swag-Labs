package swaglabs.my_tests;

import swaglabs.functions.MyAccountFun;
import swaglabs.functions.SortingProductsFun;
import org.testng.annotations.Test;
import swaglabs.utility.BeforeAndAfter;


public class SortingProductsTest extends BeforeAndAfter {

    @Test
    public void sortingProducts() throws InterruptedException {


        MyAccountFun.validLogIn(driver,wait);
        SortingProductsFun.sortingProducts(driver);

    }


}
