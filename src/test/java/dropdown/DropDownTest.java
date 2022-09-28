package dropdown;

import base.BaseTest;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DropDownTest extends BaseTest {
    @Test
    public void testSelectOption(){
        var dropDownPage = homePage.clickDropDown();
        String option= "Option 1";
        dropDownPage.selectFromDropdown(option);
        var selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
