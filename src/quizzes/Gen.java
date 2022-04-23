package quizzes;

import java.util.*;

public class Gen {

	public static void main(String[] args) {
		Map<Key, Child> cmap = new HashMap<Key, Child>();
		 
	      cmap.put(new Key(3), new Child("Reka"));
	      System.out.print(cmap.size()+" ");
	      
	      cmap.put(new Key(2), new Child("Buddhika"));
	      System.out.print(cmap.size()+" ");
	      cmap.put(new Key(5), new Child("Piumi"));
	      System.out.print(cmap.size()+" ");
	      cmap.put(new Key(8), new Child("Silva"));
	      System.out.print(cmap.size()+" ");
	      cmap.put(new Key(2), new Child("Livera"));
	 
	      System.out.print(cmap.size()+" ");
	      System.out.print(cmap.get(new Key(2)));
	   }
	}
	 
	class Child{
	   String name;
	   Child(String s){
	      name = s;
	   }
	 
	   public String toString(){
	      return name;
	   }
	}
	class Key{
	   int id;
	   Key(int i){ id = i; }
	   public int hashCode(){
	      return id%10;
	   }
	   public boolean equals(Object o){
	      if((o instanceof Key) && ((Key)o).id == id)
	      return true;
	      else
	      return false;
	   }
	   public String toString(){
	      return ("key " + id + " :");
	   }
	}