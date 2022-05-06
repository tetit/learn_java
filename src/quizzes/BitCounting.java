package quizzes;

public class BitCounting {
	
	public static int countBits(int n){
		String b ="";
    while (n!=0) {
      if (n%2==0) {
      b += "0";}
      else {
      b += "1";}
      n = n/2;
    }
   
    StringBuilder sb=new StringBuilder(b);  
    sb.reverse();  
    
    try
    {
    	int rez = Integer.parseInt(sb.toString().trim());
    	return rez;

    	
    }
    catch (NumberFormatException nfe)
    {
      System.out.println("NumberFormatException: " + nfe.getMessage());
      return 0;
    }
     
	}
	}
	



