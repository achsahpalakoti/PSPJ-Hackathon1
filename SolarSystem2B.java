import java.util.Scanner;
class SolarSystem2B {
    public static void main(String args []){
        Scanner sc =new Scanner (System.in);
        int E = sc.nextInt();
        if (E>=10) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation " + E);
        }
    }
}