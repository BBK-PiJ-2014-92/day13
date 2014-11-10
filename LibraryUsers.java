/**
 * Class LibraryUsers contains getters for
 * name and libraryID, and contains a setter
 * for lirbaryID.
 */
public interface LibraryUsers {
	/**
	 * Returns value of name
	 * @return the stored String in the field name
	 */
	public String getName();
	/**
	 * Returns the value of the libraryID
	 * @return the stored int in the field libraryID
	 */
	public int getID();
	/**
	 * Sets an integer to the field libraryID
	 * @param ID, the unique ID given to each user
	 */
	public void setID(int hash);
}

