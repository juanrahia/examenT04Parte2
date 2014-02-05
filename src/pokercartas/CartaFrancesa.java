package pokercartas;

/**
 *Crea una carta Estilo francés con número y palo
 * @author usuario
 */
public class CartaFrancesa {

    private int palo;
    private int numero;
    
    /**
     *Valor palo de Treboles
     */
    public static final int TREBOLES = 0;
    /**
     *Valor palo de Diamantes
     */
    public static final int DIAMANTES = 1;
    /**
     *Valor palo de Corazones
     */
    public static final int CORAZONES = 2;
    /**
     *Valor palo de Picas
     */
    public static final int PICAS = 3;
    /**
     *Valor para el Comodín
     */
    public static final int COMODIN = 4;

    /**
     *Constructor CartaFrancesa con dos parametros palo y numero
     * @param palo valor entre 0 y 4. Constantes
     * @param numero valor de la carta entre 1 y 12
     */
    public CartaFrancesa(int palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    /**
     *Obtener valor del palo
     * @return
     */
    public int getPalo() {
        return palo;
    }

    /**
     *Obtener valor del número
     * @return
     */
    public int getNumero() {
        return numero;
    }
    
    public String toString() {
        String retorno = "";
        if(numero>0 && numero<10) {
            retorno += numero+1;
        } else {
            switch(numero) {
                case 0:
                    retorno += "As";
                    break;
                case 10:
                    retorno += "J";
                    break;
                case 11:
                    retorno += "Q";
                    break;
                case 12:
                    retorno += "K";
                    break;
            }
        }
        retorno += " de ";
        switch(palo) {
            case TREBOLES:
                retorno+="Treboles";
                break;
            case DIAMANTES:
                retorno+="Diamantes";
                break;
            case PICAS:
                retorno+="Picas";
                break;
            case CORAZONES:
                retorno+="Corazones";
                break;
            case COMODIN:
                retorno+="Comodin";
                break;
        }
        return retorno;
    }
    
    /**
     *Traduce el valor del numero y el palo de la carta a un código
     * @return
     */
    public String toCodigo() {
        String retorno = "";
        switch(palo) {
            case TREBOLES:
                retorno+="T";
                break;
            case DIAMANTES:
                retorno+="D";
                break;
            case PICAS:
                retorno+="P";
                break;
            case CORAZONES:
                retorno+="C";
                break;
            case COMODIN:
                retorno+="J";
                break;
        }
        retorno+=numero;
        return retorno;
    }        
    
}
