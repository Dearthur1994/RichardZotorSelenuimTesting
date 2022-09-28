package alerts;

import base.BaseTest;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class FileUploadTests extends BaseTest {
    @Test
    public void testFileUpload(){
        var uploadPage= homePage.clickFileUpload();
      uploadPage.uploadFile("D:\\javacourse\\RichardZotorSelenium\\src\\main\\resources\\chromedriver.exe");
//        assertEquals("chromedriver.exe", uploadPage.getUploadedFiles());
    }
}
