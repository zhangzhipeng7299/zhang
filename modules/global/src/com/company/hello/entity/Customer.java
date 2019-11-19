package com.company.hello.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "HELLO_CUSTOMER")
@Entity(name = "hello_Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -7218098160016314026L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @Email(message = "email验证")
    @NotNull
    @Column(name = "EMAIL", nullable = false)
    protected String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}