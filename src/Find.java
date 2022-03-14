import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class Find {

    private final String text;

    public Find(String text) {
        this.text = text;
    }

    public boolean match(String pattern) {
//        int checked = 0;
//        for (int i = 0; i < pattern.length(); i++) {
//            for (int j = 0; j < this.text.length(); j++) {
//
//                if (pattern.charAt(i) == this.text.charAt(j)){
//                    checked++;
//                } else continue;
//            }
//        }
        if (Objects.equals(text, "")){
            return false;
        }
        if (this.text.contains(pattern)) return true;



        return false;
    }

}

