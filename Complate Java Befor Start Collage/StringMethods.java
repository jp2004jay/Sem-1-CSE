package newPackage;
public class StringMethods
{
	public static void main(String [] args)
	{
		String name="Ramani Jay";
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		System.out.println(name.trim());
		//AAJU BAJU NI SPACE REMOVE KARE CHHE. BIJI EK PAN NAHI.
		
		System.out.println(name.substring(3));
		System.out.println(name.substring(3,9));
		
		System.out.println(name.replace('J', 'M'));
		
	}
}