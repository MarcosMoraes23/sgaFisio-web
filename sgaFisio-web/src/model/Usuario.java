package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "usuario")
@NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
public class Usuario implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private String usuario;   
    private String senha;  
    private Integer tipo;   
    private List<Estagiario> estagiarios;    
    private List<Secretaria> secretarias;    
    private List<Supervisor> supervisores;


    
    public Usuario() {}


	public Usuario(Long id, String usuario, String senha, Integer tipo,List<Estagiario> estagiarios, List<Secretaria> secretarias,List<Supervisor> supervisores) 
    {
		super();
		this.id = id;
		this.usuario = usuario;
		this.senha = senha;
		this.tipo = tipo;
		this.estagiarios = estagiarios;
		this.secretarias = secretarias;
		this.supervisores = supervisores;
	}
    

	@Override
	public String toString() 
	{
		return "Usuario [usuario=" + usuario + ", tipo=" + tipo + "]";
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
    @Column(name = "usuario")
    public String getUsuario() 
    {
        return usuario;
    }
    public void setUsuario(String usuario) 
    {
        this.usuario = usuario;
    }

    
    @Basic(optional = false)
    @Column(name = "senha")
    public String getSenha() 
    {
        return senha;
    }
    public void setSenha(String senha)
    {
        this.senha = senha;
    }
    
    
    @Basic(optional = false)
    @Column(name = "tipo")
    public Integer getTipo() 
    {
        return tipo;
    }
    public void setTipo(Integer tipo)
    {
        this.tipo = tipo;
    }

    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    public List<Estagiario> getEstagiarios() 
    {
        return estagiarios;
    }
    public void setEstagiarios(List<Estagiario> estagiarios)
    {
        this.estagiarios = estagiarios;
    }

    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    public List<Secretaria> getSecretarias()
    {
        return secretarias;
    }
    public void setSecretarias(List<Secretaria> secretarias)
    {
        this.secretarias = secretarias;
    }

    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    public List<Supervisor> getSupervisores() 
    {
        return supervisores;
    }
    public void setSupervisores(List<Supervisor> supervisores)
    {
        this.supervisores = supervisores;
    }


}
