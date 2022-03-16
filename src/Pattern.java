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

            }
        }
    }


}
