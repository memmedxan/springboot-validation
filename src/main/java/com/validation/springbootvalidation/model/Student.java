package com.validation.springbootvalidation.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "Ad ve soyad bos ola bilmez ")
    @Size(min=3, max = 40)
    private String nameSurname;

    @NotBlank(message = "mektebin adini daxil edin")
    private String schoolName;

    @Email(message = "email duzgun daxil edin")
    private String email;

    @NotNull(message = "yas daxil edin")
    @Min(value = 14, message = "Yas araligini 6-19 araliginda qeyd edin")
    private int age;

    @Pattern(regexp = "[0-9\\s]{12}")
    private String phone;

}
