/**
 * prg
 */
public class prg {

    public static void main(String[] args) {

        byte bt = 100;
        short st = 1000;
        int i = 10000;
        long l = 100000L;
        float f = 10.5f;
        double d = 100.1010;
        char ch = 'A';
        boolean b = true;

        String bToS = Byte.toString(bt);
        System.out.println(bToS);

        String sToS = Short.toString(st);
        System.out.println(sToS);

        String iToS = Integer.toString(i);
        System.out.println(iToS);

        String lToS = Long.toString(l);
        System.out.println(lToS);

        String fToS = Float.toString(f);
        System.out.println(fToS);

        String dToS = Double.toString(d);
        System.out.println(dToS);

        String cToS = Character.toString(ch);
        System.out.println(cToS);

        String boToS = Boolean.toString(b);
        System.out.println(boToS);


        String b1 = String.valueOf(bt);
        System.out.println(b1);

        String s1 = String.valueOf(st);
        System.out.println(s1);

        String i1 = String.valueOf(i);
        System.out.println(i1);
        String l1 = String.valueOf(l);
        System.out.println(l1);

        String f1 = String.valueOf(f);
        System.out.println(f1);

        String d1 = String.valueOf(d);
        System.out.println(d1);

        String ch1 = String.valueOf(ch);
        System.out.println(ch1);

        String bo1 = String.valueOf(b);
        System.out.println(bo1);


    }
}