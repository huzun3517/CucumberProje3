package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import com.cucumber.listener.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        tags = {"@RegressionTest"},
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        dryRun = false,
        plugin = {
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
                // oluşturalacak raporun yeri ve adı veriliyor.
        }
)
public class ExtendReport extends AbstractTestNGCucumberTests {

    @BeforeClass
    public static void beforeClass() {

    }

    @AfterClass
    public static void afterClass() {
        // ayarlar alındı, cucumber extend reporttan haberi oldu
        Reporter.loadXMLConfig("src/test/java/XMLFiles/ExtendReport.xml");
        Reporter.setSystemInfo("User Name", "Grup 5");
        Reporter.setSystemInfo("Application Name", "AutomationPractice");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setSystemInfo("Ek satır Adı", "Satır açıklaması");
        Reporter.setTestRunnerOutput("Test excetuion Cucumber report");
    }
}