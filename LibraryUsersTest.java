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
		System.out.println("Test 1");
		String expected = "Steve";
		assertEquals(test.getName(), expected);
	}

	@Test
	public void testGetLibraryID() {
		System.out.println("Test 2");
		String name = "Steve";
		int expected = HashUtilities.shortHash(name.hashCode());
		assertTrue(test.getID() == expected);
	}

	@Test
	public void testSetLibraryID() {
		System.out.println("Test 3");
		test2 = new LibraryUsersImpl("John");
		assertFalse(test.getID() == test2.getID());
	}
}
