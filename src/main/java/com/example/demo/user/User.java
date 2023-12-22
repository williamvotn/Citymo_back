package com.example.demo.user;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "birthdate")
    private LocalDate birthdate;

    @Column(name = "inscription_date")
    private LocalDate inscriptionDate;

    public User() {
    }

    public User(Long id, String email, String password, String name, String firstname, String phone, String address, String zipCode, LocalDate birthdate) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.firstname = firstname;
        this.phone = phone;
        this.address = address;
        this.zipCode = zipCode;
        this.birthdate = birthdate;
        inscriptionDate = LocalDate.now();
    }

    public User(String email, String password, String name, String firstname, String phone, String address, String zipCode, LocalDate birthdate) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.firstname = firstname;
        this.phone = phone;
        this.address = address;
        this.zipCode = zipCode;
        this.birthdate = birthdate;
        inscriptionDate = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public LocalDate getInscriptionDate() {
        return inscriptionDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setInscriptionDate(LocalDate inscriptionDate) {
        this.inscriptionDate = inscriptionDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", Email='" + email + '\'' +
                ", Password='" + password + '\'' +
                ", Name='" + name + '\'' +
                ", Firstname='" + firstname + '\'' +
                ", Phone='" + phone + '\'' +
                ", Address='" + address + '\'' +
                ", ZIP_Code='" + zipCode + '\'' +
                ", Birthdate=" + birthdate +
                ", Inscription_Date=" + inscriptionDate +
                '}';
    }
}
