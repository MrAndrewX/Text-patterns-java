public class main {
    public static void main(String[] args) {
        Find find = new Find("Esternocleidomastoideo");
        Boolean result = find.match("Eo");
        System.out.println(result);
    }
}
