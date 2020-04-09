package app;

public class StringEndUp {
    public String endUp(String str){
        int length = str.length();
        String newStr = null;
/*        for (int i = 0; i < str.length(); i++) {
            length++;
        }*/
        if(length<3){
            newStr = str.toUpperCase();
        }else if(length>=3){
            newStr = str.substring(0, length-3) + str.substring(length-3, length).toUpperCase();
        }
        return newStr;
    }
}
