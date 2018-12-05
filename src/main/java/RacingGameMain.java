import domain.Car;
import view.InputView;
import view.ResultView;

import java.util.ArrayList;
import java.util.List;

public class RacingGameMain {
    public static void main(String[] args) {
        int givenNumberOfCars = InputView.inputNumberOfCars();
        int givenNumberOfTrials = InputView.inputNumberOfTrials();

        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < givenNumberOfCars; i++) {
            cars.add(new Car(givenNumberOfTrials));
        }

        ResultView.print(cars);
    }
}
