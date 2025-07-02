package JavaBase;

// WHILE LOOP : 

// public class Loops 
// {
//   public static void main(String[] args) 
//   {
//     while(true)
//     {
//       System.out.println("Hi");
//     }
//   }
// }


// public class Loops 
// {
//   public static void main(String[] args) 
//   { 
//     int i = 1;

//     while(i<=4)
//     {
//       System.out.println("Hi");
//       i++;
//     }
//     System.out.println("Bye " + i);
//   }
// }



// NESTED LOOP : 


// public class Loops 
// {
//   public static void main(String[] args) 
//   {
//     int i = 1;
//     while (i<=4)
//     {
//       System.out.println("Hi" + i);

//       int j = 1;
//       while(j<=3)
//       {
//       System.out.println("How r u" + j);
//       j++;
//       }

//       i++;
//     }
//     System.out.println("Bye" + i);
//   } 
  
// }



// DO WHILE : 

// public class Loops 
// {
//   public static void main(String[] args) 
//   {
//     int i = 5;
//     do
//     {
//       System.out.println("Hi" + i);
//       i++;

//     }while(i<=4);
//   }
// }



// FOR LOOP : 


// public class Loops 
// {
//   public static void main(String[] args) 
//   {
//     for(int i=1;i<=5;i++){
//       System.out.println("Hi" + i);
//     }
//   }
// }

// days of a week

public class Loops 
{
  public static void main(String[] args) 
  {
    for(int i=1;i<=7;i++){
      System.out.println("DAY " + i);
      for(int j=1;j<=9;j++){
        System.out.println(" " + (j+8) + " - " + (j+9));
      }
    }
  }
}
