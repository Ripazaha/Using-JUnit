import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

import static java.nio.file.Files.readString;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void readStringTest() throws IOException {
        String fileName = "new_data.json";
        try {
            readString(Path.of(fileName));
            Executable executable = () -> readString(Path.of(fileName));
            assertDoesNotThrow(executable);
            System.out.println("Файл " + fileName + " найден!");
        } catch (NoSuchFileException ignored) {
            System.out.println("Не удалось найти файл " + fileName);
        }
    }
}
