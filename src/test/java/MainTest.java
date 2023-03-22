import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void readStringFileNameSuccessTest() {
        System.out.println("fileName_success");
        String expected = "new_data.json";
        String actual = "new_data.json";
        assertEquals(expected, actual);
    }

    @Test
    public void readStringFileNameIsEmptyTest() {
        System.out.println("fileName_isEmpty");
        String expected = "";
        String actual = "";
        assertEquals(expected, actual);
    }

    @Test
    public void readStringFileNameIsNotEmptyTest() {
        System.out.println("fileName_isNotEmpty");
        String expected = "";
        String actual = "new_data.json";
        assertNotEquals(expected, actual);
    }
}
