package ObjectClass.methods;

public class Student //toString()
{
	String name;
	String college;
	int roll;
	String degree;
	String stream;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name,String college,int roll,String degree,String stream)
	{
		super();
		this.name=name;
		this.college=college;
		this.roll=roll;
		this.degree=degree;
		this.stream=stream;
	}
	public String toString()
	{
		return "name "+name+" college "+college+" roll "+roll+" degree "+degree+" stream "+stream;
	}
}
