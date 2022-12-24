import java.io.*;

class test7{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        //int x = Integer.parseInt( br.readLine() );
        int hanshin =0;
        int kyo =0;

        
        for(int i = 1 ; i <=9 ; i++){
            System.out.println(i+"回、巨人の得点は？");
            int x = Integer.parseInt( br.readLine() );
            kyo = kyo+x;

            System.out.println(i+"回、阪神の得点は？");
            int y = Integer.parseInt( br.readLine() );

            hanshin = hanshin+y;
           
        }

        System.out.println("巨人？"+kyo);
        System.out.println("阪神？"+hanshin);

        if(hanshin>kyo){
            System.out.println("阪神の勝ち");
        }
        else if(hanshin<kyo){
            System.out.println("巨人の勝ち");
        }
        else{
            System.out.println("引き分け");
        }
    }
}