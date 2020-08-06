import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class POM {
    public static AndroidDriver androidDriver;
    public static WebDriver webDriver;

    private static final String cancelGoogleSignIn = "com.google.android.gms:id/cancel";

    private static final String accountNav = "com.offerup:id/nav_profile";
    private static final String loginWithEmailButton = "com.offerup:id/email_button";
    private static final String loginWithGoogleButton = "com.offerup:id/google_signin_button";
    private static final String loginActionButton = "com.offerup:id/action_button";



    // post photo elements
    private static final String postNav = "com.offerup:id/nav_post_item";

    private static final String selectPhotoButton = "com.offerup:id/addPhotoFromGallery";
    private static final String openGalleryButton = "com.offerup:id/albums_icon";
    private static final String selectAllPhotos = "com.offerup:id/reorder_image_view";
    private static final String selectImageCircle = "com.offerup:id/circle";
    private static final String selectImageDone = "com.offerup:id/done";

    private static final String titleTextField = "com.offerup:id/edit_text_container";
    private static final String nextButton = "com.offerup:id/footer_button";
    private static final String seeMoreButton = "com.offerup:id/see_more";
    private static final String firstCategory = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[1]";

    private static final String verifyOK = "com.offerup:id/dialog_pos_button";

    private static final String priceTextField = "com.offerup:id/edit_text_container";

    private static final String editLocationButton = "com.offerup:id/end_text";
    private static final String zipTextField = "com.offerup:id/edit_text_container";
    private static final String saveLocationButton = "com.offerup:id/saveLocation";


    public POM(String deviceName) throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("appPackage", "com.offerup");
        capabilities.setCapability("appActivity", "com.offerup.android.splash.SplashActivity");
        capabilities.setCapability("systemPort", "8000");
        capabilities.setCapability("autoGrantPermissions", "true");
//        capabilities.setCapability("app", System.getProperty("user.dir")+"\\app.apk");
//        capabilities.setCapability("fullReset", "true");
        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//        Thread.sleep(5000);
    }

    public void login(String email, String password) throws InterruptedException {
        waitFor(accountNav);
        androidDriver.findElementById(accountNav).click();
        waitFor(loginWithEmailButton);
        androidDriver.findElementById(loginWithEmailButton).click();

        Actions a = new Actions(androidDriver);
        a.sendKeys(email);
        a.perform();
        submit();
        waitFor(loginActionButton);
        a.sendKeys(password);
        a.perform();
        hideKeyboard();
        androidDriver.findElementById(loginActionButton).click();
    }

    public void post(String title, String price, String zip, String category) throws InterruptedException {
        Actions a = new Actions(androidDriver);
        waitFor(postNav);
        androidDriver.findElementById(postNav).click();
        waitFor(selectPhotoButton);
        androidDriver.findElementById(selectPhotoButton).click();
        waitFor(openGalleryButton);
        androidDriver.findElementById(openGalleryButton).click();
        androidDriver.findElementById(selectAllPhotos).click();
        androidDriver.findElementById(selectImageCircle).click();
        androidDriver.findElementById(selectImageDone).click();

        waitFor(titleTextField);
        androidDriver.findElementById(titleTextField).click();
        a.sendKeys(title);
        a.perform();
        hideKeyboard();
        androidDriver.findElementById(nextButton).click();

        waitFor(seeMoreButton);
        androidDriver.findElementById(seeMoreButton).click();
        waitForXPath(firstCategory);
        selectElementWithText(category).click();
        androidDriver.findElementById(nextButton).click();
        if (isVisible(verifyOK))
            androidDriver.findElementById(verifyOK).click();
        androidDriver.findElementById(nextButton).click();

        waitFor(priceTextField);
        androidDriver.findElementById(priceTextField).click();
        a.sendKeys(price);
        a.perform();
        hideKeyboard();
        androidDriver.findElementById(nextButton).click();

        waitFor(editLocationButton);
        androidDriver.findElementById(editLocationButton).click();
        waitFor(zipTextField);
        androidDriver.findElementById(zipTextField).click();
        a.sendKeys(zip);
        a.perform();
        hideKeyboard();
        androidDriver.findElementById(saveLocationButton).click();
        waitFor(nextButton);
        androidDriver.findElementById(nextButton).click();

        waitFor(nextButton);
        androidDriver.findElementById(nextButton).click();

        Thread.sleep(2000);
        waitFor(nextButton);
        androidDriver.findElementById(nextButton).click();
    }

    public void pushFile(String filename) throws IOException {
        androidDriver.pushFile("/sdcard/Download/"+filename, new File(filename));
    }

    private WebElement selectElementWithText(String text) {
        WebElement ele = androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\""+text+"\").instance(0))");
        return ele;
    }

    private boolean isVisible(String ele) {
        if(androidDriver.findElementsById(ele).size() > 0) return true;
        return false;
    }

    private void hideKeyboard() {
        if (androidDriver.isKeyboardShown())
            androidDriver.navigate().back();
    }

    private void waitFor(String ele) {
        while (androidDriver.findElementsById(ele).size() == 0);
    }

    private void waitForXPath(String ele) {
        while (androidDriver.findElementsByXPath(ele).size() == 0);
    }

    private void submit() {
        androidDriver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "Go"));
    }
}
