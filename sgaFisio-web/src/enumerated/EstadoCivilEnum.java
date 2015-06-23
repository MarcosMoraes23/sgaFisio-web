package enumerated;

public enum EstadoCivilEnum
{
    casado(0),solteiro(1),viuvo(2),desquitado(3);
    
    private final Integer value;
    
    private EstadoCivilEnum(Integer value) 
    {
        this.value = value;
    }
    
    public Integer toInt()
    {
        return this.value;
    }
    
    
    
    public static EstadoCivilEnum fromInt (Integer value)
    {
        if (value == null)
            return null;
        
        switch(value)
        {
            case 0: return casado;
            case 1: return solteiro;
            case 2: return viuvo;
            case 3: return desquitado;
                
            default: return null;
        }
    
    }
    

    @Override
    public String toString()
    {
        switch(this)
        {
            case casado: return "Casado(a)";
            case solteiro: return "Solteiro(a)";
            case viuvo: return "Viúvo(a)";
            case desquitado: return "Desquitado(a)";
            default: return null;
        }
    }
    
}
