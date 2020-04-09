import java.util.Objects;

public class Table {
    private String color;
    private int width;
    private int length;
    private int height;

    public Table(String color, int width, int length, int height) {
        this.color = color;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
/*    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if((o==null) || (!(o instanceof  Table))) return false;
        Table table = (Table) o;
         if(this.width != table.width) return false;
         if(this.length != table.length) return false;
         if(this.height != table.height) return false;
         return color !=null ? color.equals(table.color):table.color==null;
    }*/

/*
    @Override
    public int hashCode(){
        int result  = color != null?color.hashCode() : 0;
        result = 31*result + width;
        result = 31*result + length;
        result = 31*result + height;
        return  result;
    }
*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return width == table.width &&
                length == table.length &&
                height == table.height &&
                Objects.equals(color, table.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, width, length, height);
    }

    @Override
    public String toString() {
        return "Table{" +
                "color='" + color + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", height=" + height +
                '}';
    }
}
