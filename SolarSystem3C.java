import java.util.Scanner;

class SolarSystem3C {

    static double TE(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double morningEnergy = sc.nextDouble();
        double eveningEnergy = sc.nextDouble();
        System.out.print("Enter morning energy: ");
        System.out.print("Enter evening energy: ");
        double totalEnergy = morningEnergy + eveningEnergy;
        System.out.println("Total energy generated: " + totalEnergy);
    }
}