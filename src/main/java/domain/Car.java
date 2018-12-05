package domain;

import java.util.Random;

public class Car {
    private int position;
    private String name;

    public Car(int trials) {
        this.position = getFinalPosition(trials);
    }

    private int getFinalPosition(int trials) {
        int position = 0;
        for (int i = 0; i < trials; i++) {
            if(new Random().nextInt(10) > 4) {
                position++;
            }
        }

        return position;
    }

    public String getPositionMarks() {
        StringBuilder bars = new StringBuilder();
        for (int i = 0; i < position; i++) {
            bars.append('-');
        }
        return bars.toString();
    }
}
