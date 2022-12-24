import java.io.*;

class test6{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        //int x = Integer.parseInt( br.readLine() );
        int lose =0;
        int win =0;

        
        for(int i = 1 ; i <=10 ; i++){
            int x = Integer.parseInt( br.readLine() );
            if(x==1){
                win = win + 1;
            }
            else{
                lose = lose+1;
            }
        }

        System.out.println("勝利数は？"+win);
        System.out.println("敗北数は？"+lose);
    }
}