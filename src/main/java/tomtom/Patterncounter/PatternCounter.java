/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tomtom.Patterncounter;

import com.dnyanshree.PatternCounter.controller.CountController;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 *Dylan Rychlik 8/31/18
 * TomTom PatternCounter Progam
 * Write a program (source and unit tests) "PatternCounter" that reads an input document from a file (path provided as first command line argument) and calculates the number of occurrences of one of the 3 patterns based on the second command line argument:

1: Counts occurrences of each unique word in the document

2: Counts occurrences of each unique number in the document

3: Counts occurrences of each unique phrase of three consecutive words in the document 

 

 */
public class PatternCounter implements IStandardInput { 
    	
      private static IStandardInput standardInput;
    public static void main(String[] args) throws Exception {
               
	
		
		
                PatternCounter patterncounter = new PatternCounter() {};
			Count_Controller controller = new Count_Controller();
                        
		boolean exit = false;
                while (!exit){

		/*Service call to find and return the distinct pattern*/
		try {
                    //input file 
                      String inputFile = patterncounter.getUserInputs();
                      
                    	List<String> words = patterncounter.getListOfWords(inputFile);
                       //enter the manipulations
                    System.out.println("Please enter which manipulation you would like to perform. \n 1). Find number of unique words. \n 2). Find number of unique numbers "
                            + "\n 3). Find number of Consecutive words. \n 0). exit program");
                    Scanner scanner = new Scanner(System.in);
                    int choice = scanner.nextInt();
   //switch statment to select the inputted option
	switch (choice) {
		case 1: {
                    //call get word method
			controller.getUniqueWordCount(words);
                       
			break;
		}
		case 2:{
                    //call get number method
			controller.getUniqueNumberCount(words);
                         
			break;
		}
		case 3:{
                    //call get phrase method
			controller.getUniqueConsecutive3WordsCount(words);
                        
			break;
		}
                case 0:{
                   exit = true; break;
                }
		default:{
			System.out.println("Please enter a valid option (1, 2 or 3)! Try again!");
			break;
		}
		
		
		}	
		
               
		

		
	}
                 catch (Exception ex){
              System.out.println("Exection when running the program: " + ex);
        }
    }
                }
    

	/**
	 * Iterate and print the results to console one line apart
	 * @param result Map&lt;String,Integer&gt;- The unique item as key and count as number
	 */
	
     public List<String> getListOfWords(String inputFile) throws IOException{
		List<String> lines = new ArrayList<String>();
		List<String> words = new ArrayList<String>();
		 InputStream fis = this.getClass().getClassLoader().getResourceAsStream(inputFile);
		 InputStreamReader isr = new InputStreamReader(fis);
                try (BufferedReader reader = new BufferedReader(isr)) {
                    String line;
                    while ((line = reader.readLine()) != null)
                    {
                        lines.add(line);
                    }   }
	    for(int k=0; k< lines.size(); k++){
	    	String str = lines.get(k).replaceAll("[^A-Za-z0-9]", " ");//replace all punctuation with single space
	    	str = str.replaceAll("[\\n\\t]", "");//replace all new lines and tables with no space
	    	str = str.replaceAll("( )+", " ");//replace all multiple spaces with single space
	    	str = str.trim();//remove spaces before and after line
	    	String[] split = str.split(" ");
	    	for (String s : split) {					
	    		words.add(s);
	    	}
	    }
	    if(words.size()>0)
	    words.remove(words.size()-1);//remove single space added at the end of list of words
	    return words;
	}

    /**
     *
     * @return
     */
            @Override
     public String getUserInputs() {
       //enter input file
         	System.out.println("Please enter the file directory: ");
       String inputs;
		Scanner scanner = new Scanner(System.in);
		inputs = scanner.nextLine();
		
              
		return inputs;
       
    }

}
