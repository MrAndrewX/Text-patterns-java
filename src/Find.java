import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class Find {

    private final String text;

    public Find(String text) {
        this.text = text;
    }

    public boolean match(String pattern) {
        //Comprobamos si la strin esta vacia

        if (this.text.length() == 0 || pattern.length() == 0){
            return false;
        }

        int checked = 0;
        int index = 0;
        System.out.println(this.text.length());
            for (int i = 0; i < this.text.length() ; i++) {
                System.out.println(this.text.charAt(i));
                System.out.println("Searching pattern: " + pattern.charAt(index));
                    if (this.text.charAt(i) == pattern.charAt(index)){
                        System.out.println("Match!");
                        checked++;

                        if (pattern.length() > 1) index++;



                        if (pattern.length() == checked){
                            return true;
                        }

                    } else System.out.println("No mach");
                }


        return false;
    }

}

