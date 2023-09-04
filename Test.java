public class Test {
    public static void run(){
        Math mat = new Math();
        int a = 4;
        int b = 8;
        int c = 10;
        int d = 12;
        int e = 14;

        System.out.println("a =" + a + " b = "+ b + " c = "+ c + " d = "+ d + " e = " + e);
        System.out.println("a+b= " + ((Math) mat).sum(a, b));
        System.out.println("a-b= " + mat.difference(a, b));
        System.out.println("b/c= " + mat.quotient(b, c));
        System.out.println("a*b= " + mat.product(a, b));
        System.out.println("Минимальное число из a и b=" + mat.min(a, b));
        System.out.println("Минимальное число из a и b и с= " + mat.min(a, b, c));
        System.out.println("Максимальное число из a и b= " +mat.max(a, b));
        System.out.println("Минимальное число из a и b и с=" + mat.max(a, b, c));
        System.out.println("c^a="+ mat.pow(c,a));
        System.out.println("НОД а и b " + mat.nod(a, b));
        System.out.println("НОК а и с" + mat.nok(a,b));
        System.out.println("Синус d " + mat.sin(d));
        System.out.println("Рандомное число" + mat.randomTwo());
    }

    }

