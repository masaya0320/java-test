import java.io.*;

class test4 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(
        new InputStreamReader( System.in ) );

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        //System.out.println(x);
        //System.out.println(y);
        System.out.println(x+y);
        System.out.println(x*y);
        System.out.println(x-y);
        System.out.println(x/y);

        




    }
}