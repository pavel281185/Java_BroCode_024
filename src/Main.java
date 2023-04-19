public class Main {
    public static void main(String[] args) {
        // printf()

        System.out.printf("This is something %d\n", 123);
        System.out.printf("%d This is something\n", 123);

        // conversion character
        System.out.printf("%b\n", true);
        System.out.printf("%c\n", 'A');
        System.out.printf("%s\n", "String");
        System.out.printf("%d\n", 50);
        System.out.printf("%f\n", 3.14);

        // width
        System.out.printf("%10s\n", "String");
        System.out.printf("%-2s\n", "String");

        // precision
        System.out.printf("%.2f\n", 3.14);

        // flags
        System.out.printf("%+20f\n", 3.14);
        System.out.printf("%020f\n", 3.14);
        System.out.printf("%,d\n", 100000);
    }
}