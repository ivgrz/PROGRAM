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


        Double [] temp = new Double[5];
        temp[0] = 2.3;
        temp[1] = 15.23;
        temp[2] = 22.43;
        temp[3] = -5.66;
        temp[4] = 15.77;

        ContendorElementos<Double> t = new ContendorElementos<Double>(temp);
        t.apilar(2.45);
        t.apilar(33.56);
        t.encolar(12.45);
        t.encolar(41.44);

        System.out.println(t.desapilar());
        System.out.println(t.desapilar());
        System.out.println(t.desapilar());
        System.out.println(t.desencolar());
        System.out.println(t.desencolar());
        System.out.println(t.desencolar());

    }
}