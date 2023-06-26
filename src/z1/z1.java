package z1;

import java.util.Scanner;

public class z1 {
    public static void main(String[] args) throws IllegalArgumentException {
        Massage loveMessage = new Massage(3, 62, 3, 12, 15);
        System.out.println(loveMessage);
        System.out.println("Введите длину забора в сантиметрах :");
        Scanner scanner = new Scanner(System.in);
        String isIn = (loveMessage.isFitInPlace(scanner.nextInt())) ? "" : "не ";
        System.out.println("Cообщение " + isIn + "поместится на забор");

    }
}
