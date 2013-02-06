/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.guano;

/**
 *
 * @author tuson
 */
public class Alimento {
    public final String Nombre;
    public final float PrecioMV;
    public final float AVGMateria_seca;
    public final float Energia_met;
    public final float Prot_cruda;
    public final float Fibra_cruda;
    public final float Calcio;
    public final float Fosforo;
    public final float PDR; //Proteina degradable en el rumen
    public final float FDN; //Fibra detergente neutro
    
    public Alimento(String Nombre, float PrecioMV, float AVGMateria_seca,
            float Energia_met, float Prot_cruda, float Fibra_cruda,
            float Calcio, float Fosforo, float PDR, float FDN){
        this.Nombre = Nombre;
        this.PrecioMV = PrecioMV;
        this.AVGMateria_seca = AVGMateria_seca;
        this.Energia_met = Energia_met;
        this.Prot_cruda = Prot_cruda;
        this.Fibra_cruda = Fibra_cruda;
        this.Calcio = Calcio;
        this.Fosforo = Fosforo;
        this.PDR = PDR;
        this.FDN = FDN;
    }    
}
