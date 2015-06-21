
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "supervisor")
@NamedQuery(name = "Supervisor.findAll", query = "SELECT s FROM Supervisor s")
public class Supervisor implements Serializable 
{
    private static final long serialVersionUID = 1L;
    
    private Long id; 
    private String nome;
    private Date dataNascimento;    
    private String matricula;  
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
    private List<Anamnese> anamneses;  
    private Usuario usuario;

    public Supervisor() {}

    
    

    public Supervisor(Long id, String nome, Date dataNascimento,String matricula, String cpf, String rg, String telefone,String estado, String cidade, String bairro, String rua,String cep, Integer numero, String complemento,List<Anamnese> anamneses, Usuario usuario) 
    {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.matricula = matricula;
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
		this.anamneses = anamneses;
		this.usuario = usuario;
	}


	@Override
	public String toString()
	{
		return "Supervisor [nome=" + nome + ", dataNascimento="
				+ dataNascimento + ", matricula=" + matricula + ", telefone="
				+ telefone + ", usuario=" + usuario + "]";
	}


	@Id
    @Basic(optional = false)
    @Column(name = "id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sequence_supervisor")
	@SequenceGenerator(name="sequence_supervisor", sequenceName="sequence_supervisor", allocationSize=1)
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
    @Column(name = "matricula")
    public String getMatricula() 
    {
        return matricula;
    }
    public void setMatricula(String matricula) 
    {
        this.matricula = matricula;
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

    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "supervisor")
    public List<Anamnese> getAnamneses() 
    {
        return anamneses;
    }
    public void setAnamneses(List<Anamnese> anamneses) 
    {
        this.anamneses = anamneses;
    }
    
    
    
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    @ManyToOne(optional = false)
    public Usuario getUsuario() 
    {
        return usuario;
    }
    public void setIdUsuario(Usuario usuario)
    {
        this.usuario = usuario;
    }

    
}
