//You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left).
// Note:
// Change in the input array/list itself. You don't need to return or print the elements.
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
// First line of each test case or query contains an integer 'N' representing the size of the array/list.
// Second line contains 'N' single space separated integers representing the elements in the array/list.
// Third line contains the value of 'D' by which the array/list needs to be rotated.
// Output Format :
// For each test case, print the rotated array/list in a row separated by a single space.
// Output for every test case will be printed in a separate line.
// Constraints :
// 1 <= t <= 10^4
// 0 <= N <= 10^6
// 0 <= D <= N
// Time Limit: 1sec
// Sample Input 1:
// 1
// 7
// 1 2 3 4 5 6 7
// 2
// Sample Output 1:
// 3 4 5 6 7 1 2
// Sample Input 2:
// 2
// 7
// 1 2 3 4 5 6 7
// 0
// 4
// 1 2 3 4
// 2

// Sample Output 2:
// 1 2 3 4 5 6 7
// 3 4 1 2
// Explanation for Sample Input 2:

// Since, D=0 for the first query, we simply print the elements as it is.

// For the second query, we have to rotate the array/list by 2 elements which will make the array/list look like [3, 4, 1, 2].

//

import java.util.Scanner;

public class RotateArray {
    public static void rotate(int[] arr, int d) {
        int n = arr.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }
        
        for (int i = 0; i < n; i++) {
            arr[(i + n - d) % n] = temp[i];
        }
        
    }
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int n = s.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = s.nextInt();
                }
                int d = s.nextInt();
                rotate(arr, d);
                printArray(arr);
                t--;
            }
        }
    }
}