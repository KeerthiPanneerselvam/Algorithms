public class ArrayGreaterSum{

public int SumArray(int a[],int b[])
{
    int lena = a.length;
    int lenb = b.length;
    int m = Math.max(lena,lenb);
    int sum1 = 0;
    int sum2 = 0;
    int max = 0;
    for(int i = 0; i<m ;i ++)
    {
        sum1 = sum1 + a[i];
        sum2 = sum2 + b[i];
        if(a[i] == b[i])
        {
            max = Math.max(sum1,sum2);
            sum1 = max;
            sum2 = max;
        }
    }
    return Math.max(sum1,sum2);
}

public int SumdifferentArrayLength(int a[], int b[])
{
    int lena = a.length;
    int lenb = b.length;
    int sum1 = 0;
    int sum2 = 0;
    int max = 0;
    int i = 0 ; int j = 0;
    
    while(i<lena && j<lenb)
    {
        sum1 = sum1 + a[i];
        sum2 = sum2 + b[j];
        if(a[i] == b[j])
        {
            max = Math.max(sum1,sum2);
            sum1 = max;
            sum2 = max;
        }
        i++; j++;
    }
    
    while(i<lena)
    {
        sum1 = sum1 + a[i];
        i++;
    }
    while(j<lenb)
    {
        sum2 = sum2 + b[j];
        j++;
    }
    return Math.max(sum1,sum2);
}

     public static void main(String []args){
         //if the length of array are same
         int a[] = {11,2,3,4,5,6,7,9,10};
         int b[] = {12,1,3,5,7,6,8,9,0};
         //if length of arrays are different
         int a1[] = {11,2,3,4,5,6,7,9,10,1,5,7};
         int b1[] = {12,1,3,5,7,6,8,9,0,1,2};
        ArrayGreaterSum h = new ArrayGreaterSum();
        int result = h.SumArray(a,b);
        System.out.println("The maximum Sum from both the arrays is : " +result);
        
        int result1 = h.SumdifferentArrayLength(a1,b1);
        System.out.println("The maximum Sum from both the arrays is : " +result1);
        
     }
}
