package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-27T14:23:38.070+05:30")
public class CompletedTask   {
  
  private Boolean completed = false;

  /**
   **/
  public CompletedTask completed(Boolean completed) {
    this.completed = completed;
    return this;
  }

  
  @ApiModelProperty(example = "true", required = true, value = "")
  @JsonProperty("completed")
  public Boolean getCompleted() {
    return completed;
  }
  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompletedTask completedTask = (CompletedTask) o;
    return Objects.equals(completed, completedTask.completed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletedTask {\n");
    
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

