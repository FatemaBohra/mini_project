import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void printJava() {
        System.out.println("Hello Java");
    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        // print (shortcut: sout -> tab)
        System.out.println("Hello world!");

        // variables
        String name = "Ritesh";
        int age = 20;
        String neighbour = "Akku";
        String friends = neighbour;

        /*
         * Types
         * Primitive types (Simple values)
         */
        // byte - 1 byte memory, [-128 to 127]
        byte duration = 30;
        // byte due = 134; this will give error 'cause 'due' is out of range

        // short - 2 bytes memory

        // int - 4 bytes memory, 1, 2, 3, 4
        int phone = 1234567890;
        // int phone_num = 12345678910; this will give error 'cause 'num' is out of
        // range

        // long - 8 bytes
        long phone2 = 12345678910L; // L - to tell compiler that we are storing Long value

        // float - 4 bytes memory, 3.14
        float pi = 3.14F; // F - to tell compiler that it's float not int.

        // double - 8 bytes

        // char - 2 bytes a, b ,c
        char letter = '@';

        // boolean - 1 byte true/false
        boolean is_adult = true;

        /**
         * Non - primitive/ reference types
         */
        // 1) String - 2 bytes
        String name2 = "Aman";
        System.out.println(name + " and " + name2);

        /**
         * Functions of String type
         */
        // length
        System.out.println(name2.length());

        // charAt
        System.out.println(name.charAt(0));

        // replace()
        String name3 = name.replace('R', 'S');
        System.out.println(name3);

        // substring
        String names = "Aman and Akku";
        System.out.println(names.substring(0, 4)); // 4 is excluded

        // 2) Arrays
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 86;
        marks[2] = 58;
        System.out.println(marks[0]);// it is important to give an index[0] while printing else it will give some
        // jargon+hash code!

        /**
         * Functions of array
         */

        // lenght
        System.out.println(marks.length); // no () because it's a property of array itself and not a function

        // sort (sort is in Arrays array so, we have to import the package)
        Arrays.sort(marks); // 58, 86, 97
        System.out.println(marks[0]);

        // Another way of creating arrays
        int[] marks2 = { 97, 86, 58 };

        // 2d arrays
        int[][] finalMarks = { { 97, 86, 58 }, { 97, 98, 95 } };
        System.out.println(finalMarks[0][0]);

        /**
         * Casting - changing one type to another
         * 2 types of casting -> implicit and explicit
         */

        // implicit- (Mota ma moti value store che)
        double price = 100;
        double finalPrice = price + 18;

        System.out.println(finalPrice);

        // explicit- (Chota ma moti value store karavi)
        int p = 100;
        int fP = p + (int) 18.99; // casting double to int.

        System.out.println(fP);

        /**
         * Constants - they are final values - variable names should be in uppercase.
         */

        final float PI = 3.14F;

        /**
         * operators - Arithmetic (+, -, *, /, %, //)
         * Assignment (=, ++, --, **)
         * Logical (&&, ||, !)
         * Comparison (==, !=, <, >, <=, >=)
         */

        // Assignment
        int num = 1;
        System.out.println(num++); // 1 (++ num ke baad hai to value baad me print hogi)
        System.out.println(num); // 2

        System.out.println(++num); // 2 (++ num ke phele hai to value phele hi print hojaye gi)
        System.out.println(num); // 2

        // random function in maths
        System.out.println((int) (Math.random() * 100));

        // How to take INPUT?
        Scanner userInput = new Scanner(System.in);

        System.out.print("Input Your height: ");
        float height = userInput.nextFloat(); // nextInt, nextLong...
        System.out.println(height);

        System.out.print("Input Your Name: "); // input- Fatema Bohra
        String name_ = userInput.next(); // output- Fatema, to print whole line use - nextLine()
        System.out.println(name_);

        // Conditional statements
        boolean isSunUp = true;
        if (isSunUp == true)
            System.out.println("Day");
        else
            System.out.println("Night");

        // Conditional statements - SWITCH

        System.out.print("Give day number: ");
        Scanner user_input = new Scanner(System.in);

        int day = user_input.nextInt();

        switch (day) { // if 1st case is true it will print 1st case + all the values after that as
                       // well!
            case 1:
                System.out.println("Monday");
                break; // that is why use break keyword!
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Wed - Sun");
        }

        /**
         * LOOPS
         * for loop - 100
         */
        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }

        // while loop
        int i = 100;
        while (i >= 1) {
            System.out.println(i);
            i = i - 1;
        }

        // do while
        int k = 150;
        do {
            System.out.println(k);
            k = k - 1;
        } while (k >= 1);

        Scanner sc = new Scanner(System.in);
        int number; // it is always by default 0

        do {
            System.out.print("Please enter a number: ");
            number = sc.nextInt();
            System.out.print("Here is your number: ");
            System.out.println(number);
        } while (number >= 0);

        System.out.println("The End");

        // break & continue

        int j = 0;
        while (true) {
            if (j == 3) {
                j = j + 1;
                continue;
            }
            System.out.println(j);
            j = j + 1;
            if (j > 5) {
                break;
            }
        }

        // TRY-CATCH in Exception handling

        int[] mark = { 97, 98, 95 };
        try {
            System.out.println(mark[5]);
        } catch (Exception exception) {
            // do something after catching
        }
        System.out.println("The name is Aman");

        // Calling functions
        printJava();
        printName("Rani");
        printSum(1, 4);

    }

}
