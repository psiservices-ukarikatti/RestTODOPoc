package com.poc.code.impl;

import com.poc.code.*;
import io.swagger.model.*;

import io.swagger.model.TodoList;

import java.util.List;
import com.poc.code.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Service
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-27T14:23:38.070+05:30")
public class ListsApiServiceImpl extends ListsApiService {
    private static final Logger log = LoggerFactory.getLogger(ListsApiServiceImpl.class);

  
    @Override
    public Response addList(TodoList todoList, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response searchLists(String searchString, Integer skip, Integer limit, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
