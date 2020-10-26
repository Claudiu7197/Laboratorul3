package ro.mta.facc;

public class Carte implements Comparable<Carte>{
    private String titlu;
    private String autor;
    private int an_aparitie;
    private int nr_pag;
    @Override
public int compareTo(Carte o)
{
    if(this.nr_pag<o.nr_pag)
        return -1;
    if(this.nr_pag>o.nr_pag)
        return 1;

    return 0;
}
    public Carte(String titlu, String autor, int an_aparitie, int nr_pag) {
        this.titlu = titlu;
        this.autor = autor;
        this.an_aparitie = an_aparitie;
        this.nr_pag = nr_pag;
    }

    @Override
    public String toString()
    {
        return this.titlu+" scrisa de "+this.autor+" in anul "+this.an_aparitie;
    }
}
