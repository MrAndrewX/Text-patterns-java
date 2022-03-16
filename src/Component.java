public class Component{

    enum TComponent{
        NORMALCHAR, // Si es un caracter normal
        QMARK, //Si es interrogante
        LBEGIN, //Si es comienzo de linea
        LINEEND, //Si es final de linea
        CONJUNTOCHARS, // Conjunto de chars entre corchetes [-----]
        CLOSURE //* => 0 o más | + => 1 o más
    };
    TComponent tipo;
    char caracter;  // Caracter normal
    char[] rango;


}
