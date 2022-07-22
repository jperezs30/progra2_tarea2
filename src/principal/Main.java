package principal;

import java.util.Scanner;

public class Main {

    public static  void main(String[] params){
        System.out.println("Ingrese su nombre:");
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();
        System.out.println("Bienvenido a Progra 2 2022 " + name);
    }

}
