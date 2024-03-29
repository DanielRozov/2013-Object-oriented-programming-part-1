
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int printed = 0;
        while (printed < amount) {
            System.out.print("*");
            printed++;
        }
        
        System.out.println("");
    }
    
    public static void printWhitespaces(int amount) {
        // 40.1
        int printed = 0;
        while (printed < amount) {
            System.out.print(" ");
            printed++;
        }
        
    }
    
    public static void printTriangle(int size) {
        // 40.2
        int counter = 1;
        
        while (counter <= size) {
            printWhitespaces(size - counter);
            printStars(counter);
            counter++;
        }
    }
    
    public static void xmasTree(int height) {
        // 40.3
        int printed = 1;
        
        while (printed <= height) {
            printWhitespaces(height - printed);
            printStars(printed + (printed - 1));
            printed++;
        }
        
        int standStart = height - 2;
        for (int i = 0; i < 2; i++) {
            printWhitespaces(standStart);
            printStars(3);
        }
    }
    
    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(4);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
