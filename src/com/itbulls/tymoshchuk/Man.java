package com.itbulls.tymoshchuk;

import java.util.Objects;

public class Man {

	   int dnaCode;
	   String srt;
	   

//	   @Override
//	public int hashCode() {
//		return Objects.hash(dnaCode);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Man other = (Man) obj;
//		return dnaCode == other.dnaCode;
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dnaCode;
		result = prime * result + ((srt == null) ? 0 : srt.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Man other = (Man) obj;
		if (dnaCode != other.dnaCode)
			return false;
		if (srt == null) {
			if (other.srt != null)
				return false;
		} else if (!srt.equals(other.srt))
			return false;
		return true;
	}


	public static void main(String[] args) {

	       Man man1 = new Man();
	       man1.dnaCode = 1111222233;

	       Man man2 = new Man();
	       man2.dnaCode = 1111222233;

	       System.out.println(man1 == man2);
	       System.out.println(man1.dnaCode == man2.dnaCode);
	       System.out.println(man1.equals(man2));
	       
	       String str1 = "Some compare txt";
	       Man str2 = new Man();
	       str2.srt = "Some compare txt";
	       System.out.println(str1.equals(str2));
	       String str3 = new String("Some compare txt");
	       System.out.println(str1.equals(str3));
	   }
	}
