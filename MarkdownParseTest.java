import static org.junit.Assert.*;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.nio.file.Path;

import org.junit.*;

public class MarkdownParseTest {
    HashMap<String, ArrayList<String>> fileMap = new HashMap<>();
    Path fileName;
    String contents;

    @Before
    public void setUp() {
        fileMap.put("test-file.md", new ArrayList<String>(Arrays.asList("https://something.com", "some-page.html")));
        fileMap.put("test2.md", new ArrayList<String>(Arrays.asList("https://google.com", "some-page.html")));
        fileMap.put("test3.md", new ArrayList<String>(Arrays.asList()));
        fileMap.put("test4.md", new ArrayList<String>(Arrays.asList("https://google.com", "some-page.html")));
    }

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void fail() {
        assertTrue(false);
    }

    @Test
    public void testFile1() throws Exception {
        fileName = Path.of("test-file.md");
	    contents = Files.readString(fileName);
        assertEquals(fileMap.get("test-file.md"), MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile2() throws Exception {
        fileName = Path.of("test2.md");
	    contents = Files.readString(fileName);
        assertEquals(fileMap.get("test2.md"), MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile3() throws Exception {
        fileName = Path.of("test3.md");
	    contents = Files.readString(fileName);
        assertEquals(fileMap.get("test3.md"), MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile4() throws Exception {
        fileName = Path.of("test4.md");
	    contents = Files.readString(fileName);
        assertEquals(fileMap.get("test4.md"), MarkdownParse.getLinks(contents));
    }
}