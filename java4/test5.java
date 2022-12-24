import java.io.*;

class test5{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        //int x = Integer.parseInt( br.readLine() );
        int ave =0;
        int sum =0;

        
        for(int i = 1 ; i <=10 ; i++){
            int x = Integer.parseInt( br.readLine() );
            sum = sum + x;

   
        }
                 
        ave = sum/10;
        System.out.println("平均は？"+ave);
            

    }
}