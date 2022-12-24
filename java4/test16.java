import java.io.*;

import javax.swing.text.StyledEditorKit;

class test16{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
    
        int n =Integer.parseInt(br.readLine());
        //int n;

        for(int x =2;n>1;x++){
            while(n%x==0){
                System.out.print(x+" ");
                n = n/x;
                
            }
        }
        
       
    }
}