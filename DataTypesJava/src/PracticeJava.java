public class PracticeJava {
    public static void main(String[] args) {
        var esposa = " Yosh ";
        var hijos = " Mati y Thiago ";
        var mama = " Ana Parra ";
        var hermano = " Juan Cardenas ";
        var familia = hijos + mama + hermano ;
        System.out.println("Este es mi nucleo familiar : " + esposa + hijos + mama + hermano);

        char c = 'z';
        int cI = c;
        System.out.println( cI);
        System.out.println( c);

        int i = 250;
        long iL = 250L;
        short iS = (short)iL;
        System.out.println(i);
        System.out.println(iL);
        System.out.println(iS);

        double d = 301.067;
        int dI = (int)d;
        long dL = dI;
        System.out.println(d);
        System.out.println(dI);
        System.out.println(dL);

        int a = 100;
        var aS = a + 5000.66;
        float aF = (float) aS;
        System.out.println(a);
        System.out.println(aS);
        System.out.println(aF);

        int b2 = 737;
        var b = b2 * 100;
        byte bB = (byte) b;
        System.out.println(b);
        System.out.println(bB);

        double k = 298.638;
        var kV = k/25;
        long kL = (long)kV;
        System.out.println(k);
        System.out.println(kV);
        System.out.println(kL);


    }
}
