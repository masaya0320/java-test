import java.io.*;

class test11{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
        //int max_value =0;
        //int min_value =0;

        int count = Integer.parseInt( br.readLine() );

        while(count > 0){
            System.out.print("*");
            count = count -1;
        }
        
    }
}