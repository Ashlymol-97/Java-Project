// Program to check if then given number is Odd or Even
  // Write a java program using do while loop


// public class Assignmentday2
//  {
//   public static void main (String[] args)
//   {
//     int n = 4;
//     int i =1;
//     do
//     {
//       if ((n % 2 == 0)) 
//       {
//         System.out.println("Num is even");
//       }
//       else 
//       {
//         System.out.println("Num is odd");
  
//       }
//       i++;

      
    
//     } while (i<=1);
    
//   }
  
// }



// Program to check if then given number is positive or negative
//  Write a java program using for loop

// public class Assignmentday2 
// {
//   public static void main(String[] args) {
//     int n=0;
//     for(int i=0;i<1;i++){
//       if(n>0){
//         System.out.println("Num is positive " +n);

//       }
//       else if(n<0){
//         System.out.println("Num is negative " +n);

//       }
//       else{
//         System.out.println("Num is Zero " +n);

//       }
//     }
//   }

// }

// Program to check if then given number is Prime or Not
//  Write a simple java program using switch statement



public class Assignmentday2 {
  public static void main(String[] args) {
    int n = 8;
     int num = 13;  // fixed number to check
        int flag = 0;  // 0 means prime, 1 means not prime

        if (num <= 1) {
            flag = 1;  // not prime
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = 1;  // not prime
                    break;
                }
            }
        }

        switch(flag) {
            case 0:
                System.out.println(num + " is a prime number.");
                break;
            case 1:
                System.out.println(num + " is not a prime number.");
                break;
        }
  }
}
    
  

  