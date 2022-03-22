import java.util.LinkedList;

public class Pattern {
    Caixa<Component> components = new Caixa<>();

    public Pattern(String strpattern){
        for (int i = 0; i < strpattern.length(); i++) {
            char c = strpattern.charAt(i);
            if (c == '%' && i == 0){
                Component component = new Component();
                component.tipo = Component.TComponent.LBEGIN;

            }else if (c == '?'){
                Component component = new Component();
                component.tipo = Component.TComponent.QMARK;
                components.addElement(component);
            }else if (c == '$' && i == strpattern.length()-1){
                Component component = new Component();
                component.tipo = Component.TComponent.LINEEND;

            }else if (c == '['){
                Component component = new Component();
                component.tipo = Component.TComponent.CONJUNTOCHARS;
                component.caracter = c;
                components.addElement(component);
            }else if (c == '+' || c == '*'){
                Component component = new Component();
                component.tipo = Component.TComponent.CLOSURE;
                component.caracter = c;
                components.addElement(component);
            }else {
                if (c == '@'){
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


}
