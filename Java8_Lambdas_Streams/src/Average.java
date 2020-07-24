import java.util.*; 
import java.util.stream.IntStream; 

public class Average{
	 public static void main(String[] args) 
	    {
		 	int a[]= {9,8,7,6,5,4,1,2,3};
	        IntStream stream = IntStream.of(a); 
	        OptionalDouble obj = stream.average(); 
	        if (obj.isPresent()) { 
	            System.out.println(obj.getAsDouble()); 
	        } 
	        else { 
	            System.out.println("-1"); 
	        } 
	    } 

}