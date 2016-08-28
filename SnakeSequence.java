public class SnakeSequence1{

    public int getMaxSequence(int [][] matrix)
    {
       
        int rows = matrix.length ;
        int cols = matrix[0].length ;
        int maxLength = 1;
        int maxRow=0;
        int maxCol=0;

         int [][] result = new int[rows][cols];
         
         for(int i= 0;i<rows; i++)
         {
             for(int j = 0; i<cols; j++)
             {
                 result[i][j]=1;
             }
         }
         
         for(int i = 0;i < rows;i++)
         {
             for(int j=0; j<cols ; j++)
             {
                 if(i!=0 || j!=0)
                 {
                     if(i>0 && Math.abs(matrix[i][j]-matrix[i-1][j]) == 1)
                     {
                         result[i][j] = Math.max(result[i][j],result[i-1][j]+1);
                         if(maxLength < result[i][j])
                         {
                             maxLength = result[i][j];
                             maxRow = i;
                             maxCol = j;
                         }
                     }
                     
                      if(j>0 && Math.abs(matrix[i][j]-matrix[i][j-1]) == 1)
                     {
                         result[i][j] = Math.max(result[i][j],result[i][j-1]+1);
                         if(maxLength < result[i][j])
                         {
                             maxLength = result[i][j];
                             maxRow = i;
                             maxCol = j;
                         }
                     }
                 }
             }
         }
         
         System.out.println("Maximum Snake sequence : ");
         PrintSeq(matrix,result,maxLength,maxRow,maxCol);
         return 0;
    }
    
    public void PrintSeq(int m[][],int r[][],int ml , int mr, int mc)
    {
        int len = ml;
        while(ml>=1)
        {
            System.out.println("-" + m[mr][mc]);
            if(mr>0 && Math.abs(r[mr][mc] - r[mr-1][mc])== 1)
            {
                mr--;
            }
            else if(mc>0 && Math.abs(r[mr][mc] - r[mr][mc-1]) == 1)
            {
                mc--;
            }
            ml--;
        }
    }

     public static void main(String []args){
         int arrA [][] = {  {1, 2, 1, 2},
                            {7, 7, 2, 5},
                            {6, 4, 3, 4},
                            {1, 2, 2, 5} };
        SnakeSequence1 s = new SnakeSequence1();
        s.getMaxSequence(arrA);
     }
}
