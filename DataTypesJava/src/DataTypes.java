public class DataTypes {
    public static void main(String[] args) {
        // El tipo de dato int tiene un limite de 10 digitos

        int n = 1234567890;
        long nL = 12345678910L;

        double nD = 123.456;
        float nF = 123.456F;

        var salary = 1000; // int
        // pension 3%
        var pension = salary * 0.03; // double
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Pancracio";
        System.out.println("Employee:" + employeeName + " Salary:" + totalSalary);



    }
}
