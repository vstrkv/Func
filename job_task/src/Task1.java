public class Task1 {
    public static void main(String[] args) {

        MyFunc<?> myFunc = new MyFunc() {
            @Override
            public int testFunc(int param1, int param2) {
                return param1 - param2;
            }
        };

        MyFunc<?> myFunc2 = ((param1, param2) -> param1 + param2);


        MyFunc<Boolean> myFunc3 = MyFunc::kek;


        System.out.print("5 - 3 = ");
        testFunc(myFunc, 5, 3);

        System.out.print("5 + 3 = ");
        testFunc(myFunc2, 5,3);

        System.out.print("5 * 3 = ");
        testFunc(myFunc3, 5, 3 );

    }



    public static <T> void testFunc(MyFunc<T> f, int v1, int v2) {
        System.out.println(f.testFunc(v1, v2));
    }


}
@FunctionalInterface
interface MyFunc<T> {
    public int testFunc(int param1, int param2);

    static int kek(int i, int i1) {
        return i * i1;
    }
}
