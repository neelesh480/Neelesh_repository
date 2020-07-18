package createtestFile;

import java.util.function.Consumer;
import java.util.function.Function;

public interface Adder {
    String add(Function<String, String> f);
    void add(Consumer<Integer> f);
}

public class testlamb implements Adder  
{
	@Override
	    public  String add(Function<String, String> f) 
		{
	        return f.apply("Welcome ");
	    }
	 
	    @Override
	    public void add(Consumer<Integer> f) {}

	    String r = adderImpl.add(a -> a + " lambda"); 
	    System.out.println(r);
}			

	
	 
	/*public class AdderImpl implements Adder 
	{
	 
	    
	}
*/

