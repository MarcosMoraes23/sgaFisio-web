package enumerated;

public enum StatusAgendaEnum
{
    cancelada(0), falta(1), concluida(2);
    
    private final Integer value;
    
    private StatusAgendaEnum (Integer value) 
    {
        this.value = value;
    }
    
    public Integer toInt()
    {
        return this.value;
    }
    
    
    
    public static StatusAgendaEnum fromInt (Integer value)
    {
        if (value == null)
            return null;
        
        switch(value)
        {
            case 0: return cancelada;
            case 1: return falta;
            case 2: return concluida;
                
            default: return null;
        }
    
    }

    @Override
    public String toString()
    {
        switch(this)
        {
            case cancelada: return "Sessão Cancelada";
            case falta: return "Falta";
            case concluida: return "Sessão Concluída";
                
            default: return null;
        }
    }
    
}
