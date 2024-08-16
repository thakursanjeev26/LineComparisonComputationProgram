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


    public static void main(String[] args) {

        System.out.println("Welcome To Line Comparison Computation Program");

        Scanner in = new Scanner(System.in);

        int length = checkLineAndCalculateLength(in);
        in.close();

        // Printing length of line
        System.out.println("Length of Line: "+length);


    }
}
