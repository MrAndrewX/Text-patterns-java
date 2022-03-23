public class main {
    public static void main(String[] args) {
        Find find = new Find("This is your life");
        Boolean result = find.match("T[h]is");
        System.out.println(result);

    }
}
