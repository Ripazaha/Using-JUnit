import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Properties;

import static java.nio.file.Files.readString;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    Employee employee = new Employee();
    protected long id;
    protected String firstName;
    protected String lastName;
    protected String country;
    protected int age;
    String fileName = "new_data.json";

    @BeforeEach
    public void setUp() throws IOException {
        List<Employee> list = Main.jsonToList(readString(Path.of(fileName)));
        try (FileReader fileReader = new FileReader((File) list)) {
            Properties props = new Properties();
            props.load(fileReader);
            id = Long.parseLong(props.getProperty("id"));
            firstName = props.getProperty("firstName");
            lastName = props.getProperty("lastName");
            country = props.getProperty("country");
            age = Integer.parseInt(props.getProperty("age"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void EmployeeIdTest() {
        assertEquals(employee.id, id);
        System.out.println("id");
    }

    @Test
    public void EmployeeFirstNameTest() {
        assertEquals(employee.firstName, firstName);
        System.out.println("fileName");
    }

    @Test
    public void EmployeeLastNameTest() {
        assertEquals(employee.lastName, lastName);
        System.out.println("lastName");
    }

    @Test
    public void EmployeeCountryTest() {
        assertEquals(employee.country, country);
        System.out.println("country");
    }

    @Test
    public void EmployeeAgeTest() {
        assertEquals(employee.age, age);
        System.out.println("age");
    }
}
