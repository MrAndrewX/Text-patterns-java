public class main {
    public static void main(String[] args) {
        Find find = new Find("a@?c");
        find.match("a?c");
        System.out.println(find.match("a?c"));

    }
}
