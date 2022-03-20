public class main {
    public static void main(String[] args) {
        Find find = new Find("stars*d+");
        Boolean result = find.match("@*d@*");
        System.out.println(result);


    }
}
