package swaglabs.my_tests;

import org.testng.annotations.Test;
import swaglabs.functions.MyAccountFun;
import swaglabs.utility.BeforeAndAfter;



public class LogInWithEmptyUserNameField extends BeforeAndAfter {

    @Test
    public void LogInWithEmptyUserName() throws InterruptedException {

        MyAccountFun.LogInWithEmptyUserNameField(driver);


    }

}
