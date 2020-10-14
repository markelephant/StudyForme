package jvmClassCodeHit.util;

public class bitStringUtil {
    public String addString(int length){
        String result = "";
        for(int i=0;i<length;i++){
            result+=(char)(i%26+'a');
        }
        return result;
    }

    public String buildString(int length){
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<length;i++){
            sb.append(i%26+'a');
        }
        return sb.toString();
    }
}
