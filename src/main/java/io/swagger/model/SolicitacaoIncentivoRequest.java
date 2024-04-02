package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.EstabelecimentoEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SolicitacaoIncentivoRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-02T12:54:38.019830836Z[GMT]")


public class SolicitacaoIncentivoRequest   {
  @JsonProperty("estabelecimento")
  private EstabelecimentoEnum estabelecimento = null;

  @JsonProperty("empregos")
  private Long empregos = null;

  @JsonProperty("numProtocolo")
  private Long numProtocolo = null;

  @JsonProperty("investimentos")
  private Float investimentos = null;

  @JsonProperty("idProgramaIncentivo")
  private Long idProgramaIncentivo = null;

  @JsonProperty("idTipoSolicitacao")
  private Long idTipoSolicitacao = null;

  @JsonProperty("idEnquadramento")
  private Long idEnquadramento = null;

  /**
   * Gets or Sets permitirVisualizarRascunho
   */
  public enum PermitirVisualizarRascunhoEnum {
    SIM("SIM"),
    
    NAO("NAO");

    private String value;

    PermitirVisualizarRascunhoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PermitirVisualizarRascunhoEnum fromValue(String text) {
      for (PermitirVisualizarRascunhoEnum b : PermitirVisualizarRascunhoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("permitirVisualizarRascunho")
  private PermitirVisualizarRascunhoEnum permitirVisualizarRascunho = null;

  public SolicitacaoIncentivoRequest estabelecimento(EstabelecimentoEnum estabelecimento) {
    this.estabelecimento = estabelecimento;
    return this;
  }

  /**
   * Get estabelecimento
   * @return estabelecimento
   **/
  @Schema(description = "")
  
    @Valid
    public EstabelecimentoEnum getEstabelecimento() {
    return estabelecimento;
  }

  public void setEstabelecimento(EstabelecimentoEnum estabelecimento) {
    this.estabelecimento = estabelecimento;
  }

  public SolicitacaoIncentivoRequest empregos(Long empregos) {
    this.empregos = empregos;
    return this;
  }

  /**
   * Get empregos
   * @return empregos
   **/
  @Schema(description = "")
  
    public Long getEmpregos() {
    return empregos;
  }

  public void setEmpregos(Long empregos) {
    this.empregos = empregos;
  }

  public SolicitacaoIncentivoRequest numProtocolo(Long numProtocolo) {
    this.numProtocolo = numProtocolo;
    return this;
  }

  /**
   * Get numProtocolo
   * @return numProtocolo
   **/
  @Schema(description = "")
  
    public Long getNumProtocolo() {
    return numProtocolo;
  }

  public void setNumProtocolo(Long numProtocolo) {
    this.numProtocolo = numProtocolo;
  }

  public SolicitacaoIncentivoRequest investimentos(Float investimentos) {
    this.investimentos = investimentos;
    return this;
  }

  /**
   * Get investimentos
   * @return investimentos
   **/
  @Schema(description = "")
  
    public Float getInvestimentos() {
    return investimentos;
  }

  public void setInvestimentos(Float investimentos) {
    this.investimentos = investimentos;
  }

  public SolicitacaoIncentivoRequest idProgramaIncentivo(Long idProgramaIncentivo) {
    this.idProgramaIncentivo = idProgramaIncentivo;
    return this;
  }

  /**
   * Get idProgramaIncentivo
   * @return idProgramaIncentivo
   **/
  @Schema(description = "")
  
    public Long getIdProgramaIncentivo() {
    return idProgramaIncentivo;
  }

  public void setIdProgramaIncentivo(Long idProgramaIncentivo) {
    this.idProgramaIncentivo = idProgramaIncentivo;
  }

  public SolicitacaoIncentivoRequest idTipoSolicitacao(Long idTipoSolicitacao) {
    this.idTipoSolicitacao = idTipoSolicitacao;
    return this;
  }

  /**
   * Get idTipoSolicitacao
   * @return idTipoSolicitacao
   **/
  @Schema(description = "")
  
    public Long getIdTipoSolicitacao() {
    return idTipoSolicitacao;
  }

  public void setIdTipoSolicitacao(Long idTipoSolicitacao) {
    this.idTipoSolicitacao = idTipoSolicitacao;
  }

  public SolicitacaoIncentivoRequest idEnquadramento(Long idEnquadramento) {
    this.idEnquadramento = idEnquadramento;
    return this;
  }

  /**
   * Get idEnquadramento
   * @return idEnquadramento
   **/
  @Schema(description = "")
  
    public Long getIdEnquadramento() {
    return idEnquadramento;
  }

  public void setIdEnquadramento(Long idEnquadramento) {
    this.idEnquadramento = idEnquadramento;
  }

  public SolicitacaoIncentivoRequest permitirVisualizarRascunho(PermitirVisualizarRascunhoEnum permitirVisualizarRascunho) {
    this.permitirVisualizarRascunho = permitirVisualizarRascunho;
    return this;
  }

  /**
   * Get permitirVisualizarRascunho
   * @return permitirVisualizarRascunho
   **/
  @Schema(description = "")
  
    public PermitirVisualizarRascunhoEnum getPermitirVisualizarRascunho() {
    return permitirVisualizarRascunho;
  }

  public void setPermitirVisualizarRascunho(PermitirVisualizarRascunhoEnum permitirVisualizarRascunho) {
    this.permitirVisualizarRascunho = permitirVisualizarRascunho;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolicitacaoIncentivoRequest solicitacaoIncentivoRequest = (SolicitacaoIncentivoRequest) o;
    return Objects.equals(this.estabelecimento, solicitacaoIncentivoRequest.estabelecimento) &&
        Objects.equals(this.empregos, solicitacaoIncentivoRequest.empregos) &&
        Objects.equals(this.numProtocolo, solicitacaoIncentivoRequest.numProtocolo) &&
        Objects.equals(this.investimentos, solicitacaoIncentivoRequest.investimentos) &&
        Objects.equals(this.idProgramaIncentivo, solicitacaoIncentivoRequest.idProgramaIncentivo) &&
        Objects.equals(this.idTipoSolicitacao, solicitacaoIncentivoRequest.idTipoSolicitacao) &&
        Objects.equals(this.idEnquadramento, solicitacaoIncentivoRequest.idEnquadramento) &&
        Objects.equals(this.permitirVisualizarRascunho, solicitacaoIncentivoRequest.permitirVisualizarRascunho);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estabelecimento, empregos, numProtocolo, investimentos, idProgramaIncentivo, idTipoSolicitacao, idEnquadramento, permitirVisualizarRascunho);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolicitacaoIncentivoRequest {\n");
    
    sb.append("    estabelecimento: ").append(toIndentedString(estabelecimento)).append("\n");
    sb.append("    empregos: ").append(toIndentedString(empregos)).append("\n");
    sb.append("    numProtocolo: ").append(toIndentedString(numProtocolo)).append("\n");
    sb.append("    investimentos: ").append(toIndentedString(investimentos)).append("\n");
    sb.append("    idProgramaIncentivo: ").append(toIndentedString(idProgramaIncentivo)).append("\n");
    sb.append("    idTipoSolicitacao: ").append(toIndentedString(idTipoSolicitacao)).append("\n");
    sb.append("    idEnquadramento: ").append(toIndentedString(idEnquadramento)).append("\n");
    sb.append("    permitirVisualizarRascunho: ").append(toIndentedString(permitirVisualizarRascunho)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
