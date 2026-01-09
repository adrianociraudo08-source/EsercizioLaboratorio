public class Bevande extends Prodotto
{
    private boolean senzaGlutine;
    private int calorie;

    public Bevande(boolean senzaGlutine, int calorie, String codiceProdotto, String nomeProdotto, double prezzo, int quantita) 
    {
        super(codiceProdotto, nomeProdotto, prezzo, quantita);
        this.senzaGlutine = senzaGlutine;
        this.calorie = calorie;
    }
    public boolean getSenzaGlutine()
    {
        return this.senzaGlutine;
    }
    public int getCalorie()
    {
        return this.calorie;
    }
    public void setSenzaGlutine(boolean senzaGlutine)
    {
        this.senzaGlutine=senzaGlutine;
    }
    public void setCalorie(int calorie)
    {
        this.calorie=calorie;
    }
    
}