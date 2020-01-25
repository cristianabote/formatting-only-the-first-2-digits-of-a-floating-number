public class Formatting {

    public static void main (String[] args){
        float f=1.93211f;
        double d=175.123456;
        String str_f = String.format("%.02f", f);
        System.out.println("numarul "+f+" scris cu 2 zecimale "+str_f);
        String str_d= String.format("%.2f", d);
        System.out.println("numarul "+d+" scris cu 2 zecimale "+str_d);

    }
}

/*
Formatting - First 2 digits of a floating number
Using String.format() method, please display in the
console the first 2 digits of a floating number (float or double: e.g. 1.93211 -> display only 1.93)
 */
