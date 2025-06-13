import java.util.Scanner;
class PhonePin
{
	public static void main(String[] args) throws InterruptedException
  {
    Scanner sc = new Scanner(System.in);
    int storePin=143;
    int seconds=5000;

    outerloop:
    for(; ;)
    {
      int attempts=3;
      do{
        System.out.println("enter your pin ");
        int pin=sc.nextInt();
        if(storePin==pin)
        {
          System.out.println("PHONE UNLOCK");
          break outerloop;
        }
        else{
          System.out.println("wrong pin");
          System.out.println("attempts left"+(attempts -1));
        }
        attempts--;
      }
      while(attempts>=1);

      System.out.println();
      System.out.println("PHONE IS DISABLED FOR"+(seconds/1000)+"seconds");
      Thread.sleep(seconds);
      seconds *=2;
      System.out.println();
      }
   }
}
    