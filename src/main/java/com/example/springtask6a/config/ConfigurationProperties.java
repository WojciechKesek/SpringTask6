package com.example.springtask6a.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@Data
@Component
@Validated
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "pl.sdacademy.zad6")
@NoArgsConstructor
@AllArgsConstructor
public class ConfigurationProperties {
    @Email
    private String email;
    private String firstName;
    @Length(min = 3, max = 20)
    private String lastName;
    @Pattern(regexp = "[a-zA-Z]+ [0-9]+[a-zA-Z]*")
    private String address;
    @Min(value = 18)
    private int age;
    @NotEmpty
    private List<String> values;
    @NotEmpty
    private Map<String,String> customAttributes;

    @AssertTrue(message = "Address field has to have two words")
    private boolean isTwoWords(){
        return address.split(" ").length == 2;
    }

}
