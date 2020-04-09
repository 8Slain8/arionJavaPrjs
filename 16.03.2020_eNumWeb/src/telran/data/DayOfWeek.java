package telran.data;

public enum DayOfWeek {
    MONDAY("monday"),
    Tuesday("tuesday"),
    Wednesday("wednesday"),
    Thursday("thursday"),
    FRIDAY("friday"),
    Saturday("saturday"),
    SUNDAY("sunday"),
    ;

    private String title;

    DayOfWeek(String title) {
        this.title = title;
    }

    public void printHello(){
        System.out.println("hallo");
    }

}
