import java.util.ArrayList;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args) 
    {
        int i;
        ArrayList<Prodotto> Prodotti= new ArrayList<>();
        Prodotti.add(new Prodotto("A1","Pane",1.20,200));
        Prodotti.add(new Prodotto("A2", "Latte", 1.50, 100));
        Prodotti.add(new Prodotto("A3", "Uova", 2.30, 150));
        Prodotti.add(new Prodotto("A4", "Burro", 2.00, 80));
        Prodotti.add(new Prodotto("A5", "Formaggio", 3.50, 60));
        Prodotti.add(new Prodotto("A6", "Pasta", 1.10, 300));
        Prodotti.add(new Prodotto("A7", "Riso", 1.80, 250));
        Prodotti.add(new Prodotto("A8", "Zucchero", 1.25, 200));
        Prodotti.add(new Prodotto("A9", "Farina", 0.90, 180));
        Prodotti.add(new Prodotto("A10", "Olio", 4.00, 90));
        for(i=0;i<Prodotti.size();i++)
        {
            System.err.println("Codice Prodotto " + Prodotti.get(i).codiceProdotto + " nome prodotto " + Prodotti.get(i).nomeProdotto + " prezzo " + Prodotti.get(i).prezzo + " quantita " + Prodotti.get(i).quantita);
        }
        
        Scanner input = new Scanner(System.in);
        System.err.println("Inserisci il codice prodotto da cercare");
        String codiceProdotto1= input.nextLine();
        for(i=0;i<Prodotti.size();i++)
        {
            if(Prodotti.get(i).codiceProdotto.equals(codiceProdotto1))
            {
                
                if(Prodotti.get(i).quantita>0)
                {
                    System.err.println("Prodotto trovato e disponibile");
                    System.err.println("Inserisci la quantita che vuoi comprare");
                    int quantita1 = input.nextInt();
                    System.err.println("Hai acquistato con successo " + Prodotti.get(i).quantita + " pezzi di " + Prodotti.get(i).nomeProdotto + " a " + Prodotti.get(i).prezzo*quantita1);
                    Prodotti.get(i).quantita=Prodotti.get(i).quantita-quantita1;

                }
                else
                {
                        System.err.println("Prodotto esaurito");
                }    
                       
                       
            }

        }
        
        
    }
}