import java.util.*;
class Main {
    public static void main(String[] args) {
        String str="t6hj7ui";
        char c;
        int count;
        String result="";
        for(int i=0;i<str.length();i++){
            c=str.charAt(i);
            if(Character.isDigit(c)){
                count=c-'0';
            for(int j=0;j<count;j++){
                 System.out.print(result);
                 
            }
            result="";
        }
        else{
            result+=c;
            if(i==str.length()-1){
                if(result!=""){
                    System.out.print(result);
                }
            }
        }
        }
    }
}