package com.poc.code;

import com.poc.code.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Task;
import io.swagger.model.TodoList;
import io.swagger.model.CompletedTask;

import java.util.List;
import com.poc.code.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-27T14:23:38.070+05:30")
public abstract class ListApiService {
    public abstract Response addTask(String id,Task task,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getList(String id,SecurityContext securityContext) throws NotFoundException;
    public abstract Response putTask(String id,String taskId,CompletedTask task,SecurityContext securityContext) throws NotFoundException;
}
