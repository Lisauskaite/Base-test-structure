package tests;

import org.testng.annotations.Test;
import pages.Common;
import utils.Driver;

public class Demo  extends BaseTest{

    @Test
    public void openGoogle(){
        Common.openUrl("https://www.google.com");
    }
}
