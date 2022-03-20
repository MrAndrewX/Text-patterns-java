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
            if (containsScapedCaracter(pattern)){
                int contadorArrobas = arrobas(pattern);
                if(IndexesMatches(indicePattern,pattern.length()-contadorArrobas)){
                    return true;
                }
            }
            if (IndexesMatches(indicePattern,pattern.length())){
                return true;
            }
        }

        return false;
    }

    private int arrobas(String pattern) {
        int numarrobas = 0;
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == '@'){
                numarrobas++;
            }
        }
        return numarrobas;
    }

    private boolean IndexesMatches(int indicePattern, int length) {
        if (indicePattern == length){
            return true;
        }
        return false;
    }

    private boolean containsScapedCaracter(String pattern) {
        if (pattern.contains("@")){
            return true;
        }
        return false;
    }

    private boolean isMatching(Component component, char caracter) {
        System.out.println("Componente caracter: " + component.caracter + " caracter: "+caracter);

        switch (component.tipo) {
            case LBEGIN -> {}
            case QMARK -> { return true; }
            case NORMALCHAR -> { return component.caracter == caracter; }
            case LINEEND -> {}
            case CONJUNTOCHARS -> {}
            case CLOSURE -> {}
        }


        if (((component.caracter) == caracter)){

            return true;
        }else{
            return false;
        }


    }

    public Object capture(String bbc) {
        return bbc;
    }
}
