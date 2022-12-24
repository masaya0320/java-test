import java.io.*;

public class test2
{
    public static void main( String[] args ) throws IOException
    {
       
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        System.out.println("x?");
        int x = Integer.parseInt( br.readLine() );
        //System.out.println("y?");
        //int y = Integer.parseInt( br.readLine() );

        if(x%2 == 0 && x>=0){
            System.out.println("正の偶数です");
        }
        else if(x%2 == 1 && x>=0){
            System.out.println("正の奇数です");
        }
        else if(x%2 == 0 && x<=0){
            System.out.println("負の偶数です");
        }
        else{
            System.out.println("負の奇数です");
        }
    }
}