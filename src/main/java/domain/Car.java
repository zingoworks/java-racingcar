package domain;

import java.util.Random;

public class Car {
    private static final String DASH = "-";

    private int position;
    private String name;

    public Car(int trials) {
        goToFinalPosition(trials);
    }

    private void goToFinalPosition(int trials) {
        for (int i = 0; i < trials; i++) {
            go();
        }
    }

    private void go() {
        if(new Random().nextInt(10) > 4) {
            position++;
        }
    }

    public String getPositionMarks() {
        StringBuilder marks = new StringBuilder();
        for (int i = 0; i < position; i++) {
            marks.append(DASH);
        }
        return marks.toString();
    }
}
