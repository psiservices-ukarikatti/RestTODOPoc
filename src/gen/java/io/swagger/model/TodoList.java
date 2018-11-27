package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Task;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-27T14:23:38.070+05:30")
public class TodoList   {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private List<Task> tasks = new ArrayList<Task>();

  /**
   **/
  public TodoList id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public TodoList name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Home", required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public TodoList description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "The list of things that need to be done at home
", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  public TodoList tasks(List<Task> tasks) {
    this.tasks = tasks;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tasks")
  public List<Task> getTasks() {
    return tasks;
  }
  public void setTasks(List<Task> tasks) {
    this.tasks = tasks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TodoList todoList = (TodoList) o;
    return Objects.equals(id, todoList.id) &&
        Objects.equals(name, todoList.name) &&
        Objects.equals(description, todoList.description) &&
        Objects.equals(tasks, todoList.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, tasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TodoList {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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

