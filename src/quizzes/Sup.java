package quizzes;

public class Sup {

	protected void print(){
	      System.out.print("A ");
	   }
	}
	class Sub extends Sup{
	   public void print(){
	      System.out.print("B ");
	   }
	   void print(String s){
	      System.out.print(s);
	   }
	}
	
	

