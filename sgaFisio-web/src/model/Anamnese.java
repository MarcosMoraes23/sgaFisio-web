package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "anamnese")
@NamedQuery(name = "Anamnese.findAll", query = "SELECT a FROM Anamnese a")
public class Anamnese implements Serializable 
{
    private static final long serialVersionUID = 1L;
  
    private Long id; 
    private Date dataAnamnese;
    private String historicoFamiliar; 
    private String historicoSocial; 
    private String historicoPatologico;  
    private String historicoDoencaAtual;
    private String historicoFisiologico; 
    private String diagnosticoClinico;
    private String queixaPrincipal; 
    private String periodoInatividade;   
    private String cirurgias;  
    private String medicacoesAtuais;
    private String examesComplementares; 
    private String metasPaciente;
    private String dependenciasQuimicas;
    private String dependenciasFisiologicas;
    private Estagiario estagiario;
    private Paciente paciente; 
    private Supervisor supervisor;

    public Anamnese() {    }

    
   
    public Anamnese(Long id, Date dataAnamnese, String historicoFamiliar,String historicoSocial, String historicoPatologico,String historicoDoencaAtual, String historicoFisiologico,String diagnosticoClinico, String queixaPrincipal,String periodoInatividade, String cirurgias,String medicacoesAtuais, String examesComplementares,String metasPaciente, String dependenciasQuimicas,String dependenciasFisiologicas, Estagiario estagiario,Paciente paciente, Supervisor supervisor)
    {
		this.id = id;
		this.dataAnamnese = dataAnamnese;
		this.historicoFamiliar = historicoFamiliar;
		this.historicoSocial = historicoSocial;
		this.historicoPatologico = historicoPatologico;
		this.historicoDoencaAtual = historicoDoencaAtual;
		this.historicoFisiologico = historicoFisiologico;
		this.diagnosticoClinico = diagnosticoClinico;
		this.queixaPrincipal = queixaPrincipal;
		this.periodoInatividade = periodoInatividade;
		this.cirurgias = cirurgias;
		this.medicacoesAtuais = medicacoesAtuais;
		this.examesComplementares = examesComplementares;
		this.metasPaciente = metasPaciente;
		this.dependenciasQuimicas = dependenciasQuimicas;
		this.dependenciasFisiologicas = dependenciasFisiologicas;
		this.estagiario = estagiario;
		this.paciente = paciente;
		this.supervisor = supervisor;
	}

    


	@Override
	public String toString() 
	{
		return "Anamnese [dataAnamnese=" + dataAnamnese
				+ ", historicoFamiliar=" + historicoFamiliar
				+ ", historicoSocial=" + historicoSocial
				+ ", historicoPatologico=" + historicoPatologico
				+ ", historicoDoencaAtual=" + historicoDoencaAtual
				+ ", historicoFisiologico=" + historicoFisiologico
				+ ", diagnosticoClinico=" + diagnosticoClinico
				+ ", queixaPrincipal=" + queixaPrincipal
				+ ", periodoInatividade=" + periodoInatividade + ", cirurgias="
				+ cirurgias + ", medicacoesAtuais=" + medicacoesAtuais
				+ ", examesComplementares=" + examesComplementares
				+ ", metasPaciente=" + metasPaciente
				+ ", dependenciasQuimicas=" + dependenciasQuimicas
				+ ", dependenciasFisiologicas=" + dependenciasFisiologicas
				+ ", estagiario=" + estagiario + ", paciente=" + paciente + "]";
	}



	@Id
    @Basic(optional = false)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "data_anamnese")
    @Temporal(TemporalType.DATE)
    public Date getDataAnamnese() {
        return dataAnamnese;
    }

    public void setDataAnamnese(Date dataAnamnese) {
        this.dataAnamnese = dataAnamnese;
    }
    
    @Column(name = "historico_familiar")
    public String getHistoricoFamiliarFamiliar() {
        return historicoFamiliar;
    }

    public void setHistoricoFamiliar(String historicoFamiliar) {
        this.historicoFamiliar = historicoFamiliar;
    }
    
    @Column(name = "historico_social")
    public String getHistoricoSocial() {
        return historicoSocial;
    }

    public void setHistoricoSocial(String historicoSocial) {
        this.historicoSocial = historicoSocial;
    }

    @Column(name = "historico_patologico")
    public String getHistoricoPatologico() {
        return historicoPatologico;
    }

    public void setHistoricoPatologico(String historicoPatologico) {
        this.historicoPatologico = historicoPatologico;
    }
    
    @Column(name = "historico_doenca_atual")
    public String getHistoricoDoencaAtual() {
        return historicoDoencaAtual;
    }

    public void setHistoricoDoencaAtual(String historicoDoencaAtual) {
        this.historicoDoencaAtual = historicoDoencaAtual;
    }

    @Column(name = "historico_fisiologico")
    public String getHistoricoFisiologico() {
        return historicoFisiologico;
    }

    public void setHistoricoFisiologico(String historicoFisiologico) {
        this.historicoFisiologico = historicoFisiologico;
    }

    @Column(name = "diagnostico_clinico")
    public String getDiagnosticoClinico() {
        return diagnosticoClinico;
    }

    public void setDiagnosticoClinico(String diagnosticoClinico) {
        this.diagnosticoClinico = diagnosticoClinico;
    }

    @Column(name = "queixa_principal")
    public String getQueixaPrincipal() {
        return queixaPrincipal;
    }

    public void setQueixaPrincipal(String queixaPrincipal) {
        this.queixaPrincipal = queixaPrincipal;
    }

    @Column(name = "periodo_inatividade")
    public String getPeriodoInatividade() {
        return periodoInatividade;
    }

    public void setPeriodoInatividade(String periodoInatividade) {
        this.periodoInatividade = periodoInatividade;
    }

    @Column(name = "cirurgias")
    public String getCirurgias() {
        return cirurgias;
    }

    public void setCirurgias(String cirurgias) {
        this.cirurgias = cirurgias;
    }

    @Column(name = "medicacoes_atuais")
    public String getMedicacoesAtuais() {
        return medicacoesAtuais;
    }

    public void setMedicacoesAtuais(String medicacoesAtuais) {
        this.medicacoesAtuais = medicacoesAtuais;
    }

    @Column(name = "exames_complementares")
    public String getExamesComplementares() {
        return examesComplementares;
    }

    public void setExamesComplementares(String examesComplementares) {
        this.examesComplementares = examesComplementares;
    }

    @Column(name = "metas_paciente")
    public String getMetasPaciente() {
        return metasPaciente;
    }

    public void setMetasPaciente(String metasPaciente) {
        this.metasPaciente = metasPaciente;
    }
    
    @Column(name = "dependencias_quimicas")
    public String getDependenciasQuimicas() {
        return dependenciasQuimicas;
    }

    public void setDependenciasQuimicas(String dependenciasQuimicas) {
        this.dependenciasQuimicas = dependenciasQuimicas;
    }

    @Column(name = "dependencias_fisiologicas")
    public String getDependenciasFisiologicas() {
        return dependenciasFisiologicas;
    }

    public void setDependenciasFisiologicas(String dependenciasFisiologicas) {
        this.dependenciasFisiologicas = dependenciasFisiologicas;
    }

    @JoinColumn(name = "id_estagiario", referencedColumnName = "id")
    @ManyToOne(optional = false)
    public Estagiario getEstagiario() {
        return estagiario;
    }

    public void setEstagiario(Estagiario estagiario) {
        this.estagiario = estagiario;
    }

    @JoinColumn(name = "id_paciente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    public Paciente getPaciente() {
        return paciente;
    }

    public void setIdPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @JoinColumn(name = "id_supervisor", referencedColumnName = "id")
    @ManyToOne(optional = false)
    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }


}
