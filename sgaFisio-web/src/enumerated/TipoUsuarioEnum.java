package enumerated;

public enum TipoUsuarioEnum
{
    supervisor(0), secretaria(1), estagiario(2), administrador(3);
    
    
    private final Integer value;
    
    
    private TipoUsuarioEnum(Integer value) 
    {
        this.value = value;
    }
    
    public Integer toInt()
    {
        return this.value;
    }
    
    
    
    public static TipoUsuarioEnum fromInt (Integer value)
    {
        if (value == null)
        {
            return null;
        }
        
        switch(value)
        {
            
        
            case 0: return supervisor;
            case 1: return secretaria;
            case 2: return estagiario;
            case 3: return administrador;
                
            default: return null;
        }
    
    }
    
    
    @Override
    public String toString()
    {
        switch(this)
        {
            case supervisor: return "Supervisor";
            case secretaria: return "Secretária";
            case estagiario: return "Estagiária(o)";
            case administrador: return "Administrador";
                
            default: return null;
        }
    }
    
    
    
    
}
