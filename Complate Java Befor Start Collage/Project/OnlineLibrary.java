package project;

class Library
{
	
	String book [] ;
	int numOfBooks;
	
		Library()
		{
			this.book = new String [10];
			numOfBooks=0;
		}	
		
		public void addBook(String book)
		{
			this.book[numOfBooks] = book;
			numOfBooks++;
			System.out.println("This Book Is Added: "+ book);
		}
		
		public void showAvelBooks()
		{
			System.out.println("* Avelabile Books Are: ");
		
			for (String b : this.book)
			{
				if(b==null)
				{
					continue;
				}
				System.out.println("* " + b);
			}
		}
		
		public void isuuedBook(String b)
		{
			for (int i=0; i<this.book.length; i++)
			{
				if(this.book[i].equals(b))
				{
					System.out.println(b+" is Issued!");
					this.book[i]=null;
					return;
				}
			}
			System.out.println("This book does not exsited");
		}
		
		public void returnBook(String b)
		{
			addBook(b);
		}
		
		
}

public class OnlineLibrary
{
		public static void main(String [] args)
	{
		Library myLab = new Library();
		myLab.addBook("Shreemad Bhagawat Geeta");
		myLab.addBook("Ramayan");
		myLab.addBook("Mahabharat");
		myLab.addBook("Life Of Krishna");
		myLab.showAvelBooks();
		myLab.isuuedBook("Ramayan");
		myLab.showAvelBooks();
		myLab.returnBook("Ramayan");
		myLab.showAvelBooks();
		
	}
}