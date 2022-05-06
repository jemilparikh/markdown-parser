import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class MarkdownParseTest {


    @Test
    public void testMarkdownParseFile1() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        assertEquals("[https://something.com, some-thing.html]", MarkdownParse.getLinks(content).toString());
    }

    @Test
    public void testMarkdownParseFile2() throws IOException {
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        assertEquals("[www.google.com, students.ucsd.edu]", MarkdownParse.getLinks(content).toString());
    }

    @Test
    public void testMarkdownParseFile3() throws IOException {
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        assertEquals("[]", MarkdownParse.getLinks(content).toString());
    }    

    @Test
    public void testMarkdownParseFile4() throws IOException {
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        assertEquals("[]", MarkdownParse.getLinks(content).toString());
    } 
}
