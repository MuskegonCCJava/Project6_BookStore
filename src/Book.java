
public abstract class Book {
	
	String bookTitle = null;
	Double bookPrice = null;
	
	public Book(String bookTitle, Double bookPrice)
	{
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
	}
	
	public String getbookTitle(){
		
		return bookTitle;
	}
	
	public Double getbookPrice(){
		
		return bookPrice;
	}
	
	public abstract void setPrice();
	
}


