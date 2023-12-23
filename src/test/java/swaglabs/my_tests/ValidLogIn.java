package swaglabs.my_tests;

import swaglabs.functions.MyAccountFun;
import org.testng.annotations.Test;
import swaglabs.utility.BeforeAndAfter;

public class ValidLogIn extends BeforeAndAfter {

    @Test
    public void validLogIn() {

        MyAccountFun.validLogIn(driver,wait);

    }

}
