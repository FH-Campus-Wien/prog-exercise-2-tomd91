package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner input = new Scanner (System.in);
        int i = 1;
        double userInput;
        double max = 0.00;

       do
       {
           System.out.print("Number " + i + ": "); i++;
           userInput = input.nextDouble();

           if (userInput > max)
               max = userInput;


       }   while (userInput > 0);

       if ( userInput <= 0 && i == 2)
       {
           System.out.println("No number entered.");
       }

       if (userInput <= 0 && i != 2)
           System.out.printf("The largest number is %.2f" + System.lineSeparator(), max);

    }

    //todo Task 2
    public void stairs(){
        Scanner input = new Scanner(System.in);

        System.out.print("n: ");
        int rows = input.nextInt();
        //int cols
        int output = 0;

        if (rows > 0 )
        {
            for (int i = 1; i <= rows; i++)
            {
                for(int j = 1; j <= i; j++)
                {
                    output = output + 1;
                    System.out.print("" + output +" ");
                }
                System.out.print(System.lineSeparator());
            }
        }

        else
            System.out.println("Invalid number!");
    }

    //todo Task 3
    public void printPyramid(){
        //help from programiz.com, last visit: 14.10.2022

        int rows = 6, k = 0;

        for(int i = 1; i <= rows; i++, k = 0)
        {
            for(int space = 1; space <= rows - i; space++)
            {
                System.out.print(" ");
            }

            while (k != 2 * i - 1)
            {
                System.out.print("*");
                k++;
            }

            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        Scanner input = new Scanner(System.in);

        int i,j,r;

        System.out.print("h: ");
        int h = input.nextInt();

        System.out.print("c: ");
        char c = input.next().charAt(0);

        if (h % 2 == 0)
        {
            System.out.println("Invalid number!");
            return;
        }

        for(i=1;i<=h/2;i++)
        {
            for(j=1;j<=(h/2)-i;j++)
                System.out.print(" ");
            for(j = 1; j <= 2 * i - 1; j++)
                System.out.print((char)(c+1-j));
            System.out.println();

        }

        for(i=(h%2)-1;i>=1;i--)
        {
            for(j=1;j<=(h%2)-i;j++)
                System.out.println(" ");
            for(j=1;j<=2*i-1;j++)
                System.out.println(c);
            System.out.println();

        }
    }

    //todo Task 5
    public void marks(){
        Scanner input = new Scanner(System.in);

        int sum = 0;
        double average = 0.00;
        int anzahl = 0;
        int neg = 0;

        for(int i = 1; i > 0; i++)
        {
            System.out.print("Mark " + i + ": ");
            int mark = input.nextInt();

            while (mark > 0 && mark <= 5)
            {
                if (mark == 5){
                    neg++;}

                anzahl++;
                sum = sum + mark;
                break;
            }

            if (mark < 0 || mark > 5)
            {
                System.out.println("Invalid mark!");
                i= i-1;
            }

            if (mark == 0) {
                if (anzahl > 1) {
                    average = (float) sum / (float) anzahl;
                    System.out.printf("Average: %.2f" + System.lineSeparator(), average);
                    System.out.println("Negative marks: " + neg);
                    return;
                }
                else
                {
                    System.out.println("Average: 0.00");
                    System.out.println("Negative marks: 0");
                    return;
                }
            }
        }
            /*if(mark == 5)
            {
                neg++;
            }

            if(mark > 5 || mark < 0)
            {
                System.out.println("Invalid mark!");
            }

            else
            {
                anzahl ++;
                sum = sum + mark;
            }
            if (mark == 0)
            {
                if(anzahl > 1)
                {
                    average = (float) sum / (float) (anzahl-1);
                    System.out.printf("Average: %.2f" + System.lineSeparator(), average);
                    System.out.println("Negative marks: " + neg);
                    return;
                }

                else
                {
                    System.out.println("Average: 0.00");
                    System.out.println("Negative marks: 0");
                    return;
                }
            }


        }


        System.out.printf("Average: %.2f" + System.lineSeparator(), average);
        System.out.println("Negative marks: " + neg);
        */
    }

    //todo Task 6
    public void happyNumbers(){
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 1;
        int a=0,b=0,c=0;

        System.out.print("n: ");
        int number = input.nextInt();

        while (sum != 1)                        //     7 1 6 = a b c
        {
            if (number <= 999 && number > 99)
            {
                c = number % 10;
                //System.out.println(c);
                b = (number / 10) % 10;
                //System.out.println(b);
                a = number / 100;
                //System.out.println(a);

                sum = a * a + b * b + c * c;
                number = sum;
                count++;
                if (count > 10)
                {
                    System.out.println("Sad number!");
                    break;
                }
            }

            if (number <=99 && number >9)
            {
                b = number % 10;
                a = number /10;

                sum= a*a + b*b;
                number = sum;
                count++;
                if (count > 10)
                {
                    System.out.println("Sad number!");
                    break;
                }
            }

        }

        if (sum == 1)
        {
            System.out.println("Happy number!");
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}