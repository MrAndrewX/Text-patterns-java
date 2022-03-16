import java.util.LinkedList;

public class Pattern {
    Caixa<Component> components;
    public Pattern(String strpattern){
        for (int i = 0; i < strpattern.length(); i++) {
            char c = strpattern.charAt(i);
            if (c == '?'){
                Component component = new Component();
                component.tipo = Component.TComponent.QMARK;
                components.addElement(component);
            }else if (c == '%'){
                Component component = new Component();
                component.tipo = Component.TComponent.LBEGIN;
                components.addElement(component);
            }else if (c == '$'){
                Component component = new Component();
                component.tipo = Component.TComponent.LINEEND;
                components.addElement(component);
            }else if (c == '['){
                Component component = new Component();
                component.tipo = Component.TComponent.CONJUNTOCHARS;
                components.addElement(component);
            }else if (c == '+' || c == '*'){
                Component component = new Component();
                component.tipo = Component.TComponent.CLOSURE;
                components.addElement(component);
            }else {
                Component component = new Component();
                component.tipo = Component.TComponent.NORMALCHAR;
                components.addElement(component);
            }

        }
    }


}
