package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "atendimento")
@NamedQuery(name = "Atendimento.findAll", query = "SELECT a FROM Atendimento a")
public class Atendimento implements Serializable 
{
    private static final long serialVersionUID = 1L;
    private Long id;
    private Date dataAtendimento;
    private Date hora;
    private String descricaoAtendimento;
    private Agenda agenda;

    
    public Atendimento() {}
    
    


    public Atendimento(Long id, Date dataAtendimento, Date hora,String descricaoAtendimento, Agenda agenda)
    {
		this.id = id;
		this.dataAtendimento = dataAtendimento;
		this.hora = hora;
		this.descricaoAtendimento = descricaoAtendimento;
		this.agenda = agenda;
	}

    


	@Override
	public String toString() 
	{
		return "Atendimento [dataAtendimento=" + dataAtendimento
				+ ", hora=" + hora + ", descricaoAtendimento="
				+ descricaoAtendimento + "]";
	}




	@Id
    @Basic(optional = false)
    @Column(name = "id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sequence_atendimento")
	@SequenceGenerator(name="sequence_atendimento", sequenceName="sequence_atendimento", allocationSize=1)
    public Long getId()
    {
        return id;
    }
    public void setId(Long id) 
    {
        this.id = id;
    }

    
    @Basic(optional = false)
    @Column(name = "data_atendimento")
    @Temporal(TemporalType.DATE)
    public Date getDataAtendimento()
    {
        return dataAtendimento;
    }
    public void setDataAtendimento(Date dataAtendimento) 
    {
        this.dataAtendimento = dataAtendimento;
    }

    
    @Basic(optional = false)
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    public Date getHora() 
    {
        return hora;
    }
    public void setHora(Date hora)
    {
        this.hora = hora;
    }

    
    @Column(name = "descricao_atendimento")
    public String getDescricaoAtendimento() 
    {
        return descricaoAtendimento;
    }
    public void setDescricaoAtendimento(String descricaoAtendimento)
    {
        this.descricaoAtendimento = descricaoAtendimento;
    }

    
    @JoinColumn(name = "id_agenda", referencedColumnName = "id")
    @ManyToOne(optional = false)
    public Agenda getAgenda() 
    {
        return agenda;
    }
    public void setAgenda(Agenda agenda) 
    {
        this.agenda = agenda;
    }
    
}
