public class PrintValidParenthesis{

public void Print(int open, int close, String s)
{
    if(open == 0 && close == 0)
    {
        System.out.println(s);
    }
    if(open>close)
    {
        return;
    }
    if(open>0)
    {
        Print(open-1,close, s+"(");
    }
    if(close>0)
    {
        Print(open,close-1,s+")");
    }
}
     public static void main(String []args){
         int n = 4;
         PrintValidParenthesis p = new PrintValidParenthesis();
         p.Print(n,n," ");
     }
}
