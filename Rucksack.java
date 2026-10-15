public class Rucksack
{
    private String  farbe;
    private int     volumen;
    private boolean wasserdicht;
    
    public Rucksack (String neuFarbe, int neuVolumen, boolean neuWasserdicht)
    {
        setFarbe (neuFarbe);
        setVolumen (neuVolumen);
        setWasserdicht (neuWasserdicht);
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
    
    public void setFarbe(String neuFarbe)
    {
        farbe = neuFarbe;
    }
    
    public void setVolumen(int volumen)
    {
        this.volumen = volumen;
    }
    
    public void setWasserdicht(boolean wasserdicht)
    {
        this.wasserdicht = wasserdicht;
    }
}
