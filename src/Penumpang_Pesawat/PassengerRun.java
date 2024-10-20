package Penumpang_Pesawat;

public class PassengerRun {
    public static void main(String[] args) {
        Flight passengerName = new Flight();

        passengerName.addPassenger("Odi");
        passengerName.addPassenger("Vandi");
        passengerName.addPassenger("Noval");
        passengerName.addPassenger("Ela");
        passengerName.addPassenger("Salsa");
        passengerName.displayPassenger();

        System.out.println();
        passengerName.removePassenger("Salsa");
        System.out.println();
        passengerName.displayPassenger();
    }
}
