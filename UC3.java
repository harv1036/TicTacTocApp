import java.util.Scanner;
public class UC3 {
    public static void main(String[] args){
        int slot=getUserSlot();
        System.out.println("Slot entered:"+slot);
    }
    public static int getUserSlot(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a slot (1-9): ");
        int slot = scanner.nextInt();
        scanner.close();
        return slot;
    }
}
