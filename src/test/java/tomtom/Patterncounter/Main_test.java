/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tomtom.Patterncounter;

import com.dnyanshree.PatternCounter.model.InputData;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author dylan
 */
public class Main_test {
    @InjectMocks
	private InputData id;	
	
	@Mock
	private List<String> words;	
	
	private String validInputFile;

  @Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
		validInputFile = "Input";
		words = Arrays.asList("1000","a","big","surprise","2000","hello","is","a","big","surprise");
	}
        	@Before
	
		
	@Test
	public void testValidateChoiceMethodForValidInputChoice() {
		assertEquals(true, id.validateChoice(1));
		assertEquals(true, id.validateChoice(2));
		assertEquals(true, id.validateChoice(3));	
	}
	
	@Test
	public void testGetListOfWords() throws IOException {
		List<String> actual = id.getListOfWords(validInputFile);
		assertEquals(words, actual);
	}
	
	@Test(expected = NullPointerException.class)
	public void testGetListOfWordsMethodException() throws IOException {
		String inputFile="abc";
		Mockito.when(id.getListOfWords(inputFile)).thenThrow(new FileNotFoundException());
	}
	
}
