import java.util.Date;

//	Main_BS.java by Kyle Wolff and Brandon VanderMey on 3/24/2015

public class Main_BS
{
	public static void main(String[] args)
	{
		
		
		Fiction fictionBook = new Fiction("Harry Potter", null);
		String title = fictionBook.getbookTitle();
		Double price = fictionBook.getbookPrice();
		
		Non_Fiction nonFictionBook = new Non_Fiction("Into the Dark", null);
		String title2 = nonFictionBook.getbookTitle();
		Double price2 =nonFictionBook.getbookPrice();
		
		Date today = new Date();
		
		System.out.println("Main_BS by Kyle Wolff and Brandon VanderMey. " + today);
		
		System.out.println("\nBook title is: " + title + ". "+ " Book price is: " + price + ".");
		
		System.out.println("Book title is: " + title2 + ". "+ " Book price is: " + price2 + ".");

		
	}
}
