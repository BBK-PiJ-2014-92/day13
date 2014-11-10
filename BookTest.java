import org.junit.*;
import static org.junit.Assert.*;

public class BookTest {
	private BookImpl test = new BookImpl("Charles Dickens", "A Tale of Two Cities");

	@Test
	public void testGetAuthor() {
		String expected = "Charles Dickens";
		assertEquals(test.getAuthor(), expected);
	}

	@Test
	public void testGetTitle() {
		String expected = "A Tale of Two Cities";
		assertEquals(test.getTitle(), expected);
	}
}
