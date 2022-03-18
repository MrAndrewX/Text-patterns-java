

public class Find {


    private String text;

    public Find(String text) {
        this.text = text;


    }

    public boolean match(String pattern) {
    Pattern patt = new Pattern(pattern);
    int indicePattern = 0;
    //Si el pattern esta vacio devolvemos 0
    if (pattern.length() == 0){return false;}

        System.out.println(patt.components);
        for (int i = 0; i < this.text.length(); i++) {
            char caracter = this.text.charAt(i);

            if (isMatching(patt.components.get(indicePattern),caracter)){
                indicePattern++;
                System.out.println("Match!");
            }else{
                i-=indicePattern;
                indicePattern = 0;
            }


       }

    return false;
    }

    private boolean isMatching(Component component, char caracter) {
        System.out.println("Componente caracter: " + component.caracter + " caracter: "+caracter);

        switch (component.tipo) {
            case QMARK -> { return true; }
            case NORMALCHAR -> { return component.caracter == caracter; }

        }


        if (((component.caracter) == caracter)){

            return true;
        }else{
            return false;
        }


        }
    }



