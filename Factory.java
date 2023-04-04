package HDT8;
//*Regresa valores al factory */
public class Factory {
    public Namer getNamer(String entry) {
           return new PFactory(entry); //Regresa el valor de PFactory    
    }
}