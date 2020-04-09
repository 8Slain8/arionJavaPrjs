public class Main {
    public static void main(String[] args) {
        Table table1 = new Table("brown", 100, 100, 40);
        Table table2 = new Table("brown", 100, 100, 40);
        Table table3 = new Table("black", 120, 200, 40);

        System.out.println(table1);

        System.out.println(table1==table2);
        System.out.println(table1.equals(table2));
        System.out.println(table2.equals(table1));



    }
}
