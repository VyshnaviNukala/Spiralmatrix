import java.util.*;
class Spiralmatrix
{
  public static void main(String[] args)
{      
        int matrix[][]={{2,3,1},{3,4,6},{2,7,8}};
        int top=0, down=matrix.length-1, left=0, right=matrix[0].length-1, dir=0;
        while(top<=down && left<=right)
        {
            if(dir==0)
            {
                for(int i=left ; i<=right ; i++){
                    System.out.print(matrix[top][i]);
                }
                top+=1;
            }
            else if(dir==1){
                for(int i=top ; i<=down ; i++){
                   System.out.print(matrix[i][right]);
                }
                right-=1;
            }
            else if(dir==2){
                for(int i=right ; i>=left ; i--){
                    System.out.print(matrix[down][i]);
                }
                down-=1;
            }
            else if(dir==3){
                for(int i=down ; i>=top ; i--){
                   System.out.print(matrix[i][left]);
                }
                left+=1;
            }
            dir = (dir+1)%4;
        }
      
    }
 }