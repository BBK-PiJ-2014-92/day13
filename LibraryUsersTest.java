import org.junit.*;
import static org.junit.Assert.*;

public class LibraryUsersTest {
	private LibraryUsersImpl test;
	private LibraryUsersImpl test2;

	@Before
	public void buildUp() {
		test = new LibraryUsersImpl("Steve");
	}

	@After
	public void cleanUp() {
		test = null;
	}

	@Test
	public void testGetName() {
		String expected = "Steve";
		assertEquals(test.getName(), expected);
	}

	@Test
	public void testGetLibraryID() {
		int expected = 1;
		assertTrue(test.getID() == expected);
	}

	@Test
	public void testSetLibraryID() {
		test2 = new LibraryUsersImpl("John");
		assertFalse(test.getID() == test.getID());
	}
}
