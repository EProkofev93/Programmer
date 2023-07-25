public class Main {
    public static void main(String[] args) {

        Programmer petya = new Programmer("Petya", "Skillfactory");

        petya.work();
        petya.work();
        petya.work();
        petya.work();
        petya.work();

        System.out.println(petya.getPosition());

    }
}