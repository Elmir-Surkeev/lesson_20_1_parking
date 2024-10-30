public class Car {
    private String number;
    private String logo;
    private String state;


    public Car(String number, String state) {
        this.logo = String.valueOf(Logo.getRandom());
        this.number = number;
        this.state = state;
    }

}
