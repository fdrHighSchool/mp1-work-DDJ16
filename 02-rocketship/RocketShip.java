
/**
 * Write a description of class RocketShip here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RocketShip{
    public static void main(String[] args){
        nose();
        body();
        mainbody();
    }
    public static void nose() {
        System.out.println("    /\\     ");
        System.out.println("   /  \\    ");
        System.out.println("  /    \\   ");
    }
    public static void body() {    
        System.out.println(" +------+   ");
        System.out.println(" |      |   ");
        System.out.println(" |      |   ");
        System.out.println(" +------+   ");
    }    
    public static void mainbody() {    
        System.out.println(" |United|   ");
        System.out.println(" |States|   ");
        body();
        nose();
    }    
}    

    