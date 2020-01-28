package tests;

import base.BaseTest;
import base.SearchDataProvider;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

    @Test(dataProvider = "searchPatternDataProvider", dataProviderClass = SearchDataProvider.class)
    public void searchNoLoginTest(String searchPattern){
        googleSearchPage.enterSearchText(searchPattern);
        googleSearchPage.clickSearchButton();
        Assert.assertTrue(googleSearchPage.isSearchFound(searchPattern));
    }
}