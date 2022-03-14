import java.util.Arrays;
import java.util.List;


public class Find {

    private String text;
    public Find(String text) {
        this.text = text;
    }
    public boolean match(String pattern) {
        String[] textChars = new String[this.text.length()];
        textChars = text.split("");

        //Creamos una array de strings que en cada posición contendrá un caracter.

        System.out.println(Arrays.toString(textChars));

        String[] patternarr = pattern.split("");
        System.out.println(Arrays.toString(patternarr));


        for (int i = 0; i < this.text.length(); i++) {
            for (int j = 0; j < patternarr.length; j++) {
                if (textChars[i].equals(patternarr[j])){
                    if (textChars[i+1].equals(patternarr[j+1])){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
