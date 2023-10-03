package booksorter;


public class Book implements Comparable<Book>{
	private String bookTitle;
	private int numberOfPages;
	private String authorName;
	private String publicationDate;
	public Book(String bookTitle, int numberOfPages, String authorName, String publicationDate) {
		this.bookTitle = bookTitle;
		this.numberOfPages = numberOfPages;
		this.authorName = authorName;
		this.publicationDate = publicationDate;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	@Override
	    public int compareTo(Book book) {
	        return this.getAuthorName().compareTo(book.getAuthorName());
	    }
	
	
	
}
