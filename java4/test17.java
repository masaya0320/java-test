import java.io.*;

import javax.swing.text.StyledEditorKit;

class test17{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
    
        //int n =Integer.parseInt(br.readLine());
        
        for(int i =1;i<=9;i++){
            //System.out.print(i+" ");
            for(int j =1;j<=9;j++){
                System.out.printf("%2d",i*j);
                
            }
            System.out.println();
        }
        
       
    }
}