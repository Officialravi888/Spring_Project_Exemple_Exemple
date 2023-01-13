package com.example.SpringBootProgram.Exemple03.Model;

import javax.persistence.*;

@Entity//@Data
@Table(name="Empdb")
public class Employee {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String Address;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        Address = address;
    }
    public Employee(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
