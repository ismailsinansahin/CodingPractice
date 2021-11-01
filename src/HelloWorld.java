public class HelloWorld {

    public static void main(String[] args) {

        int i = 10;
        System.out.println(i++);  //10 - print i then increase i 1
        System.out.println(++i);  //12 - increase i 1 then print i

        int a = 1;
        int b = 2;
        System.out.println(++a + b++);
        //a=2 then use 2 + use 2 then b=3
        System.out.println(++a + b++ - a--);
        //a=3 then use 3 + use 3 then b=4 - use 3 then a=2

    }

}


