package com.myapp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!, Hello Nico" );
        String r = new java.io.File(App.class.getProtectionDomain()
                .getCodeSource()
                .getLocation()
                .getPath())
                .getName();
        System.out.println("Jar version: " + r);
        printAlien();
    }

    public static void printAlien() {
        System.out.println("\n\n   /\\___/\\        _______________ ");
        System.out.println("  /       \\     /                 \\");
        System.out.println(" /  ^   ^  \\   /    Hello World!   \\");
        System.out.println("( (  O O  ) ) /     Hello Nico!     \\");
        System.out.println(" \\  \\v_/  /   \\     Thanks          /");
        System.out.println("  \\ /___\\ /    \\                   /");
        System.out.println("  /       \\     \\ _______________ /");
        System.out.println(" /         \\");
        System.out.println("(           )");
        System.out.println(" \\         /");
        System.out.println("  |  |  |  |");
        System.out.println("  |  |  |  |");
        System.out.println("  |  |  |  |");
        System.out.println("  |  |  |  |");
        }


}
