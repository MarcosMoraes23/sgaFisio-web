package enumerated;

public enum EtniaEnum
{
    branco(0), pardo(1), negro(2), indigena(3), amarelo(4);
    
    private final Integer value;
    
    private EtniaEnum(Integer value) 
    {
        this.value = value;
    }
    
    public Integer toInt()
    {
        return this.value;
    }
    
       
    public static EtniaEnum fromInt (Integer value)
    {
        if (value == null)
            return null;
        
        switch(value)
        {
            case 0: return branco;
            case 1: return pardo;
            case 2: return negro;
            case 3: return indigena;
            case 4: return amarelo;
                
            default: return null;
        }
    
    }
    

    @Override
    public String toString()
    {
        switch(this)
        {
            case branco: return "Branco(a)";
            case pardo: return "Pardo(a)";
            case negro: return "Negro(a)";
            case amarelo: return "Amarelo(a)";
            default: return null;
        }
    }
    
    
}
