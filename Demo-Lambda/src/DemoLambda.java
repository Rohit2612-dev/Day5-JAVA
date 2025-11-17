
public class DemoLambda {

	public static void main(String[] args) {
		
		int a = 10;
		
		Printable f = () -> {};
	
		//taxable t = (double income) -> {return income * 0.30;};..This is Valid
		
//		taxable t = (income) -> {return income * 0.30;}; //Much shorter then above
		
//		taxable t = income -> {return income * 0.30;}; //Much Shorter
		
//		taxable t = income -> return income * 0.30;  //Error
		
		taxable t = income ->  income * 0.30;  //This one is Best because its more shorter then others.
		
		System.out.println(t.calculateTax(1000));
		
//		joinable j = (String s1, String s2, String s3) -> {return s1+s2+s3;};
		
//		joinable j = ( s1,  s2,  s3) -> {return s1+s2+s3;};
		
//		joinable j =  (s1, s2, s3) -> {return s1+s2+s3;}; 
		
		joinable j =  (s1,  s2,  s3) -> s1+s2+s3;
		
		System.out.println(j.join("Rohit ","Dilip ", "Taksande "));
		
//		Searchable s = (s1) -> {return true;};
		
//		Searchable s = s1 -> {return true;};
//
		Searchable s = s1 -> true;

		System.out.println(s.equals(s));
		
//		lengthable l = (String l1) -> {return l1.length();};
		
		lengthable l = l1 ->  l1.length();
		
		System.out.println(l.length("RagnarLothBrook"));				
	}
}
