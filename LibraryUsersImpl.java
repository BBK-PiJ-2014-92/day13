public class LibraryUsersImpl implements LibraryUsers {
	final private String name;
	private int ID;

	public LibraryUsersImpl(String name) {
		this.name = name;
		int hash = HashUtilities.shortHash(name.hashCode());
		setID(hash);
	}

	public String getName(){
		return name;
	}

	public int getID(){
		return ID;
	}

	public void setID(int hash) {
		ID = hash;
	}
}
