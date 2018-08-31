/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tomtom.Patterncounter;

import com.dnyanshree.PatternCounter.exception.InvalidChoiceException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author dylan
 */
public class Count_Controller {

	
	//Count the number of words
public Map<String, Integer> getUniqueWordCount(List<String> words) {
    //if there are no words... return null
		if(words == null){
		return null;
	}
	else{
		Map<String, Integer> counts = new HashMap<String,Integer>();
                //count the words and return output
		for(int i=0; i<words.size(); i++){
			if(Character.isLetter(words.get(i).charAt(0))){
				String word = words.get(i);
			Integer count = counts.get(word);
			if(count==null){
				counts.put(word, 1);
			} else {
				counts.put(word, count+1);
			}}
		}
                  System.out.println(counts);
		return counts;
	}
	}
//count the number of integers
	public Map<String, Integer> getUniqueNumberCount(List<String> words) {
		if(words == null){
                       //if there are no numbers... return null
		return null;
	}
	else{
		Map<String, Integer> counts = new HashMap<String,Integer>();
                   //count the words and return output
		for(int i=0; i<words.size(); i++){
			if(Character.isDigit(words.get(i).charAt(0))){
				String word = words.get(i);				
			Integer count = counts.get(word);
			if(count==null){
				counts.put(word, 1);
			} else {
				counts.put(word, count+1);
			}}
		}
                System.out.println(counts);
		return counts;
	}
	}
//count the number of consecective words
	public Map<String, Integer> getUniqueConsecutive3WordsCount(List<String> words) {
		if(words == null){
                       //if there are no Consecutive words... return null
			return null;
		}
		else if(words.size() < 3)
			return null;
		else{

			Map<String, Integer> counts = new HashMap<String,Integer>();
			for(int i=0; i<words.size()-2; i++){
				String phrase = words.get(i) + " " + words.get(i+1) + " " + words.get(i+2);
				Integer count = counts.get(phrase);
				if(count==null){
					counts.put(phrase, 1);
				} else {
					counts.put(phrase, count+1);
				}
			}
                          System.out.println(counts);
			return counts;
		}
	}
        
      
        
	
	
	
	
}
