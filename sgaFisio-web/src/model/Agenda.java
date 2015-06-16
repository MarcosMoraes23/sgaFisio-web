package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "agenda")
@NamedQuery(name = "Agenda.findAll", query = "SELECT a FROM Agenda a")
public class Agenda implements Serializable 
{
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private Date hora;  
    private Date dataAgenda;   
    private Integer status;    
    private List<Atendimento> atendimentos;   
    private Estagiario estagiario;   
    private Paciente paciente;  
    private Secretaria secretaria;

    public Agenda() {}

    
    public Agenda(Long id, Date hora, Date dataAgenda, Integer status,List<Atendimento> atendimentos, Estagiario estagiario,Paciente paciente, Secretaria secretaria) 
    {
		this.id = id;
		this.hora = hora;
		this.dataAgenda = dataAgenda;
		this.status = status;
		this.atendimentos = atendimentos;
		this.estagiario = estagiario;
		this.paciente = paciente;
		this.secretaria = secretaria;
	}

    
    
    

	@Override
	public String toString() 
	{
		return "Agenda [hora=" + hora + ", dataAgenda=" + dataAgenda
				+ ", status=" + status + ", estagiario=" + estagiario
				+ ", paciente=" + paciente + "]";
	}


	@Id
    @Basic(optional = false)
    @Column(name = "id")
    public Long getId() 
    {
        return id;
    }
    public void setId(Long id) 
    {
        this.id = id;
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

    
    @Basic(optional = false)
    @Column(name = "data_agenda")
    @Temporal(TemporalType.DATE)
    public Date getDataAgenda() 
    {
        return dataAgenda;
    }
    public void setDataAgenda(Date dataAgenda) 
    {
        this.dataAgenda = dataAgenda;
    }
    
    
    @Column(name = "status")
    public Integer getStatus()
    {
        return status;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agenda")
    public List<Atendimento> getAtendimentos() 
    {
        return atendimentos;
    }
    public void setAtendimentos(List<Atendimento> atendimentos) 
    {
        this.atendimentos = atendimentos;
    }
    
    
    @JoinColumn(name = "id_estagiario", referencedColumnName = "id")
    @ManyToOne(optional = false)
    public Estagiario getIdEstagiario()
    {
        return estagiario;
    }

    public void setEstagiario(Estagiario estagiario) 
    {
        this.estagiario = estagiario;
    }
    
    
    @JoinColumn(name = "id_paciente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    public Paciente getPaciente() 
    {
        return paciente;
    }
    public void setPaciente(Paciente paciente) 
    {
        this.paciente = paciente;
    }

    
    @JoinColumn(name = "id_secretaria", referencedColumnName = "id")
    @ManyToOne(optional = false)
    public Secretaria getSecretaria()
    {
        return secretaria;
    }
    public void setSecretaria(Secretaria secretaria) 
    {
        this.secretaria = secretaria;
    }

}
