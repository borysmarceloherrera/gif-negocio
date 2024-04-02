package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Decreto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-02T12:54:38.019830836Z[GMT]")


public class Decreto   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("numeroDecreto")
  private String numeroDecreto = null;

  @JsonProperty("data")
  private String data = null;

  public Decreto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "10", description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Decreto numeroDecreto(String numeroDecreto) {
    this.numeroDecreto = numeroDecreto;
    return this;
  }

  /**
   * Get numeroDecreto
   * @return numeroDecreto
   **/
  @Schema(description = "")
  
    public String getNumeroDecreto() {
    return numeroDecreto;
  }

  public void setNumeroDecreto(String numeroDecreto) {
    this.numeroDecreto = numeroDecreto;
  }

  public Decreto data(String data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   **/
  @Schema(description = "")
  
    public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Decreto decreto = (Decreto) o;
    return Objects.equals(this.id, decreto.id) &&
        Objects.equals(this.numeroDecreto, decreto.numeroDecreto) &&
        Objects.equals(this.data, decreto.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, numeroDecreto, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Decreto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numeroDecreto: ").append(toIndentedString(numeroDecreto)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
