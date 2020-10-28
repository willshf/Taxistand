    /**
 * Einfache Datentyp-Klasse fuer Taxis. Taxis haben einen Fahrer und koennen Fahrgaeste aufnehmen.
 */
public class Taxi
{
    private String fahrer; 
    private boolean besetzt; 

    /**
     * Konstruiert ein Taxi mti einem bestimmten Fahrer.
     */
    public Taxi(String fahrername)
    {
        this.fahrer = fahrername; 
    }
    
    /**
     * Fahrername abfragen
     */
    public String gibFahrer()
    {
        return fahrer;
    }
    
    /**
     * Das Taxi ist besetzt. 
     */
    public void besetzen()
    {
        besetzt = true; 
    }
    
    /**
     * Das Taxi ist wieder verfuegbar.
     */
    public void leeren()
    {
        besetzt = false; 
    }
    
    /**
     * Fragt ab, ob das Taxi besetzt ist.
     */
    public boolean istBesetzt()
    {
        return besetzt; 
    }

}
