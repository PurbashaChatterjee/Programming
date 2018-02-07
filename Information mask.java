import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static String userName(String mail){
          String mask = mail.charAt(0)+mail.charAt(1)+mail.charAt(2)+"*****"+mail.charAt(mail.length()-1)
        return maskMail;
    }
    
    public static String phoneNum(String newPhne){
            String regex = "[0-9]+";
            StringBuilder numPhone = new StringBuilder(newPhne.length()+4);
            int count = 0;
			newPhne = newPhne.replace("(","")
			newPhne = newPhne.replace(")","")
			newPhne = newPhne.replace("-","")
            for(int j=newPhne.length()-1;j>=0;j--){
                numPhone.append(newPhne.charAt(j));
                count++;
                   if((newPhne.contains("+") && count==10) || count==4 || count==7){
                     numPhone.append("-");    
                }              
            }
        return numPhone.reverse().toString();
    }
    public static String maskedPhone(String newPh){
            String regex = "[0-9]+";
            String maskPhone = "";
            int lastLen = newPh.length()-4;
            for(int j=0;j<newPh.length();j++){
                if(String.valueOf(newPh.charAt(j)).matches(regex) && j<lastLen){         
                    maskPhone+="*";
                }
                else{
                    maskPhone+=newPh.charAt(j);
                }
            }
        return maskPhone.toString();
    }
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String val = sc.nextLine();   
            val = val.replaceAll("\\s+","");
            if(val.contains("E:")){
                   System.out.println(userName(val));
            }  else{
                String newPhne = phoneNum(val);
                System.out.println(maskedPhone(newPhne));
            }    
        }  
                   
    }
}