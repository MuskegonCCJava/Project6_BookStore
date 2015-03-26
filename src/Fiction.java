
public class Fiction extends Book {

	public Fiction(String bookTitle, Double bookPrice) {
		
		super(bookTitle, 0.0);
		setPrice();
		
	}

	@Override
	public void setPrice() {
		this.bookPrice = 24.99;
		
	}
	
	
	

}
