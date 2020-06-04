//Michael Jay Marajas
//COP 2805C
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Slogans extends Thread{

	
	Scanner quotes = null;
	//Initialize an ArrayList for the Quotes from the file
	ArrayList<String> quoteList = new ArrayList<String>();
	//Used to create RNG element
	private Random randomGenerator = new Random();
	//Every Thread has a run() class to be called on in the main
	public void run() {
		try {
			//Scanner to scan the file
			 quotes = new Scanner(new File("C:\\Users\\steel\\eclipse-workspace\\Random Quote Generator\\src\\quotes.txt"));
		
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//While loop that adds the read quotes to the ArrayList
		while (quotes.hasNextLine()) {
			if (quotes.hasNextLine()) quoteList.add(quotes.nextLine());
			else quotes.next();
		}
		//Algorithm to print out a random quote
		int index = randomGenerator.nextInt(quoteList.size());
        String item = quoteList.get(index);
        System.out.println(item);
	
			
		
		}
	}
