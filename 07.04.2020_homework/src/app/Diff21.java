package app;

public class Diff21 {
    public int diff21(int n){
        int diff = 0;
        if(n<=21){
            diff = 21-n;
        }else if(n>21){
         diff = (n-21)*2;
        }
        return diff;
    }
}
