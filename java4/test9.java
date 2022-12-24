import java.io.*;

class test9{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
        int max_value =0;
        int min_value =0;

        for(int i =0;i<9;i++){
            
            int value = Integer.parseInt( br.readLine() );
            //int hanshin =0;
            //int kyo =0;
            //System.out.println(x);
            if(value > max_value){
                max_value = value;
            }
            else if(value < min_value){
                min_value = value;
            }
        }
        System.out.println("最大値は"+max_value);
        System.out.println("最小値は"+min_value);


    }
}