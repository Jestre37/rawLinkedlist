/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlistraw;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add");
            System.out.println("2. Poll");
            System.out.println("3. Peek");
            System.out.println("4. Pop");
            System.out.println("5. Print All");
            System.out.println("6. Exit");
            System.out.print("Choose: ");
            int input = scan.nextInt();
            scan.nextLine();

            if (input == 1) {
                System.out.print("Enter number: ");
                int x = scan.nextInt();
                Node.add(x);
            }
            if (input == 2) {
                System.out.println("Polled: " + Node.poll());
            }
            if (input == 3) {
                System.out.println("Peek: " + Node.peek());
            }
            if (input == 4) {
                System.out.println("Popped: " + Node.pop());
            }
            if (input == 5) {
                Node.printAll();
            }
            if (input == 6) {
                break;
            }
        }

        scan.close();
    }
}
