package Java_practice;

import java.util.Scanner;

public class twodarray {
    public static void main (String[] args){

        //int arr[][] = {{2,3,6},{1,4,2},{7,2,6}};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:- ");
        int no_rows = sc.nextInt();
        System.out.println("Enter number of columns:- ");
        int no_cols = sc.nextInt();
        int [][] arr= new int[no_rows][no_cols];
        for(int i=0;i<no_rows;i++){
            for(int j=0;j<no_cols;j++){
                arr[i][j]= sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<no_rows;i++){
            for(int j=0;j<no_cols;j++){
                System.out.print(" "+arr[i][j]);
            }
System.out.println();
        }
        for (int i= 0;i<no_rows;i++){
            int row_sum=0;
            int col_sum=0;
            for(int j=0;j<no_cols;j++){

//                System.out.print(arr[i][j] + " ");
                row_sum = row_sum+ arr[i][j];
                col_sum= col_sum+ arr[j][i];
            }
            System.out.println("Sum of "+i+" column is "+col_sum);
            System.out.println("Sum of "+i+" row is "+row_sum);
            System.out.println();
        }


    }
}
