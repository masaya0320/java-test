import java.io.*;

public class test2_1
{
    public static void main( String[] args ) throws IOException
    {
       
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        System.out.println("x?");
        int x = Integer.parseInt( br.readLine() );
        //System.out.println("y?");
        //int y = Integer.parseInt( br.readLine() );

        if(x%2==0){
            if(x>=0){
                System.out.println("xは正の偶数");
            }
            else{
                System.out.println("xは負の偶数");
            }
        }
        else{
            if(x>=0){
                System.out.println("xは正の奇数");
            }
            else{
                System.out.println("xは負の奇数");
            }
        }
    }
}