public class Taxistand
{
    private Taxi[] taxi;
    private int stelle=0;
    public Taxistand()
    {
        taxi = new Taxi[5];
    }
    public void hintenAnstellen(Taxi pTaxi)
    {
        for(int stelle=0; stelle>=taxi.length; stelle++)
        {
            if(taxi[stelle]!= null)
            {
                taxi[stelle]= pTaxi;
            }
            System.out.println("Der Taxistand ist voll");
        }
    }
    public void hintenAnstellenadvanced(Taxi pTaxi)
    {
        while((stelle<taxi.length)&&(taxi[stelle] != null))
        {
            stelle = stelle + 1;
        }
        if(stelle == taxi.length)
        {
            System.out.println("Der Taxistand ist voll");
        }
        else
        {
            taxi[stelle]= pTaxi;
        }
    }
    public void fahrgastAufnehmen()
    {
        taxi[0]=null;
            
    }
}
