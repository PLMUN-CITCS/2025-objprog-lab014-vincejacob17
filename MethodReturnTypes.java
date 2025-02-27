public class MethodDemo {
    public static void main(String[] args) {
public class MethodReturnTypes {
   //... (main method)...
   public static void displayWelcomeMessage() {
     System.out.println("Welcome to our program!");
   }
}
public class MethodReturnTypes {
    public static void main(String args) {
        displayWelcomeMessage();
    }
    //... (displayWelcomeMessage method)...
}
public class MethodReturnTypes {
    //... (other methods)...
    public static double calculateAverage(int num1, int num2) {

    }
}
public class MethodReturnTypes {
    //... (other methods)...
    public static double calculateAverage(int num1, int num2) {
        double average = (num1 + num2) / 2.0;
        return average;
    }
}
public class MethodReturnTypes {
    public static void main(String args) {
        //... (other code in main)...
        int value1 = 20;
        int value2 = 30;
        double result = calculateAverage(value1, value2);
    }
    //... (other methods)...
}
public class MethodReturnTypes {
    public static void main(String args) {
        //... (other code in main)...
        System.out.println("The average is: " + result);
    }
    //... (other methods)...
}
    }
}