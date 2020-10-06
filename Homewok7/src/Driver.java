import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Driver {
	private static final ArrayList<String> String = null;

	public static void main(String[] args) throws FileNotFoundException {
		//Scanners
		Scanner input=new Scanner(new File(System.getProperty("user.dir")+"/src/BibleBooks"));
		Scanner search=new Scanner(System.in);
		
		ArrayList<String> bibleBook=new ArrayList<String>();
		
		
		//Enter Search Term
		System.out.print("Please Enter A Search Term: ");
		String keyword=search.nextLine();
		int counter=0;
		
		//Array Programming
		while(input.hasNext()) {
			bibleBook.add(input.nextLine());
		}
		
		for(int i=0;i<bibleBook.size();i++) {
			if(bibleBook.get(i).contains(keyword)) {
				counter=1;
			}
			else {
				counter=0;
			}
			
			if(counter==1) {
				System.out.println(bibleBook.get(i));
			}
		}
		
		
		while(input.hasNext()) {
			BibleBook a=new BibleBook(input.nextLine());
		}
		
		
		//Close Scanners
		input.close();
		search.close();
	}	
}