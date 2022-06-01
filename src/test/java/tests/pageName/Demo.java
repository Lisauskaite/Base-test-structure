package tests.pageName;

import org.testng.annotations.Test;
import pages.Common;
import tests.BaseTest;

public class Demo  extends BaseTest {

    @Test
    public void openGoogle(){
        Common.openUrl("https://www.google.com");
    }
}
