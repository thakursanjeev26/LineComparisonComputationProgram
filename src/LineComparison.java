import java.util.Scanner;






public class LineComparison {



    // Method for Calculating Length
    static Integer calculateLength(int x1, int y1, int x2, int y2) {

        return (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

    }

    // Method for taking user-input and returning length
    static Integer checkLineAndCalculateLength(Scanner in){

        System.out.print("Enter X1: ");
        int x1 = in.nextInt();
        System.out.print("Enter Y1: ");
        int y1 = in.nextInt();
        System.out.print("Enter X2: ");
        int x2 = in.nextInt();
        System.out.print("Enter Y2: ");
        int y2 = in.nextInt();

        return calculateLength(x1, y1, x2, y2);

    }

    // Method for checking equality of two lines
    static void isEqual(Integer length1, Integer length2){

        // Using equals to compare two lines
        if(length1.equals(length2)){
            System.out.println("Two Lines are equal");
        }
        else{
            System.out.println("Two Lines are not equal");
        }

    }



    public static void main(String[] args) {

        System.out.println("Welcome To Line Comparison Computation Program");

        Scanner in = new Scanner(System.in);

        System.out.println("Enter co-ordinates for Line 1: ");
        int length1 = checkLineAndCalculateLength(in);
        System.out.println("Enter co-ordinates for Line 2: ");
        int length2 = checkLineAndCalculateLength(in);
        in.close();

        // Printing length of lines
        System.out.println("Length of Line 1: "+length1);
        System.out.println("Length of Line 2: "+length2);

        // Calling method to check equality of two lines
        isEqual(length1,length2);


    }
}
