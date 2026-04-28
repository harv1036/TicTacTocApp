public class UC4 {
    public static void main(String[] args){
        int slot=7;
        System.out.println("Row: "+getRowFromSlot(slot));
        System.out.println("Column: "+getColumnFromSlot(slot));
    }
    public static int getRowFromSlot(int slot){
        return (slot-1)/3;
    }
    public static int getColumnFromSlot(int slot){
        return (slot-1)%3;
    }
}
