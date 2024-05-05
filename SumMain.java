public class SumMain {
    public static void main(String[] args) {

        SumInter s1 = new SumInter() {

            @Override
            public int returnsum(int a, int b) {
                return a + b;
            }
        };
        System.out.println(s1.returnsum(10, 20));

        // Lambada Expression
        SumInter s2 = (int a, int b) -> {
            return a + b;
        };

        System.out.println(s2.returnsum(10, 40));
        System.out.println(s2.returnsum(7, 4));

        SumInter s3 = (a, b) -> a + b;

        System.out.println(s3.returnsum(12, 12));

        // Long Way
        LengthInter l1 = (String str) -> {

            return str.length();
        };

        System.out.println(l1.lenString("amit"));

        // Short Way
        LengthInter l2 = str -> str.length();

        System.out.println(l2.lenString("mohan"));
    }

}
