import java.util.LinkedList;

public class Pattern {
    Caixa<Component> components = new Caixa<>();
    boolean containsBline = false;
    boolean containsEline = false;

    public Pattern(String strpattern) {
        for (int i = 0; i < strpattern.length(); i++) {
            char c = strpattern.charAt(i);
            if (c == '%' && i == 0) {
                Component component = new Component();
                component.tipo = Component.TComponent.LBEGIN;
                containsBline = true;
            } else if (c == '?') {
                Component component = new Component();
                component.tipo = Component.TComponent.QMARK;
                components.addElement(component);
            } else if (c == '$' && i == strpattern.length() - 1) {
                Component component = new Component();
                component.tipo = Component.TComponent.LINEEND;
                containsEline = true;
            } else if (c == '[') {
                Component component = new Component();
                component.tipo = Component.TComponent.CONJUNTOCHARS;
                String charclases = "";

                for (int j = i; c != ']'; j++) {
                    c = strpattern.charAt(i);
                    charclases += c;
                    i = j;
                }
                i--;

                charclases = beautfierCharClases(charclases);
                component.rango = charclases.toCharArray();
                components.addElement(component);

            } else if (c == '+' || c == '*') {
                Component component = new Component();
                component.tipo = Component.TComponent.CLOSURE;
                component.caracter = c;
                components.addElement(component);
            } else {
                if (c == '@') {
                    i++;
                    c = strpattern.charAt(i);
                }
                Component component = new Component();
                component.tipo = Component.TComponent.NORMALCHAR;
                component.caracter = c;
                components.addElement(component);
            }
        }


        System.out.println("List comp:");
        for (int i = 0; i < components.size(); i++) {
            System.out.println(components.get(i));
        }

    }

    private String beautfierCharClases(String charclases) {
        String result = "";
        for (int i = 0; i < charclases.length(); i++) {
            char c = charclases.charAt(i);

            if (c == '[' || c == ']'){
                continue;
            }
            if (i != charclases.length()-1){
                if (charclases.charAt(i+1) == '-') {
                    for (int j = 0; j < charclases.charAt(i+2)-charclases.charAt(i); j++) {
                        result += c++;
                    }


                }

            }
            result += c;

        }
        return result;
    }
}
