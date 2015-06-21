package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
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

@Table(name = "fila_de_espera")
@NamedQuery(name = "FilaDeEspera.findAll", query = "SELECT f FROM FilaDeEspera f")
public class FilaDeEspera implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private Date dataInclusao;
    private Integer status;
    private Paciente paciente;
    private Secretaria secretaria;
    
    
    public FilaDeEspera() {}
    
    


    public FilaDeEspera(Long id, Date dataInclusao, Integer status,Paciente paciente, Secretaria secretaria) 
    {
		this.id = id;
		this.dataInclusao = dataInclusao;
		this.status = status;
		this.paciente = paciente;
		this.secretaria = secretaria;
	}

    

	@Override
	public String toString() 
	{
		return "FilaDeEspera [dataInclusao=" + dataInclusao + ", status="
				+ status + ", paciente=" + paciente + ", secretaria="
				+ secretaria + "]";
	}




	@Id
    @Basic(optional = false)
    @Column(name = "id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sequence_fila_de_espera")
	@SequenceGenerator(name="sequence_fila_de_espera", sequenceName="sequence_fila_de_espera", allocationSize=1)
    public Long getId() 
    {
        return id;
    }
    public void setId(Long id) 
    {
        this.id = id;
    }
    
    
    @Basic(optional = false)
    @Column(name = "data_inclusao")
    @Temporal(TemporalType.DATE)
    public Date getDataInclusao()
    {
        return dataInclusao;
    }
    public void setDataInclusao(Date dataInclusao) 
    {
        this.dataInclusao = dataInclusao;
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
