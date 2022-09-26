package JavaApplication_mahmud;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static void bubblesort(ArrayList<Double> array) {
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = 0; j < array.size() - 1 - i; j++) {
                if (array.get(j) > array.get(j + 1)) {
                    double temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);

                }
            }
        }
    }

    static int search(ArrayList<Double> num, double number) {
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) == number) {
                return i;
            }
        }
        return -1;

    }

    public static double print(ArrayList<Double> num) {

        for (int c = 0; c < num.size(); c++) {
            System.out.println(num.get(c));

        }
        return 0;

    }

    public static int display(ArrayList<Double> num) {
        for (int c = 0; c < num.size(); c++) {

            double n = num.get(c);
            double a = n * 0.71;
            // loop for to array to read the disblay the array.
            {
                bubblesort(num);
                System.out.println(a);
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        ArrayList<Double> adw = new ArrayList<>();
        File myFile;
        myFile = new File("USD coins.txt");

        try {

            Scanner in = new Scanner(myFile);
            while (in.hasNext()) {
                adw.add(in.nextDouble());
            }
        } catch (FileNotFoundException e) {

        }
        array(adw);
    }

    public static void array(ArrayList<Double> qqq) {

        Scanner S = new Scanner(System.in);
        {

            System.out.println("pleas choose P or S or D or Q");
            System.out.println("Enter the lettre:  ");
            String option = S.next();

            if (option.equals("P")) {

                print(qqq);
            }

            if (option.equals("D")) {

                display(qqq);
            }

            if (option.equals("S")) {
                System.out.println("Enter the Number please: ");

                double find_number = S.nextDouble();

                int result = search(qqq, find_number);

                if (result == -1) {
                    System.out.println("Not found");
                } else {
                    System.out.println(find_number + " Found");

                }

            }

            if (option.equals("Q")) {
                
            }

        }
    }

}
