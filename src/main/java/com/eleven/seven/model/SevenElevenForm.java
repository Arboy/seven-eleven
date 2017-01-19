package com.eleven.seven.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by JPMPC-B209 on 1/6/2017.
 */

@Entity
@Table(name = "sevenelevenform")
public class SevenElevenForm {


    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;

    @NotBlank (message = "Name should not be empty!")
    //@NotEmpty (message = "Name Field should not be empty!")
    private String field1;
    @NotBlank (message = "Email should not be empty!")
    //@NotEmpty (message = "Email Field should not be empty!")
    @Email (message = "Must be email!")
    @Column (unique = true)
    private String field2;
    @NotBlank (message = "Mobile should not be empty!")
    //@NotEmpty (message = "Mobile Field should not be empty!")
    @Pattern(regexp = "(^$|[0-9]{11})", message = "Mobile MUST be mobile format!")
    private String tel_no;

    //@Pattern(regexp = "/^(\\+\\d{1,3}[- ]?)?\\d{10}$/")

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getTel_no() {
        return tel_no;
    }

    public void setTel_no(String tel_no) {
        this.tel_no = tel_no;
    }
}
