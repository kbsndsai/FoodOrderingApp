package com.upgrad.FoodOrderingApp.service.entity;

import org.apache.commons.lang3.builder.ToStringExclude;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "CUSTOMER")
@NamedQueries(
        {
                @NamedQuery(name = "customerByUuid", query = "select c from CustomerEntity c where c.uuid = :uuid"),
                @NamedQuery(name = "customerByContactNumber", query = "select c from CustomerEntity c where c.contactNum = :contactNumber"),
                @NamedQuery(name = "customerByEmail", query = "select c from CustomerEntity c where c.email =:email"),
                @NamedQuery(name = "customerById", query = "select c from CustomerEntity c where c.id = :id"),
        }
)

public class CustomerEntity implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "UUID")
    @Size(max = 200)
    private String uuid;

    @Column(name = "FIRSTNAME")
    @NotNull
    @Size(max = 30)
    private String firstName;

    @Column(name = "LASTNAME")
    @NotNull
    @Size(max = 30)
    private String lastName;

    @Column(name = "EMAIL")
    @NotNull
    @Size(max = 30)
    private String email;

    @Column(name = "CONTACT_NUMBER")
    @NotNull
    @Size(max = 30)
    private String contactNum;

    @Column(name = "PASSWORD")
    @NotNull
    @Size(max = 255)
    @ToStringExclude
    private String password;

    @Column(name = "SALT")
    @NotNull
    @Size(max = 200)
    @ToStringExclude
    private String salt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
