package myProject.practicle.extendSsuperVSthis;

public class B extends A {
	
	 B(){
	        this(""); // вызов кон�?тр�?ктора �? одним арг�?ментом кла�?�?а B
	        System.out.println("Кон�?тр�?ктор без арг�?ментов кла�?�?а B");
	    }

	   B(String args){
	        super(""); // вызов кон�?тр�?ктора �? одним арг�?ментом кла�?�?а A
	        System.out.println("Кон�?тр�?ктор �? одним арг�?ментом кла�?�?а B");
	    }

}
