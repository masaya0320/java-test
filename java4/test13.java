import java.io.*;

class test13{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
        //int max_value =0;
        //int min_value =0;

        
        int sum =0;

        for(int i = 0 ; sum < 100 ; i++){
            //int num = Integer.parseInt( br.readLine() );
            sum = sum + Integer.parseInt( br.readLine() );            
        }
        System.out.println(sum);
        
    }
}