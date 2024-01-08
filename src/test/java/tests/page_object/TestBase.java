package tests.page_object;

import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.*;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        browserSize = "1920x1080";
        baseUrl = "https://demoqa.com";
        pageLoadStrategy = "eager";
        remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
    }
}
