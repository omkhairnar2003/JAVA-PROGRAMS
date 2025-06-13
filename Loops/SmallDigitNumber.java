class SmallDigitNumber
{
  public static void main(String[] args) 
  {
    int num= 8629883;
    int min= 9;

    for(int i=num; i>0; i/=10)
    {
      int dgt=i%10;
      if(min > dgt)
      {
        min=dgt;
      }
    }
      System.out.println("Smallest dgt from "+num +" is "+min);
    }
}