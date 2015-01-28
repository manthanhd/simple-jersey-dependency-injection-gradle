package com.mkyong.rest;

import javax.ws.rs.Path;

/**
 * Created by manthanhd on 28/01/2015.
 */
@Path("/NewService")
public class NewService {

    public String hello() {
        return "WORKING";
    }
}
