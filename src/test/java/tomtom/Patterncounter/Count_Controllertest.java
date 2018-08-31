package tomtom.Patterncounter;


import java.io.FileNotFoundException;
import java.io.IOException;
import static java.util.Collections.list;
import java.util.List;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tomtom.Patterncounter.Count_Controller;
import tomtom.Patterncounter.Display;


@Controller

   @RunWith(SpringJUnit4ClassRunner.class)
public class Count_Controllertest {
     
	
	
	
        @InjectMocks
	private Count_Controller cc= new Count_Controller();;	
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
			
	}
	@Test
	public void testGetUniqueWordCount( List<String> list){		
            
				
		cc.getUniqueNumberCount(list);
	}
	
	@Test
	public void testGetUniqueNumberCount(List<String> list){
                  
				
		cc.getUniqueNumberCount(list);
		
	}
	
	@Test
	public void testGetUniqueConsecutive3WordsCount(List<String> list){
                 	
		cc.getUniqueConsecutive3WordsCount(list);
		
	}
	
	
    
}
