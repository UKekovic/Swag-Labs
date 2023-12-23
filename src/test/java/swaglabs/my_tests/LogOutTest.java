package swaglabs.my_tests;

import swaglabs.functions.MyAccountFun;
import org.testng.annotations.Test;
import swaglabs.utility.BeforeAndAfter;

public class LogOutTest extends BeforeAndAfter {

    @Test
    public void logOut() throws InterruptedException {

        MyAccountFun.validLogIn(driver,wait);
        MyAccountFun.LogOut(driver,wait);


    }

}
