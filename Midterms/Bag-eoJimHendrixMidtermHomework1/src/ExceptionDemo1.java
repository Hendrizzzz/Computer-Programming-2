// Ignored Exception

import java.util.Scanner;
public class ExceptionDemo1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int result;
        System.out.print("Enter an integer: ");
        result =Integer.parseInt(scanner.nextLine());
        System.out.println("read value = " + result);
        System.exit(0);
    }
} // end of class

/* Note: The probable exception (NumberFormatException) in the following method is ignored (not handled)

private static double readNumber(){
Scanner keyboard = new Scanner(System.in);
double valueRead=0.0;
String entry = keyboard.nextLine();
valueRead = Double.parseDouble(entry);
return valueRead;
} // end readNumber method

*/