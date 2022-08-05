package practice;

public class Chapter15_3 {
    public static void main(String[] args) {
            int i1 = 123;
            double d1 = i1;//int型（32bit）をdouble型（64bit）へ代入するので、自動でキャストされる
            System.out.println(d1);

            double d2 = 12.345;
            int i2 = (int) d2;//double型（64bit）をint型（32bit）へ代入するので、キャストする必要がある
            System.out.println(i2);

            int i3 = 1;
            int i4 = 2;
            double d3 = i3 / (double) i4;//int型とint型の演算なので、答えもint型になってしまうので、double型へのキャストが必要
            System.out.println(d3);

            int i5 = 128;
            byte b1 = (byte) i5;//int型（32bit）をbyte型（8bit）へ代入するので、キャストする必要がある
            System.out.println(b1);
    }
}
