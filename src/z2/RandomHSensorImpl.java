package z2;

import java.util.Random;

public class RandomHSensorImpl implements HumiditySensor {
    @Override
    public int getHumidity() {
        Random rand = new Random();
        int h = rand.nextInt(100);
        System.out.printf("Влажность %d %%\n", h);
        return h;
    }
}
