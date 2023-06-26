package z2;

import java.time.LocalDate;


public class z2 {
    public static void main(String[] args) {
        LocalDate lastWatering = LocalDate.parse("2023-06-24");
//        LocalDate lastWatering = LocalDate.parse("2023-01-24");
//        LocalDate lastWatering = LocalDate.parse("2023-03-24");
        System.out.println("Дата предыдущего полива : " + lastWatering);
        WateringManager wm = new WateringManager(lastWatering);
        try {
            System.out.println("Дата следующего полива : " + wm.getNextWateringDate());
        } catch (WateringException e) {
            System.out.println(e.getMessage());
        }

    }
}
