public class Car {
    private int number;
    private String logo;
    private String state;



    public Car(int number, String state) {
        this.logo = String.valueOf(Logo.getRandom());
        this.number = number;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", logo='" + logo + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

}
