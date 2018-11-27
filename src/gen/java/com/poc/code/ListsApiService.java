package com.poc.code;

import com.poc.code.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.TodoList;

import java.util.List;
import com.poc.code.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-27T14:23:38.070+05:30")
public abstract class ListsApiService {
    public abstract Response addList(TodoList todoList,SecurityContext securityContext) throws NotFoundException;
    public abstract Response searchLists(String searchString,Integer skip,Integer limit,SecurityContext securityContext) throws NotFoundException;
}
