package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "paciente")
@NamedQuery(name = "Paciente.findAll", query = "SELECT p FROM Paciente p")
public class Paciente implements Serializable 
{
    private static final long serialVersionUID = 1L;
    private Long id;
    private String nome;
    private Date dataNascimento;
    private String cpf;
    private String rg;
    private String telefone;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua; 
    private String cep;
    private Integer numero;
    private String complemento;
    private Integer etnia;
    private Integer estadoCivil;
    private Boolean sexo;
    private String ocupacaoAtual;
    private String responsavel;
    private Boolean isencao;
    private BigDecimal valorPago;
    private Integer falta;
    private Boolean alta;
    private List<FilaDeEspera> filasDeEspera; 
    private List<Anamnese> anamneses;
    private List<Agenda> agendas;

    public Paciente() {}
   
    
    

    public Paciente(Long id, String nome, Date dataNascimento, String cpf,String rg, String telefone, String estado, String cidade,String bairro, String rua, String cep, Integer numero,String complemento, Integer etnia, Integer estadoCivil,Boolean sexo, String ocupacaoAtual, String responsavel,Boolean isencao, BigDecimal valorPago, Integer falta, Boolean alta,List<FilaDeEspera> filasDeEspera, List<Anamnese> anamneses,List<Agenda> agendas) 
    {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.rg = rg;
		this.telefone = telefone;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
		this.etnia = etnia;
		this.estadoCivil = estadoCivil;
		this.sexo = sexo;
		this.ocupacaoAtual = ocupacaoAtual;
		this.responsavel = responsavel;
		this.isencao = isencao;
		this.valorPago = valorPago;
		this.falta = falta;
		this.alta = alta;
		this.filasDeEspera = filasDeEspera;
		this.anamneses = anamneses;
		this.agendas = agendas;
	}



	@Override
	public String toString() 
	{
		return "Paciente [nome=" + nome + ", dataNascimento=" + dataNascimento
				+ ", telefone=" + telefone + ", responsavel=" + responsavel
				+ ", isencao=" + isencao + ", valorPago=" + valorPago
				+ ", falta=" + falta + ", alta=" + alta + ", agendas="
				+ agendas + "]";
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
    @Column(name = "nome")
    public String getNome() 
    {
        return nome;
    }
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    
    @Basic(optional = false)
    @Column(name = "data_nascimento")
    @Temporal(TemporalType.DATE)
    public Date getDataNascimento() 
    {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) 
    {
        this.dataNascimento = dataNascimento;
    }

    
    @Basic(optional = false)
    @Column(name = "cpf")
    public String getCpf() 
    {
        return cpf;
    }
    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }
    
    
    @Column(name = "rg")
    public String getRg() 
    {
        return rg;
    }
    public void setRg(String rg) 
    {
        this.rg = rg;
    }

    
    @Column(name = "telefone")
    public String getTelefone()
    {
        return telefone;
    }
    public void setTelefone(String telefone) 
    {
        this.telefone = telefone;
    }

    
    @Basic(optional = false)
    @Column(name = "estado")
    public String getEstado() 
    {
        return estado;
    }
    public void setEstado(String estado) 
    {
        this.estado = estado;
    }

    
    @Basic(optional = false)
    @Column(name = "cidade")
    public String getCidade() 
    {
        return cidade;
    }
    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    }

    
    @Basic(optional = false)
    @Column(name = "bairro")
    public String getBairro()
    {
        return bairro;
    }
    public void setBairro(String bairro)
    {
        this.bairro = bairro;
    }

    
    @Basic(optional = false)
    @Column(name = "rua")
    public String getRua() 
    {
        return rua;
    }
    public void setRua(String rua)
    {
        this.rua = rua;
    }

    
    @Column(name = "cep")
    public String getCep()
    {
        return cep;
    }
    public void setCep(String cep) 
    {
        this.cep = cep;
    }
    

    @Basic(optional = false)
    @Column(name = "numero")
    public Integer getNumero() 
    {
        return numero;
    }
    public void setNumero(Integer numero)
    {
        this.numero = numero;
    }

    
    @Basic(optional = false)
    @Column(name = "complemento")
    public String getComplemento() 
    {
        return complemento;
    }
    public void setComplemento(String complemento)
    {
        this.complemento = complemento;
    }

    
    @Basic(optional = false)
    @Column(name = "etnia")
    public Integer getEtnia() 
    {
        return etnia;
    }
    public void setEtnia(Integer etnia) 
    {
        this.etnia = etnia;
    }

    
    @Basic(optional = false)
    @Column(name = "estado_civil")
    public Integer getEstadoCivil() 
    {
        return estadoCivil;
    }
    public void setEstadoCivil(Integer estadoCivil)
    {
        this.estadoCivil = estadoCivil;
    }

    
    @Column(name = "sexo")
    public Boolean getSexo() 
    {
        return sexo;
    }
    public void setSexo(Boolean sexo)
    {
        this.sexo = sexo;
    }

    
    @Column(name = "ocupacao_atual")
    public String getOcupacaoAtual() 
    {
        return ocupacaoAtual;
    }
    public void setOcupacaoAtual(String ocupacaoAtual) 
    {
        this.ocupacaoAtual = ocupacaoAtual;
    }

    
    @Column(name = "responsavel")
    public String getResponsavel()
    {
        return responsavel;
    }
    public void setResponsavel(String responsavel)
    {
        this.responsavel = responsavel;
    }
    

    @Basic(optional = false)
    @Column(name = "isencao")
    public Boolean getIsencao() 
    {
        return isencao;
    }
    public void setIsencao(Boolean isencao) 
    {
        this.isencao = isencao;
    }

    
    @Column(name = "valor_pago")
    public BigDecimal getValorPago() 
    {
        return valorPago;
    }
    public void setValorPago(BigDecimal valorPago) 
    {
        this.valorPago = valorPago;
    }
    
    
    @Basic(optional = false)
    @Column(name = "falta")
    public Integer getFalta() 
    {
        return falta;
    }
    public void setFalta(Integer falta) 
    {
        this.falta = falta;
    }

    
    @Column(name = "alta")
    public Boolean getAlta() 
    {
        return alta;
    }
    public void setAlta(Boolean alta) 
    {
        this.alta = alta;
    }
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente")
    public List<FilaDeEspera> getFilasDeEspera()
    {
        return filasDeEspera;
    }
    public void setFilaDeEsperaList(List<FilaDeEspera> filasDeEspera) 
    {
        this.filasDeEspera = filasDeEspera;
    }

    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente")
    public List<Anamnese> getAnamneses() 
    {
        return anamneses;
    }
    public void setAnamneses(List<Anamnese> anamneses) 
    {
        this.anamneses = anamneses;
    }

    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente")
    public List<Agenda> getAgendas() 
    {
        return agendas;
    }
    public void setAgendas(List<Agenda> agendas) 
    {
        this.agendas = agendas;
    }

}
