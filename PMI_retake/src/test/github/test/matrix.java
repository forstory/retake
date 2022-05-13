package test;

import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
        int m, n, min, i, j, row, col;
        int MIN;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number of rows and columns of the matrix you want to create,m is row，n is list");
        System.out.print("m=");
        m = s.nextInt();
        System.out.print("n=");
        n = s.nextInt();
        int a[][] = new int[m][n];
        System.out.println("Please enter a stored number:");
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++) {
                a[i][j] = s.nextInt();
            }
        System.out.println("The output matrix is as follows:");
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
        MIN=a[0][0];
        for(i=0;i<m;i++)
            for(j=0;j<n;j++){
                if(a[i][j]/3!=0){
                    System.out.println("The number divisible by 3 is :"+a[i][j]);
                }
                if(a[i][j]<MIN){
                    MIN=a[i][j];
                }
            }
        System.out.println("The minimum value in the matrix is："+ MIN);

    }
}
