import java.util.Scanner;

public class NumericVariables {
    public static void main(String[] args) {
        //variables
        Scanner scan = new Scanner(System.in);
        int intOperandA = 8;
        int intOperandB = 2;
        int intSum;
        int intDifference;
        int intProduct;
        int intQuotient;
        int intModulo;

        double doubleOperandA = 10.75;
        double doubleOperandB = 5.47;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;
        double doubleModulo;

        //Int process
        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulus using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        //space
        System.out.println();

        //Double process
        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The modulus using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);
    }
}