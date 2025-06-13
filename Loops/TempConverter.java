import java.util.Scanner;
class TempConverter 
{
	public static void main(String[] args) 
	{
		System.out.println("		Temperature Converter			");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temp : ");
		float temp = sc.nextFloat();
		System.out.println("		Unit for Conversion			");
		System.out.println("1.Celsius");
		System.out.println("2.Kelvin");
		System.out.println("3.fahrenheit");
		System.out.print("choose option for unit : ");
		int unit = sc.nextInt();
		switch (unit)
		{
		case 1:{
			float kelvin = temp + 273.15f;
			float fahrenheit = (temp * 1.8f)+32;
			System.out.println(temp+" degree celsius is "+kelvin+" degree kelvin & "+fahrenheit+" degree fahrenheit.");
			break;
		}
		
		case 2:{
			float celsius = temp - 273.15f;
			float fahrenheit = (temp - 273.15f)*1.8f+32;
			System.out.println(temp+" degree kelvin is "+celsius+" degree celsius & "+fahrenheit+" degree fahrenheit.");
			break;
		}
		
		case 3:{
			float celsius = (temp - 32)*5/9f;
			float kelvin = (temp - 32)*5/9f+273.15f;
			System.out.println(temp+" degree fahrenheit is "+celsius+" degree celsius & "+kelvin+" degree kelvin.");
			break;
		}
		default :
		{
			System.out.println("Invalid Option");
			break;
		}
		}
	}
}