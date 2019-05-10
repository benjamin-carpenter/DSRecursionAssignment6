import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main {


    public static void main(String[] args) {
        String _firstNumber = "";
        String _secondNumber = "";
        int numOne, numTwo,sum;
        BufferedReader numberInput = new BufferedReader(
                new InputStreamReader(System.in));
        while(true){
            System.out.println("Please input your first number. ");
            try {
                _firstNumber = numberInput.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                numOne = Integer.valueOf(_firstNumber);
            } catch (NumberFormatException ex) {
                System.err.println("Your input for the first number wasn't a numerical digit please enter it again.");
                return;
            }
            break;
        }
        while (true) {
            System.out.print("Please put in your second number");
            try {
                _secondNumber = numberInput.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                numTwo = Integer.valueOf(_secondNumber);
            } catch (NumberFormatException ex) {
                System.err.println("Your input for the second number wasn't a numerical digit please enter it again.");
                return;
            }
            break;//********************************************************
        }
        if (numOne >= numTwo){
          sum = recursiveMath.addition(numOne,numTwo,0);
          System.out.println("The sum of integers from "+numOne+" to "+numTwo+" is "+sum);
        }
        if (numTwo >= numOne){
            sum = recursiveMath.addition(numTwo,numOne,0);
            System.out.println("The sum of integers from "+numTwo+" to "+numOne+" is "+sum);
        }


    }}
