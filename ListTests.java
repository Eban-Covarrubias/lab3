import static org.junit.Assert.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;




public class ListTests{


    @Test 
    public void testfilter(){

    List<String> input1 = new ArrayList<String>();
    input1.add("Hello");
    input1.add("World");
    input1.add("Java");

    StringChecker sc = new StringChecker();
    List<String> output = ListExamples.filter(input1, sc);
    assertEquals(input1, output);
	}

}