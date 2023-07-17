import java .util.Scanner;
import java.util.Arrays;
class Antidig{
    public static void antidig(int[][] array,int n,int m)
    {
        for(int x=0;x<m;x++)
        {
            int i=0;int j=x;
            while(i<=n && j>=0)
            {
                System.out.print(array[i][j]+" ");
                i++;
                j--;
            }
            for(int k=m-1;k>x;k--)
            {
                System.out.print(0+" ");
            }
            System.out.println();
        }
        for(int y=0;y<n;y++)
        {
            int i=y;int j=m-1;
            while(i<n && j>=0)
            {
                System.out.print(array[i][j]+" ");
                i++;
                j--;
            }
            for(int k=y;k>m-1;k++)
            {
                System.out.print(0+" ");
            }
            System.out.println();
        }
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the row: ");
        int row=scanner.nextInt();
        System.out.println("Enter the col: ");
        int col=scanner.nextInt();
        System.out.println("Enter the values: ");
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        Antidig ant=new Antidig();
        ant.antidig(arr,row,col);

    }
}