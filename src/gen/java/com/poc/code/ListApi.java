package com.poc.code;

import io.swagger.model.*;
import com.poc.code.ListApiService;

import io.swagger.annotations.ApiParam;

import io.swagger.model.Task;
import io.swagger.model.TodoList;
import io.swagger.model.CompletedTask;

import java.util.List;
import com.poc.code.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/aweiker/ToDo/1.0.0/list")


@io.swagger.annotations.Api(description = "the list API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-27T14:23:38.070+05:30")
public class ListApi  {
   private final ListApiService delegate;
   
   @org.springframework.beans.factory.annotation.Autowired
   public ListApi(ListApiService delegate){
	this.delegate = delegate;
   }

    @POST
    @Path("/{id}/tasks")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "add a new task to the todo list", notes = "", response = void.class, tags={ "todo", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "item created", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "invalid input, object invalid", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "an existing item already exists", response = void.class) })
    public Response addTask(@ApiParam(value = "Unique identifier of the list to add the task for",required=true) @PathParam("id") String id,@ApiParam(value = "task to add" ) Task task,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addTask(id,task,securityContext);
    }
    @GET
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "return the specified todo list", notes = "", response = TodoList.class, tags={ "todo", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = TodoList.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid id supplied", response = TodoList.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "List not found", response = TodoList.class) })
    public Response getList(@ApiParam(value = "The unique identifier of the list",required=true) @PathParam("id") String id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getList(id,securityContext);
    }
    @POST
    @Path("/{id}/task/{taskId}/complete")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "updates the completed state of a task", notes = "", response = void.class, tags={ "todo", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "item updated", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "invalid input, object invalid", response = void.class) })
    public Response putTask(@ApiParam(value = "Unique identifier of the list to add the task for",required=true) @PathParam("id") String id,@ApiParam(value = "Unique identifier task to complete",required=true) @PathParam("taskId") String taskId,@ApiParam(value = "task to add" ) CompletedTask task,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.putTask(id,taskId,task,securityContext);
    }
}
