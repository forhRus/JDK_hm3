import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        /*
        Задача 1
        Calculator calculator = new Calculator();
        int intN = 5;
        float floatN = 2.34f;
        byte byteN = 24;
        double doubleN = 1.212;
        long longN = 15L;
        System.out.println(calculator.sum(intN, floatN));
        System.out.println(calculator.multiply(intN, doubleN));
        System.out.println(calculator.divide(byteN, intN));
        System.out.println(calculator.substract(byteN, longN));
         */


        /*
        Задание 2
        Integer[] arr1 = new Integer[]{1, 2, 3};
        Double[] arr2 = new Double[]{1., 2., 3., 4.};
        Double[] arr3 = new Double[]{1., 2., 3., 4.};
        Double[] arr4 = new Double[]{};
        Integer[] arr5 = new Integer[]{};
        Cat[] cats1 = new Cat[]{new Cat("cat1"), new Cat("cat2")};
        Cat[] cats1_1 = new Cat[]{new Cat("cat1"), new Cat("cat2")};
        Cat[] cats2 = new Cat[]{new Cat("cat1"), new Cat("cat3")};
        Cat[] cats3 = new Cat[]{new Cat("cat1"), new Cat("cat2"), new Cat("cat3")};
        System.out.println(compareArrays(arr1, arr2)); // false
        System.out.println(compareArrays(arr3, arr2)); // true
        System.out.println(compareArrays(arr4, arr5)); // false
        System.out.println(compareArrays(cats1, cats1_1)); // true
        System.out.println(compareArrays(cats1, cats2)); // true (одинаковая длинаб одинаковый тип)
        System.out.println(compareArrays(cats1, cats3)); // false
        System.out.println(compareArrays(cats3, arr1)); // false
         */

        /*
        Задание 3
        ArrayList<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            pairs.add(new Pair<Integer, Cat>(i, new Cat("cat" + i)));
        }

        for (Pair p : pairs) {
            System.out.println(p);
        }
         */

    }

    private static <T, U> boolean compareArrays(T[] arr1, U[] arr2) {
        if (arr1 != arr2) {
            if (arr1 == null || arr2 == null ||
                    arr1.length != arr2.length ||
                    arr1.getClass() != arr2.getClass()) {
                return false;
            }
        }
        return true;
    }

}

