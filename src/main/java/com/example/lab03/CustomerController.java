package com.example.lab03;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
    private List<Customer> customers;

    public CustomerController() {
        customers = new ArrayList<Customer>();
    }

    @RequestMapping("/customers")
    public List<Customer> getCustomers() {
        return this.customers;
    }

    @RequestMapping("/customerbyid/{id}")
    public Customer getCustomerByID(@PathVariable("id") String ID) {
        for (Customer c: getCustomers()) {
            if (c.getID().equals(ID)) {
                return c;
            }
        }
        return null;
    }

    @RequestMapping("/customerbyname/{n}")
    public Customer getCustomerByName(@PathVariable("n") String n) {
        for (Customer c: getCustomers()) {
            if (c.getName().equals(n)) {
                return c;
            }
        }
        return null;
    }

    @RequestMapping(value = "/customerdelbyid/{id}", method = RequestMethod.DELETE)
    public boolean delCustomerByID(@PathVariable("id") String ID) {
        for (Customer c: getCustomers()) {
            if (c.getID().equals(ID)) {
                return getCustomers().remove(c);
            }
        }
        return false;
    }

    @RequestMapping(value = "/customerdelbyname/{n}", method = RequestMethod.DELETE)
    public boolean delCustomerByName(@PathVariable("n") String n) {
        for (Customer c: getCustomers()) {
            if (c.getName().equals(n)) {
                return getCustomers().remove(c);
            }
        }
        return false;
    }

    @RequestMapping("/addcustomer")
    public boolean addCustomer(@RequestParam("id") String ID, @RequestParam("name") String n, @RequestParam("sex") String s, @RequestParam("age") int a) {
        return getCustomers().add(new Customer(ID, n, s, a));
    }

    @RequestMapping(value = "/addcustomer2", method = RequestMethod.POST)
    public boolean addCustomer2(@RequestParam("id") String ID, @RequestParam("name") String n, @RequestParam("sex") String s, @RequestParam("age") int a) {
        return getCustomers().add(new Customer(ID, n, s, a));
    }
}
