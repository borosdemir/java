public class WhileLoop {

    static boolean isTurnOnLigth = false;

    public static void main(String[] args) {

        turnONOffLigth();
        int i = 1;
        while(isTurnOnLigth && i<=100){
            printSOS();
            i++;
        }
    }

    public static void printSOS(){
        System.out.println("... ___ ...");
    }

    public  static boolean turnONOffLigth(){
        isTurnOnLigth = (isTurnOnLigth)?false:true;
        return isTurnOnLigth;
    }
}
