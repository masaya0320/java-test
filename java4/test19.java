import java.io.*;

import javax.swing.text.StyledEditorKit;

class test19{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
        
        int sum   = 0;      
        int count = 0;                  
        //int n =Integer.parseInt(br.readLine());
        
        for(; ;){
            int value =Integer.parseInt(br.readLine());
            if(value==0){
                break;
            }
            sum = sum + value;
            count = count + 1 ;
        }
        
        System.out.println("合計値は？？？？＝"+(sum/count));
        
       
    }
}