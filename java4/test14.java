import java.io.*;

import javax.swing.text.StyledEditorKit;

class test14{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        int strike =0;
        int ball = 0;
        int faul = 0;

        while(strike <3 && ball <4){
            System.out.println("ストライク=1？or ボール＝２？orファウル＝３？");
            int num = Integer.parseInt( br.readLine() );
            if(num == 1){
                System.out.println("ストライク！！！");//ストライクの場合
                strike = strike +1;
            }else if(num == 2){
                System.out.println("ボール！！！");
                ball = ball +1;
            }else if(num == 3){
                System.out.println("ファウル！！！");
                faul = faul +1;
                if(faul <=2){
                    strike = strike +1;
                }
            }         
        }

        System.out.println("ストライクは="+strike+"個");
        System.out.println("ボールは="+ball+"個");
        System.out.println("ファウルは＝"+faul+"個");
        
    }
}