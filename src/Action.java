import java.util.ArrayList;
import java.util.List;

public class Action {
    public static void main() {

        List<Car> allCars = new ArrayList<>();

        //Создание всех машин
        for (int i=0; i<60; i++){
            Car car = new Car(i, "onRoute");
            allCars.add(car);
        }

        //Вывод всех машин которые есть
        allCars.forEach(System.out::println);


    }
}
