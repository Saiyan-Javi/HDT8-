package HDT8;

public class PFactory extends Namer{
    public PFactory(String s){

        String nice;

        //Busca la primera coma y guarda desde el inicio hasta la coma para el nombre del proceso
        int i = s.indexOf(",");
        nombrep = s.substring(0, i).trim();
        s = s.replaceFirst(s.substring(0, i+1).trim(), "");

        //Busca para la segunda coma y guarda desde el nuevo inicio para el nombre del usuario y el valor nice
        i = s.indexOf(",");
        nombreu = s.substring(0, i);
        nice = s.replaceFirst(s.substring(0, i+1).trim(), "");

        vnice = Integer.parseInt(nice);
    }
}

