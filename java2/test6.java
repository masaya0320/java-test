import java.io.*;
class test6 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(
        new InputStreamReader( System.in ) );

        System.out.println("年齢は？");
        int age = Integer.parseInt(br.readLine());
        //int y = Integer.parseInt(br.readLine());


        //int days = age * 365;
        System.out.println("何日か"+ (age*365));
        //System.out.println(x);
        //System.out.println(y);
        //System.out.println("平均値＝"+(x+y)/2);
        //System.out.println(x*y);
        //System.out.println(x-y);
        //System.out.println(x/y);

        




    }
}