package RunInput;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);
    public int InputInt(){ return scanner.nextInt();}
    public float InputFloat(){ return scanner.nextFloat();}
    public boolean InputBoolean(){ return scanner.nextBoolean();}
    public char InputChar(){ return scanner.next().charAt(0); }


}
