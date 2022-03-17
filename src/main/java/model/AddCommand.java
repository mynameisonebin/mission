package model;

public class AddCommand {
	private Long bookisbn;
	private String bookname;
	private String bookmake;
	private String publisher;
	private Long price;
	private String image;
	private String bookintrod;
	private String originalimage;
	
	
	public String getOriginalimage() {
		return originalimage;
	}
	public void setOriginalimage(String originalimage) {
		this.originalimage = originalimage;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookmake() {
		return bookmake;
	}
	public void setBookmake(String bookmake) {
		this.bookmake = bookmake;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getBookintrod() {
		return bookintrod;
	}
	public void setBookintrod(String bookintrod) {
		this.bookintrod = bookintrod;
	}
	public Long getBookisbn() {
		return bookisbn;
	}
	public void setBookisbn(Long bookisbn) {
		this.bookisbn = bookisbn;
	}
	
}
