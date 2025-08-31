/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlistraw;





public class Node{

    private static DataNode[] arr = new DataNode[100]; // array instead of real list
    private static int size = 0;

    public static void add(int x) {
        DataNode n = new DataNode(x);
        arr[size] = n;
        size++;
    }

    public static int poll() {
        if (size == 0) {
            System.out.println("Empty");
            return -1;
        }
        int val = arr[0].data;
        for (int i = 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
        return val;
    }

    public static int peek() {
        if (size == 0) {
            System.out.println("Empty");
            return -1;
        }
        return arr[0].data;
    }

    public static int pop() {
        if (size == 0) {
            System.out.println("Empty");
            return -1;
        }
        int val = arr[size - 1].data;
        arr[size - 1] = null;
        size--;
        return val;
    }

    public static void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i].data);
        }
    }
}
