package org.string;

public class String0 {
	
	public static void main(String[] args) {
		String s = "manikandan";
		
		System.out.println(s);        //1.to print the string
		
		int le =s.length();           //2.to print the length of the string
		System.out.println(le);
		
		String up =s.toUpperCase();   //3.to convert the string in upper case
		System.out.println(up);
		
		String lo=s.toLowerCase();    //4.to convert the string in lower case
		System.out.println(lo);
		
		boolean b=s.startsWith("man"); //5.to check the string with startwith
		System.out.println(b);
		
		boolean b1=s.endsWith("dan");  //6.to check the string with endswith
		System.out.println(b1);
		
		boolean b2=s.contains("s");    //7.to check the string with contains 
		System.out.println(b2);
		
		int i=s.indexOf("k");          //8.to find the string with particular index of string
		System.out.println(i);
		
		int li=s.lastIndexOf("n");     //9.to find the string with last index
		System.out.println(li);
		
		char c=s.charAt(5);            //10.to fetch the particular index of string
		System.out.println(c);
		
		String s1 = "MANIKANDAN";      
		
		boolean b3=s.equals(s1);       //11.to check the two strings are equal
		System.out.println(b3);
		         //or
		System.out.println(s.equals(s1));
		         //or
		System.out.println(s==s1);
		
		boolean b4=s.equalsIgnoreCase(s1); //12.to check the two strings with ignoring case
		System.out.println(b4);
		
		String con=s.concat(s1);           //13.to join the two strings
		System.out.println(con);
		
		String s2= "";
		
		boolean b5=s2.isEmpty();            //14.to check whether the string is empty or not
		System.out.println(b5);
		
		String s3 = "Hai welcome java is a simple programming launguage";
		
		String sub=s3.substring(4, 11);     //15.to fetch the string from particular index to particular index
		System.out.println(sub);
		
		String sub1=s3.substring(5);         //16.to fetch the string from particular index
		System.out.println(sub1);
		
		System.out.println(System.identityHashCode(s));    //17.ImmutableString(Variable.concat();)
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		String s4=s.concat(s3);
		System.out.println(System.identityHashCode(s4));
		
		StringBuffer s5=new StringBuffer("Hai");            //18. MutableString(Varible.append();)
		StringBuffer s6=new StringBuffer("Manikandan");
		System.out.println("Mutable String");
		System.out.println(System.identityHashCode(s5));
		System.out.println(System.identityHashCode(s6));
		StringBuffer s7=s5.append(s6);
		System.out.println(s7);
		System.out.println(System.identityHashCode(s7));
		
		
	}
	
}

