package logic.steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class AuthSteps {

    @Step("I click `Log in` button in the header")
    public AuthSteps iClickLoginBtnInTheHeader() {
        $(".ico-login").click();
        return this;
    }

    @Step("I click `Log out` button in the header")
    public AuthSteps iClickLogoutBtnInTheHeader() {
        $(".ico-logout").click();
        return this;
    }

    @Step("I type email `{email}`")
    public AuthSteps iTypeEmail(String email) {
        $("#Email").setValue(email);
        return this;
    }

    @Step("I type password `{password}`")
    public AuthSteps iTypePassword(String password) {
        $("#Password").setValue(password);
        return this;
    }

    @Step("I click `Log in` button")
    public AuthSteps iClickLoginBtn() {
        $(".login-button").click();
        return this;
    }

    @Step("`Log in` button should be visible in the header")
    public void loginBtnShouldBeVisibleInTheHeader() {
        $(".ico-login").shouldBe(visible);
    }

    @Step("I check Account link is visible")
    public void iCheckAccountLinkIsVisible() {
        $(".ico-account").shouldBe(visible);
    }
}
