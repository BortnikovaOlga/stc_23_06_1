package z2;

import java.time.LocalDate;

public class WateringManager {
    private LocalDate lastWateringDate;
    private HumiditySensor hSensor;
    private int gtHumidity;

    public WateringManager(LocalDate lastWateringDate, int gtHumidity) {
        this.lastWateringDate = lastWateringDate;
        this.hSensor = new RandomHSensorImpl();
        if (gtHumidity > 60 | gtHumidity < 30)
            this.gtHumidity = 30;
        else
            this.gtHumidity = gtHumidity;
    }
    public WateringManager(LocalDate lastWateringDate){
        this(lastWateringDate, 0);
    }

    public LocalDate getNextWateringDate() throws WateringException {
        int month = lastWateringDate.getMonth().getValue();
        if (month == 12 | month == 1 | month == 2)
            return lastWateringDate.plusMonths(1);
        if (month == 6 | month == 7 | month == 8)
            if (hSensor.getHumidity() > 30)
                throw new WateringException("высокая влажность, полив не требуется");
            else
                return lastWateringDate.plusDays(2);
        return lastWateringDate.plusDays(7);

    }

}

