/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Java Program to Convert Integer Values into Binary

import java.io.*;

public class Main {

 public static void main(String[] args)
    {
        int arr[] = new int[] { 1, 2, 3, 4, 5};
        int n=arr.length;
        int temp[]=new int[n];
        int k=0,i=0;
        temp[i++]=arr[n-1];
        for(int j=1;j<n;j++)
        {
            temp[j]=arr[k];
            k++;
        }
        for(int l=0;l<n;l++){
            System.out.println(temp[l]);
        }
    }
}
