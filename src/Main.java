public class Main {
    public static void main(String[] args) {
        System.out.println("sum = " + sum(5, 5));

    }

    public static Integer sum(Integer a, Integer b) {
        if (a == null || b == null) {
            return null;
        }
        return a + b;
    }
}