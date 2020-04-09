package app;

public class Weekday {
    public boolean sleepIn(boolean weekday, boolean vacation){
        boolean flag=false;
        if(weekday == false && vacation == false){
            flag = true;
        }else if(weekday==true&&vacation==false){
            flag = false;
        }else if (weekday==false&&vacation==true){
            flag=true;
        }
        return flag;
    }
}
