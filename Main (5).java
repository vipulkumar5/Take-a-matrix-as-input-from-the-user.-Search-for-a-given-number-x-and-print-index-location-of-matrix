import java.util.*;
public class Main{
    static public void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int cols=sc.nextInt();
        int [][]nums=new int[row][cols];
        
        System.out.println("enter the value");
        for(int i=0; i<row;i++){
            for(int j=0; j<cols;j++){
                nums[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter a x value");
        int x=sc.nextInt();
        
        
        for(int i=0;i<row;i++){
            for(int j=0; j<cols; j++){
                if(nums[i][j]==x)
                System.out.println("index location of matrix ("+i+", "+j+")");
            }
        }
    }
}