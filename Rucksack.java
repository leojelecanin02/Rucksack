public class Rucksack
{
    private String  farbe;
    private int     volumen;
    private boolean wasserdicht;
    
    public Rucksack (String farbe, int volumen, boolean wasserdicht)
    {
        setFarbe (farbe);
        setVolumen (volumen);
        setWasserdicht (wasserdicht);
    }
    
    public Rucksack (String farbe, int volumen)
    {
        setFarbe (farbe);
        setVolumen (volumen);
        setWasserdicht (false);
    }
    
    public Rucksack ()
    {
        setFarbe ("UNKN");
        setVolumen (0);
        setWasserdicht (false);
    }
    
    public String getFarbe()
    {
        return farbe;
    }
    
    public int getVolumen()
    {
        return volumen;
    }
    
    public boolean getWasserdicht()
    {
        return wasserdicht;
    }
    
    public void setFarbe(String farbe)
    {
        this.farbe = farbe;
    }
    
    public void setVolumen(int volumen)
    {
        this.volumen = volumen;
    }
    
    public void setWasserdicht(boolean wasserdicht)
    {
        this.wasserdicht = wasserdicht;
    }
    
    public void printRucksack()
    {
        System.out.println(farbe + " Rucksack: " + volumen + " Liter - " + wasserdicht);
    }
}
