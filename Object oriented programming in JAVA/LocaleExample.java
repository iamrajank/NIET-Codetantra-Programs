//Implement the concept of Localization in JAVA programming language
//Read locality name as input (es,fr..)
package q123;
import java.util.*;
import java.util.Scanner;public class LocaleExample {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter name");
		String name = myObj.nextLine();
		Locale locale=new Locale(name,name);
		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getDisplayLanguage());
		System.out.println(locale.getDisplayName());
		System.out.println(locale.getISO3Country()); 
		System.out.println(locale.getISO3Language());
		System.out.println(locale.getLanguage()); 
		System.out.println(locale.getCountry());
	}
}
		
