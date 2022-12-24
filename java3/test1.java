import java.io.*;

public class test1
{
    public static void main( String[] args ) throws IOException
    {
        //int x = 100;
        //int y = 3;
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        System.out.println("x?");
        int x = Integer.parseInt( br.readLine() );
        System.out.println("y?");
        int y = Integer.parseInt( br.readLine() );
        
        if(x>y){
            System.out.println("xはyより大きい");
        }
        else if(x<y){
            System.out.println("xはyより小さい");
        }
        else{
            System.out.println("xとyは等しい");
        }
    }
}