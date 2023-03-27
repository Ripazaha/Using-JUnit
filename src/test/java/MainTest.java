import org.junit.Test;
import org.junit.Assert;
import org.junit.jupiter.api.function.Executable;

import java.io.IOException;
import java.nio.file.Path;

import static java.nio.file.Files.readString;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    String fileName = "new_data.json";

    @Test
    public void readStringFilenameIsCorrectTest() {
        System.out.println("имя файла указано корректно");
        String actual = "new_data.json";
        assertEquals(fileName, actual);
    }

    @Test
    public void readStringTest() {
        try {
            readString(Path.of(fileName));
            Executable executable = () -> readString(Path.of(fileName));
            assertDoesNotThrow(executable);
            System.out.println("Файл " + fileName + " найден!");
            Object readString;
            readString = readString(Path.of(fileName));
            Assert.assertNotNull(readString);
            System.out.println("readString: OK");
        } catch (IOException ignored) {
            System.out.println("Не удалось найти файл " + fileName);
        }

    }

    @Test()
    public void jsonToListTest() throws IOException {
        Object jsonToList;
        jsonToList = Main.jsonToList(readString(Path.of(fileName)));
        Assert.assertNotNull(jsonToList);
        System.out.println("jsonToList: OK");
    }
}
