package drags;

import java.util.Arrays;

public class Exceptions1 {

    public static void arrayOutOfBoundsException(){
        int[] array = new int[]{20, 39, 58, 29, 53};
        System.out.println(array[5]);
    }

    public static void divisionByZero(){
        int number1 = 10;
        int number2 = 0;
        int result = number1 / number2;
        System.out.println(result);
    }

    public static void numberFormatException(){
        String string = "123";
        int result = Integer.getInteger(string);
        System.out.println(result);
    }

    public static int[] divArrays(int[] a,int[] b) {
        if (a.length == b.length) {
            int[] c = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                if(b[i] == 0 || a[i] == 0){
                    throw new RuntimeException("Деление на ноль невозможно");
                }
                c[i] = a[i] / b[i];
            }
            return c;

            }
            return new int[]{0};

        }


    public static void main(String[] args) {
        int[] a = new int[]{4,5,8};
        int[] b = new int[]{1,2,9,4};
        System.out.println(Arrays.toString(divArrays(a,b)));

    }
    }

