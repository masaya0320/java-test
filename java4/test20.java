import java.io.*;

import javax.swing.text.StyledEditorKit;

class test20{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
        
        //int sum   = 0;      
        //int count = 0;       
        int i = 0 ;           
        int size =Integer.parseInt(br.readLine());
        
        for(i=0; i<size ; i++){
            //int value =Integer.parseInt(br.readLine());
            //if(value==0){
              //  break;
            //}
            System.out.print("$");
            //sum = sum + value;
            //count = count + 1 ;
        }
        
        //System.out.println("合計値は？？？？＝"+(sum/count));
        
       
    }
}