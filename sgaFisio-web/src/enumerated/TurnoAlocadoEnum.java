package enumerated;

public enum TurnoAlocadoEnum 
{
    manha(0), tarde(1), noite(2);
    
    
    private final Integer value;
    
    
    private TurnoAlocadoEnum(Integer value) 
    {
        this.value = value;
    }
    
    public Integer toInt()
    {
        return this.value;
    }
    
    
    
    public static TurnoAlocadoEnum fromInt (Integer value)
    {
        if (value == null)
        {
            return null;
        }
        
        switch(value)
        {
            case 0: return manha;
            case 1: return tarde;
            case 2: return noite;
                
            default: return null;
        }
    
    }
    
    
    @Override
    public String toString()
    {
        switch(this)
        {
            case manha: return "Manhã";
            case tarde: return "Tarde";
            case noite: return "Noite";
                
            default: return null;
        }
    }
    
    
    
    
}
