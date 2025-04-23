public class Main {
    public static void main(String[] args) {
        Contendor<Integer> num = new Contendor<Integer>();
        num.guardar(5);
        Integer n = num.extraer();
        System.out.println(n);
        System.out.println(num.extraer());
        Contendor<String> cad = new Contendor<String>();
        cad.guardar("Hola");
        String c = cad.extraer();
        System.out.println(c);
        Contendor ele = new Contendor();
        ele.guardar(6);
        Object o = ele.extraer();
        System.out.println(o);
    }
}