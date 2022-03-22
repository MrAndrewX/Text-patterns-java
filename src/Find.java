public class Find {


    private String text;

    public Find(String text) {
        this.text = text;


    }

    public boolean match(String pattern) {
        Pattern patt = new Pattern(pattern);


        //Si el pattern esta vacio devolvemos 0
        if (pattern.length() == 0){
            return false;
        }
        int indicePattern = 0;

        for (int i = 0; i < this.text.length();i++) {
            char caracter = this.text.charAt(i);

//            if (pattern.charAt(0) == '%' && i == 0){
//                indicePattern++;
//            }
            System.out.println("Comparando text char:: "+caracter+" Con patt char: "+pattern.charAt(indicePattern));
            if (matchText(patt.components.get(indicePattern),caracter)){
                indicePattern++;
                System.out.println("Match");

            }else{

                if (pattern.charAt(0) == '%' && !matchText(patt.components.get(indicePattern),caracter)){
                    return false;

                }
                if (pattern.charAt(pattern.length()-1) == '$' && indicePattern == patt.components.size()-1){
                    return true;
                }
                i-=indicePattern;
                indicePattern = 0;
            }

                // Si la longitud del indice y el de numero de componentes coinciden
                if (indicePattern == patt.components.size()){
                    return true;
                }



        }

        return false;
    }

    private boolean matchText(Component component, char caracter) {
        switch (component.tipo) {
            case LBEGIN, LINEEND -> {return caracter == component.caracter;}
            case QMARK -> { return true; }
            case NORMALCHAR -> { return component.caracter == caracter; }
            case CONJUNTOCHARS -> {}
            case CLOSURE -> {}
        }


        return false;


    }

    public Object capture(String bbc) {
        return bbc;
    }
}
