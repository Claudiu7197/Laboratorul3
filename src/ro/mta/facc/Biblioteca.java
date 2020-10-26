package ro.mta.facc;

import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {
    private ArrayList<Carte> carti;
    public void sort()
    {
        Collections.sort(carti);
    }
    public Biblioteca() { carti = new ArrayList<Carte>();}
    public Biblioteca(ArrayList<Carte> carti) {
        carti = new ArrayList<Carte>();
        for (Carte c : carti) {
            this.carti.add(c);
        }
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
