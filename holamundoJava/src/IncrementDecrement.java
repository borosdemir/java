public class IncrementDecrement {
    public static void main(String[] args) {

        int lives = 5;
        lives = lives -1;
        System.out.println("lives: " + lives); //4

        // una forma mas directa seria:
        lives--; //Decrement
        System.out.println("lives: " + lives); //3

        lives++; //Increment
        System.out.println("lives: " + lives); // 4

        //Prefija
        // gana un regalo por ganar una vida

        int gift = 100 + ++lives; // prefijo
        System.out.println(gift);
        System.out.println(lives); // 5

    }
}
