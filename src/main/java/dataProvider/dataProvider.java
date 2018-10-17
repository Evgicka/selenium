package dataProvider;

import org.testng.annotations.DataProvider;

public class dataProvider {
    @DataProvider
    public Object[][] simpleDataProvider() {
        return new Object[][]{

                {"String1", 1},
                {"String2", 2},
                {"String3", 3}
        };


    }
}



/*
List <WebElement> headerItem = driver.findElements(By.cssSelector("ui.uui.navigator.nav>li>a:));
assertEquals(headerItem.size(),4);
for (WebElement element : headerItem){
    <>.contains(element.getText);
}
*/