import java.io.*;
class test2{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(
        new InputStreamReader( System.in ) );

        //String  s = br.readLine(); 
        //int n = Integer.parseInt(s);
        int x = Integer.parseInt(br.readLine());
        System.out.println(x);
    }
}