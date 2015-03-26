
public class Non_Fiction extends Book {

	public Non_Fiction(String bookTitle, Double bookPrice) {
		
		super(bookTitle, 0.0);
		setPrice();
		
	}

	@Override
	public void setPrice() {
		this.bookPrice = 37.99;
	}

}
