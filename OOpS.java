

class Calculator
{
  int args;
 public int add(int n1,int n2)
 {
  int  r = n1 + n2;
  return r;
 }
  
}
public class OOpS {
  public static void main(String args[])
  {
    int num1 = 4;
    int num2 = 5;
    
    // int result =num1 + num2;

    Calculator calc = new Calculator();
    int result = calc.add(num1,num2);
    System.out.println(result);


  }

  
}

