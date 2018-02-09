package fi.haagahelia.BookStore.domain;


public class Book {
	private String title;
	private String author;
	private Integer year;
	private Long isbn;
	private Double price;
	
	public Book (String title, String author,Integer year, long isbn, double price) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.isbn = isbn;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}
	
	public long getIsbn() {
		return isbn;
	}
	
	public double getPrice() {
		return price;
	}

	public void setTitle(String title) {
	    this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

}
