package model;

public class BookLibVO {
	private Long booknumber;
	private Long bookisbn;
	private String bookname;
	private String bookmake;
	private String publisher;
	private Long price;
	private String image;
	private String bookintrod;
	public Long getBooknumber() {
		return booknumber;
	}
	public void setBooknumber(Long booknumber) {
		this.booknumber = booknumber;
	}
	public Long getBookisbn() {
		return bookisbn;
	}
	public void setBookisbn(Long bookisbn) {
		this.bookisbn = bookisbn;
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
	@Override
	public String toString() {
		return "BookLibVO [booknumber=" + booknumber + ", bookisbn=" + bookisbn + ", bookname=" + bookname
				+ ", bookmake=" + bookmake + ", publisher=" + publisher + ", price=" + price + ", image=" + image
				+ ", bookintrod=" + bookintrod + "]";
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

	

}
