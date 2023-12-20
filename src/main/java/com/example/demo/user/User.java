package com.example.demo.user;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "")
    private Long id;

    @Column(name = "email")
    private String Email;

    @Column(name = "password")
    private String Password;

    @Column(name = "name")
    private String Name;

    @Column(name = "firstname")
    private String Firstname;

    @Column(name = "phone")
    private String Phone;

    @Column(name = "address")
    private String Address;

    @Column(name = "zip_code")
    private String ZIP_Code;

    @Column(name = "birthdate")
    private LocalDate Birthdate;

    @Column(name = "inscription_date")
    private LocalDate Inscription_Date;

    public User() {
    }

    public User(Long id, String email, String password, String name, String firstname, String phone, String address, String ZIP_Code, LocalDate birthdate) {
        this.id = id;
        Email = email;
        Password = password;
        Name = name;
        Firstname = firstname;
        Phone = phone;
        Address = address;
        this.ZIP_Code = ZIP_Code;
        Birthdate = birthdate;
        Inscription_Date = LocalDate.now();
    }

    public User(String email, String password, String name, String firstname, String phone, String address, String ZIP_Code, LocalDate birthdate) {
        Email = email;
        Password = password;
        Name = name;
        Firstname = firstname;
        Phone = phone;
        Address = address;
        this.ZIP_Code = ZIP_Code;
        Birthdate = birthdate;
        Inscription_Date = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public String getName() {
        return Name;
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getPhone() {
        return Phone;
    }

    public String getAddress() {
        return Address;
    }

    public String getZIP_Code() {
        return ZIP_Code;
    }

    public LocalDate getBirthdate() {
        return Birthdate;
    }

    public LocalDate getInscription_Date() {
        return Inscription_Date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setZIP_Code(String ZIP_Code) {
        this.ZIP_Code = ZIP_Code;
    }

    public void setBirthdate(LocalDate birthdate) {
        Birthdate = birthdate;
    }

    public void setInscription_Date(LocalDate inscription_Date) {
        Inscription_Date = inscription_Date;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                ", Name='" + Name + '\'' +
                ", Firstname='" + Firstname + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Address='" + Address + '\'' +
                ", ZIP_Code='" + ZIP_Code + '\'' +
                ", Birthdate=" + Birthdate +
                ", Inscription_Date=" + Inscription_Date +
                '}';
    }
}
