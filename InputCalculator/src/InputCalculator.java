import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage (){

        int sum = 0;
        int count = 0;

        Scanner s = new Scanner(System.in);

        while (true){
            boolean numberInt = s.hasNextInt();
            if(numberInt){
                int number = s.nextInt();
                sum = sum + number;
                count ++;
                s.nextLine();
            } else {
                 break;
            }

        }
        if (count == 0){
            System.out.println("SUM = 0 AVG = 0");
        } else {
            double avg =  ((double)sum/count);
            long avg1 = Math.round(avg);
            System.out.println("SUM = " + sum + " AVG = " + avg1);
        }

        s.close();
    }
}
