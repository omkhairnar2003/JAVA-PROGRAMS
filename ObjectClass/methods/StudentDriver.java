package ObjectClass.methods;

public class StudentDriver {
public static void main(String[] args) {
	Student s1=new Student("Raju","FC college",1234,"BE","IT");
	System.out.println(s1);
	System.out.println(s1.toString());
	
	Student s2=new Student("Rani","MC college",3456,"B.TECH","CS");
	System.out.println(s2);
}
}
