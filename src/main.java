public class main {
    public static void main(String[] args) {
        Find find = new Find("This computer");
        Boolean result = find.match("computer$");
        System.out.println(result);

    }
}
