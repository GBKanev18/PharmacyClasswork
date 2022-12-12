import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Pharmacy pharmacy1 = new Pharmacy("Steroids", 10, 3, "04/05/2025");
        Pharmacy pharmacy2 = new Pharmacy("Vitamin C", 4, 99, "11/14/2027");
        Pharmacy pharmacy3 = new Pharmacy("Aspirin", 7, 58, "09/11/2034");

        ArrayList<Pharmacy> pharmacies = new ArrayList<>();

        pharmacies.add(pharmacy1);
        pharmacies.add(pharmacy2);
        pharmacies.add(pharmacy3);

        printPharmacyWithHigherPriceThanFive(pharmacies);

    }

    private static void printPharmacyWithHigherPriceThanFive(ArrayList<Pharmacy> pharmacies) {

        ArrayList<Pharmacy> newPharmacies = new ArrayList<>();

        for (Pharmacy p : pharmacies) {

            if(p.price > 5) {
                newPharmacies.add(p);
            }

        }

        for (Pharmacy p : newPharmacies) {

            System.out.println(p.toString());

        }

    }
}