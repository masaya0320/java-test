import java.io.*;
class test3{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(
        new InputStreamReader( System.in ) );

        //String  s = br.readLine(); 
        //int n = Integer.parseInt(s);
        int x = Integer.parseInt(br.readLine());
        System.out.println("x="+x);
        System.out.println("xx="+x*x);
        System.out.println("xxx="+x*x*x);
    }
}