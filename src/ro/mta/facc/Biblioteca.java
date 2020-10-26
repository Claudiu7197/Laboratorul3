package ro.mta.facc;

import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {
    private ArrayList<Carte> lista_carti;
    public void sort()
    {
        Collections.sort(carti);
    }
    public Biblioteca() { carti = new ArrayList<Carte>();}
    public Biblioteca(ArrayList<Carte> lista_carti) {
        this.lista_carti = new ArrayList<Carte>();
        for (Carte c : lista_carti) {
            this.carti.add(c);
        }
    }
    public void removeBook(Carte c)
    {
        carti.remove(c);
    }
public void add(Carte c)
{
    this.carti.add(c);
}
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Biblioteca contine \n");
        for (Carte c : carti) {
            builder.append(c.toString());
            builder.append("\n");
        }

return builder.toString();
    }
}
