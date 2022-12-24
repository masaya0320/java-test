import java.io.*;

import javax.swing.text.StyledEditorKit;

class test14{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
    
        int value =Integer.parseInt(br.readLine());
        int n;

        for(n=2;n<=(value/2);n++){
            if(value%2==0){
                break;
            }
        }

        if(value%2==0){
            System.out.println("素数です");
        }
       
    }
}