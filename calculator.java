import java.util.Scanner;
import java.io.IOException;

class calculator {

  public static void main(String[] args)    {
    int ans = 0;

   while (true) {
    clear();
    Scanner usergrabber = new Scanner(System.in);
    print("plus or + is addition\n");
    print("- or minus is subtraction\n");
    print("* or multiply  is multiplication\n");
    print("/ or divide   is division\n");
    print("% or modulo is modulo\n");
    print("ans is ans followed by operator then number\n");

    String userinput = usergrabber.nextLine();
    
    
    if(userinput.equals("+") || userinput.equals("plus")) {
    clear();
    Scanner xgrabber = new Scanner(System.in);
    Scanner ygrabber = new Scanner(System.in);
    int x;
    int y;
    while (true) {
    try {
      print("What's the first number?");
      x = xgrabber.nextInt();
      print("What's the second number?");
      y = ygrabber.nextInt();
     
      int z = x + y;
      ans = z;
      System.out.printf("%d + %d = %d\n",x,y,z);
      print("Press any key to continue!");
      System.in.read();
      break;
    }
    
    catch(Exception e) {
      print("Wrong Number!");
    }
    }
    }

    if(userinput.equals("-") || userinput.equals("minus")) {
      clear();
    Scanner xgrabber = new Scanner(System.in);
    Scanner ygrabber = new Scanner(System.in);
    int x;
    int y;
    while (true) {
    try {
      print("What's the first number?");
      x = xgrabber.nextInt();
      print("What's the second number?");
      y = ygrabber.nextInt();
     
      int z = x - y;
      ans = z;
      System.out.printf("%d - %d = %d\n",x,y,z);
      print("Press any key to continue!");
      System.in.read();
      break;
    }
    
    catch(Exception e) {
      print("Wrong Number!");
    }
    }
    }


    if(userinput.equals("*") || userinput.equals("multiply")) {
      clear();
    Scanner xgrabber = new Scanner(System.in);
    Scanner ygrabber = new Scanner(System.in);
    int x;
    int y;
    while (true) {
    try {
      print("What's the first number?");
      x = xgrabber.nextInt();
      print("What's the second number?");
      y = ygrabber.nextInt();
     
      int z = x * y;
      ans = z;
      System.out.printf("%d * %d = %d\n",x,y,z);
      print("Press any key to continue!");
      System.in.read();
      break;
    }
    
    catch(Exception e) {
      print("Wrong Number!");
    }
    }
    }


    if(userinput.equals("/") || userinput.equals("divide")) {
      clear();

    Scanner xgrabber = new Scanner(System.in);
    Scanner ygrabber = new Scanner(System.in);
    int x;
    int y;
    while (true) {
    try {
      print("What's the first number?");
      x = xgrabber.nextInt();
      print("What's the second number?");
      y = ygrabber.nextInt();
     
      int z = x / y;
      ans = z;
      System.out.printf("%d / %d = %d\n",x,y,z);
      print("Press any key to continue!");
      System.in.read();
      break;
    }
    
    catch(Exception e) {
      print("Wrong Number!");
    }
    }
    }


    if(userinput.equals("%") || userinput.equals("modulo")) {
      clear();
    Scanner xgrabber = new Scanner(System.in);
    Scanner ygrabber = new Scanner(System.in);
    int x;
    int y;
    while (true) {
    try {
      print("What's the first number?");
      x = xgrabber.nextInt();
      print("What's the second number?");
      y = ygrabber.nextInt();
     
      int z = x % y;
      ans = z;
      System.out.printf("%d % %d = %d\n",x,y,z);
      print("Press any key to continue!");
      System.in.read();
      break;
    }
    
    catch(Exception e) {
      print("Wrong Number!");
    }
    }
    }

    if(userinput.equals("ans") && ans > 0) {
      clear();
      Scanner ansinput = new Scanner(System.in);
    print("type add if you want to add ans + number you choose\n");

    print("type subtract if you want to add ans - number you choose\n");

    print("type multiply if you want to add ans * number you choose\n");

    print("type divide if you want to add ans / number you choose\n");
    print("type modulo if you want to add ans % number you choose\n");

    String ansrequest = ansinput.nextLine();

    if(ansrequest.equals("add")) {
      clear();
     Scanner yput = new Scanner(System.in);
     int y = 0;
     print("So, what's the second number you want to add on top of ans?");

     while (true) {
       try {
     y = yput.nextInt();
     int z = ans + y;
     System.out.printf("%d + %d = %d",ans,y,z);

     print("Press any key to continue!");
     System.in.read();
     break;
       }
       catch (Exception e){
         print("Wrong number!");
       }
     }
    }

    if(ansrequest.equals("subtract")) {
      clear();
     Scanner yput = new Scanner(System.in);
     int y = 0;
     print("So, what's the second number you want to subtract on top of ans?");

     while (true) {
       try {
     y = yput.nextInt();
     int z = ans - y;
     System.out.printf("%d - %d = %d",ans,y,z);

     print("Press any key to continue!");
     System.in.read();
     break;

     }
     catch (Exception e){
       print("Wrong number!");
     }
     }
    }

    if(ansrequest.equals("multiply")) {
      clear();
     Scanner yput = new Scanner(System.in);
     int y = 0;
     print("So, what's the second number you want to multiply on top of ans?");

     while (true) {
       try {
     y = yput.nextInt();
     int z = ans * y;
     System.out.printf("%d * %d = %d",ans,y,z);

     print("Press any key to continue!");
     System.in.read();
     break;


     }
     
     catch(Exception e){

       print("Wrong number");
     }
     }
    }

    if(ansrequest.equals("divide")) {
      clear();
     Scanner yput = new Scanner(System.in);
     int y = 0;
     print("So, what's the second number you want to divide on top of ans?");

     while (true) {
       try {
     y = yput.nextInt();
     int z = ans / y;
     System.out.printf("%d / %d = %d",ans,y,z);
     print("Press any key to continue!");
     System.in.read();
     break;
     }
     catch(Exception e) {
       print("Wrong number");

       


     }
     }
    }
    if(ansrequest.equals("modulo")) {
      clear();
     Scanner yput = new Scanner(System.in);
     int y = 0;
     print("So, what's the second number you want to do modulo on top of ans?");

     while (true) {
      try {
     y = yput.nextInt();
     int z = ans + y;
     System.out.printf("%d + %d = %d",ans,y,z);

     print("Press any key to continue!");
     System.in.read();
     break;
     }
     
     catch(Exception e) {
       print("Wrong number!");
     }
    }


    }
    else {
      print("Wrong syntax");
    }
   }

   else if(userinput.equals("ans") && ans == 0)  {
     print("you need to fill up ans");
     print("Press any key to continue");
     try {
     System.in.read();
     }
     catch(IOException e) {
       e.printStackTrace();
     }
   }

   }
  }


  
  static void clear()   {
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
  }

  // ONLY STRING
  static void print(String object) {
   System.out.println(object);
  }
}  
