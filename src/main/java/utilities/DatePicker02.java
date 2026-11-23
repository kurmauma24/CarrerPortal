package utilities;

import java.time.Duration;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker02 {

    private static final By ACTIVE_CALENDAR = By.cssSelector("div.xdsoft_datetimepicker[style*='display: block']");
    private static final By MONTH_LABEL     = By.cssSelector(".xdsoft_month span");
    private static final By YEAR_LABEL      = By.cssSelector(".xdsoft_year span");
    private static final By NEXT_BUTTON     = By.cssSelector("button.xdsoft_next");
    private static final By PREV_BUTTON     = By.cssSelector("button.xdsoft_prev");

    public static void selectDate(WebDriver driver, String fieldLabel, String day, String month, String year) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // 1. Click the input box below the given label to open its calendar
        By inputLocator = By.xpath("//label[contains(normalize-space(),'" + fieldLabel + "')]/following::input[1]");
        wait.until(ExpectedConditions.elementToBeClickable(inputLocator)).click();

        // 2. Wait for the open calendar popup
        WebElement calendar = wait.until(ExpectedConditions.visibilityOfElementLocated(ACTIVE_CALENDAR));

        // 3. Parse target Month & Year so we know whether to move forward or backward
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM yyyy", Locale.ENGLISH);
        YearMonth targetYM = YearMonth.parse(month + " " + year, formatter);

        while (true) {
            String currentMonth = calendar.findElement(MONTH_LABEL).getText().trim();
            String currentYear  = calendar.findElement(YEAR_LABEL).getText().trim();
            YearMonth currentYM = YearMonth.parse(currentMonth + " " + currentYear, formatter);

            if (currentYM.equals(targetYM)) {
                break; // Reached exact month and year
            } else if (targetYM.isBefore(currentYM)) {
                calendar.findElement(PREV_BUTTON).click(); // Move backward for past dates
            } else {
                calendar.findElement(NEXT_BUTTON).click(); // Move forward for future dates
            }
        }		

        // 4. Click the specific day inside the active month
        By dayLocator = By.cssSelector("td.xdsoft_date:not(.xdsoft_other_month)[data-date='" + day + "']");
        calendar.findElement(dayLocator).click();
    }
}