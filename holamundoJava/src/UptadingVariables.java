public class UptadingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        int bono = 200;
        salary = salary+bono;
        System.out.println(salary);

        // pension: $50 descuento
        salary = salary - 50;
        System.out.println(salary);

        // 2 horas extra $30 c/u
        // comida -$45
        salary = salary + (30*2 ) - 45;
        System.out.println(salary);

        // Actualizando cadena de text
        String employeeName = "Pancracio Vega";
        employeeName =employeeName + " Cabecilarga";
        System.out.println(employeeName);
        employeeName = "Agustin " + employeeName;
        System.out.println(employeeName);
    }
}
