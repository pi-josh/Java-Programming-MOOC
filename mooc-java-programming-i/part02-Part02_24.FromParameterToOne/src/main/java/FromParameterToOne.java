

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(7);
        
    }
    
    public static void printFromNumberToOne(int number) {
        int i = number;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }
}
