public class switchStatement {
    public static void main(String[] args) {

        String colorModeSelected = "Dark";

        switch (colorModeSelected) {
            case "Ligth" :
                System.out.println(" Ligth mode it's On ");
                break;
            case "Nigth":
                System.out.println("Nigth mode it's On");
                break;
            case "Dark":
                System.out.println("Dark mode it's On");
                break;
            default:
                System.out.println("Please choose a mode ");
        }
    }
}
