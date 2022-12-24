import java.io.*;

class test12{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
        //int max_value =0;
        //int min_value =0;

        int count = Integer.parseInt( br.readLine() );

        for(int i = 0 ; i <count ; i++){
            System.out.print(i);
        }
        
    }
}