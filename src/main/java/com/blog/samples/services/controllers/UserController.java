package com.blog.samples.services.controllers;

import com.blog.samples.services.testservices.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

import static javax.json.Json.createObjectBuilder;


/**
 * Simple example of using a rest controller
 */
@RestController
public class UserController {

    //injected service using Spring magic
    @Autowired
    private TestService testService;

    /*
     * Examples shows returning status from a service
     *
     */
    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public ResponseEntity<?> checkStatus() {

        JsonObjectBuilder mainObjectBuilder = createObjectBuilder();
        //builds the json object
        JsonObject jsonObject = mainObjectBuilder.add("status", this.testService.status()).build();
        return new ResponseEntity<>(jsonObject.toString(), HttpStatus.OK);
    }

    /*
     * Get a user
     *
     */
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ResponseEntity<?> getAllUsers() {

        JsonObjectBuilder mainObjectBuilder = createObjectBuilder();
        JsonObjectBuilder bodyObjectBuilder = createObjectBuilder();
        bodyObjectBuilder.add("name", "Emily Vertex")
                .add("street", "123 Beverly Hills")
                .add("city", "La")
                .add("state", "Ca")
                .add("zip", "99999");

        //builds the json object
        JsonObject jsonObject = mainObjectBuilder.add("User", bodyObjectBuilder).build();
        return new ResponseEntity<>(jsonObject.toString(), HttpStatus.OK);
    }

    /*
     * Examples shows returning an error message
     *
     */
    @RequestMapping(value = "/errormsg", method = RequestMethod.GET)
    public ResponseEntity<?> createErroMessage() {

        JsonObjectBuilder mainObjectBuilder = createObjectBuilder();
        JsonObjectBuilder bodyObjectBuilder = createObjectBuilder();
        bodyObjectBuilder.add("title", "Validation Failure")
                .add("status", "400")
                .add("displayMessage", "social security has an invalid format");
        //builds the json object
        JsonObject jsonObject = mainObjectBuilder.add("errors", bodyObjectBuilder).build();
        //we use a 400 for an error message on the server;  forgot abou tthat
        return new ResponseEntity<>(jsonObject, HttpStatus.BAD_REQUEST);
    }

    /*
	 * Get a specific user
	 * @RequestParam(value = "name", required=false)
	 */
    @RequestMapping(value = "/centerfield", method = RequestMethod.GET)
    public ResponseEntity<?> getExceptions(
                                     @RequestParam(value = "status", required = false) String status) {

        if ( status.equals("true")){
            throw new RuntimeException("Threw an exception");
        }
        JsonObjectBuilder mainObjectBuilder = createObjectBuilder();
        //builds the json object
        JsonObject jsonObject = mainObjectBuilder.add("status", this.testService.status()).build();
        return new ResponseEntity<>(jsonObject.toString(), HttpStatus.OK);

    }
}