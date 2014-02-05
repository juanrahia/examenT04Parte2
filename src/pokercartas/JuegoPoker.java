
package pokercartas;


public class JuegoPoker {
    public static final int NADA = 0;
    public static final int PAREJA = 2;
    public static final int TRIO = 3;
    public static final int POKER = 4;
    public static final int REPOKER = 5;  
    
    public int getCombinacion(CartaFrancesa carta1, CartaFrancesa carta2, CartaFrancesa carta3, CartaFrancesa carta4, CartaFrancesa carta5){
        
        int combinaciones = 0;
        if(carta1.toCodigo().equals(carta2.toCodigo()))
            combinaciones++;
        if(carta1.toCodigo().equals(carta3.toCodigo()))
            combinaciones++;
        if(carta1.toCodigo().equals(carta4.toCodigo()))
            combinaciones++;
        if(carta1.toCodigo().equals(carta5.toCodigo()))
            combinaciones++;
        if(carta2.toCodigo().equals(carta3.toCodigo()))
            combinaciones++;
        if(carta2.toCodigo().equals(carta4.toCodigo()))
            combinaciones++;
        if(carta2.toCodigo().equals(carta5.toCodigo()))
            combinaciones++;
        if(carta3.toCodigo().equals(carta4.toCodigo()))
            combinaciones++;
        if(carta3.toCodigo().equals(carta5.toCodigo()))
            combinaciones++;
        if(carta4.toCodigo().equals(carta5.toCodigo()))
            combinaciones++;
        return combinaciones;
    }
}
