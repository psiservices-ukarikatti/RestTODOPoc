package com.poc.code;

import io.swagger.model.*;
import com.poc.code.ListsApiService;

import io.swagger.annotations.ApiParam;

import io.swagger.model.TodoList;

import java.util.List;
import com.poc.code.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/aweiker/ToDo/1.0.0/lists")


@io.swagger.annotations.Api(description = "the lists API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-27T14:23:38.070+05:30")
public class ListsApi  {
   private final ListsApiService delegate;
   
   @org.springframework.beans.factory.annotation.Autowired
   public ListsApi(ListsApiService delegate){
	this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "creates a new list", notes = "Adds a list to the system", response = void.class, tags={ "todo", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "item created", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "invalid input, object invalid", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "an existing item already exists", response = void.class) })
    public Response addList(@ApiParam(value = "ToDo list to add" ) TodoList todoList,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addList(todoList,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "returns all of the available lists", notes = "Searches the todo lists that are available ", response = TodoList.class, responseContainer = "List", tags={ "todo", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "search results matching criteria", response = TodoList.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "bad input parameter", response = TodoList.class, responseContainer = "List") })
    public Response searchLists(@ApiParam(value = "pass an optional search string for looking up a list") @QueryParam("searchString") String searchString,@ApiParam(value = "number of records to skip for pagination") @QueryParam("skip") Integer skip,@ApiParam(value = "maximum number of records to return") @QueryParam("limit") Integer limit,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchLists(searchString,skip,limit,securityContext);
    }
}
