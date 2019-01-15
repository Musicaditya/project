
public class ControlFlow {
	
	public static boolean isLeapYear(int year) {
		
		 boolean flag = false;
	        if(year % 400 == 0)
	        {
	            flag = true;
	        }
	        else if (year % 100 == 0)
	        {
	            flag = false;
	        }
	        else if(year % 4 == 0)
	        {
	            flag = true;
	        }
	        else
	        {
	            flag = false;
	        }
	        if(flag)
	        {
	           return flag;
	        }
	        else
	        {
	           return flag;
	        }
	        
	}
	
	
	
	public static  boolean isPrime(double n) { 
		
		for(int i = 2; i <= Math.sqrt(n); i++)  {
			
			if(n%i == 0)
				return false;
			
		}
		
		return true;
	}
	
	
	public static int Factorial(int n) {
		int fact = 1;
		for(int i = 1; i<= n ; i++) {
			fact  = fact * i;
			
		}
		return fact;
	}
	
	public static boolean isValid(String date) {
		
		int[] leap = {31,29,31,30,31,30,31,31,30,31,30,31};
		int[] nonleap = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		String = 
		int dd = Integer.parseInt(d[0]);
		
		
	}

	public static void main(String[] args){
		
		System.out.println(isLeapYear(1800));
		System.out.println(isPrime(8));
		System.out.println(Factorial(5));
	}
}
	    	
		
			
			
		
	   
	
		
		
	


