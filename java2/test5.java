import java.io.*;
class test5 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(
        new InputStreamReader( System.in ) );

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());


        //System.out.println(x);
        //System.out.println(y);
        System.out.println("平均値＝"+(x+y)/2);
        //System.out.println(x*y);
        //System.out.println(x-y);
        //System.out.println(x/y);

        




    }
}