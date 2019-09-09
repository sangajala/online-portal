package starter.inbox;

import org.openqa.selenium.By;

public class InboxLocators {

    static By FEEDTEXT = By.id("message");
    static By START = By.xpath("//button[text()='Start']");
    static By LASTFEED = By.xpath("//div[@ng-bind-html='feed.LastMessage.Text']");
}
