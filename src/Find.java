

public class Find {


    private String text;

    public Find(String text) {
        this.text = text;


    }

    public boolean match(String pattern) {
    Pattern patt = new Pattern(pattern);
    int indicePattern = 0;
        System.out.println(patt.components);
        for (int i = 0; i < this.text.length(); i++) {
            char caracter = this.text.charAt(i);
            if (isMatching(patt.components.get(indicePattern),caracter)){
                System.out.println("Match!");
            }else{
                System.out.println("not match");
            }
       }

    return false;
    }

    private boolean isMatching(Component component, char caracter) {
        System.out.println("Componente caracter: " + component.caracter + " caracter: "+caracter);
        if (((component.caracter) == caracter){

            return true;
        }else{
            return false;
        }
    }
}


