public class main {
    public static void main(String[] args) {
        Find find = new Find("Liceu");
        Boolean result = find.match("Li");
        System.out.println(result);
    }
}
