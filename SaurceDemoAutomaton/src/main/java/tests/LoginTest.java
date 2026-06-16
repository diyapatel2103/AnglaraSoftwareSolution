package tests;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    public static void main(String[] args) {

        LoginTest test = new LoginTest();
        test.setup();

        LoginPage login = new LoginPage(test.driver);

        // =========================
        // 1. VALID LOGIN
        // =========================
        System.out.println("===== START: VALID LOGIN =====");
        test.openApp();

        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLogin();

        String url1 = test.driver.getCurrentUrl();

        if (url1.contains("inventory")) {
            System.out.println("VALID LOGIN PASSED ✔ - Login successful");
        } else {
            System.out.println("VALID LOGIN FAILED ✘");
        }

        test.driver.navigate().back();
        System.out.println("===== END: VALID LOGIN =====\n");

        // =========================
        // 2. INVALID LOGIN
        // =========================
        System.out.println("===== START: INVALID LOGIN =====");
        test.openApp();

        login.enterUsername("wrong_user");
        login.enterPassword("wrong_pass");
        login.clickLogin();

        String error1 = login.getErrorMessage();

        if (error1.contains("Username and password do not match")) {
            System.out.println("INVALID LOGIN PASSED ✔ - Error shown: " + error1);
        } else {
            System.out.println("INVALID LOGIN FAILED ✘");
        }

        test.driver.navigate().refresh();
        System.out.println("===== END: INVALID LOGIN =====\n");

        // =========================
        // 3. EMPTY USERNAME
        // =========================
        System.out.println("===== START: EMPTY USERNAME =====");
        test.openApp();

        login.enterUsername("");
        login.enterPassword("secret_sauce");
        login.clickLogin();

        String error2 = login.getErrorMessage();

        if (error2.contains("Username is required")) {
            System.out.println("EMPTY USERNAME PASSED ✔ - Error shown: " + error2);
        } else {
            System.out.println("EMPTY USERNAME FAILED ✘");
        }

        test.driver.navigate().refresh();
        System.out.println("===== END: EMPTY USERNAME =====\n");

        // =========================
        // 4. EMPTY PASSWORD
        // =========================
        System.out.println("===== START: EMPTY PASSWORD =====");
        test.openApp();

        login.enterUsername("standard_user");
        login.enterPassword("");
        login.clickLogin();

        String error3 = login.getErrorMessage();

        if (error3.contains("Password is required")) {
            System.out.println("EMPTY PASSWORD PASSED ✔ - Error shown: " + error3);
        } else {
            System.out.println("EMPTY PASSWORD FAILED ✘");
        }

        System.out.println("===== END: EMPTY PASSWORD =====\n");

        // END
        test.tearDown();
        System.out.println("ALL TEST CASES COMPLETED ✔");
    }
}