package com.tw.apistackbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

/**
 * Created by jxzhong on 18/08/2017.
 */
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> list(){
        return EmployeeService.list();
    }
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Employee create(@RequestBody Employee employee){
        return EmployeeService.create(employee);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Employee get(@PathVariable int id){
        return EmployeeService.get(id);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Employee update(@PathVariable int id, @RequestBody Employee employee){
        return EmployeeService.update(id, employee);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Employee delete(@PathVariable int id){
        return EmployeeService.delete(id);
    }

}
