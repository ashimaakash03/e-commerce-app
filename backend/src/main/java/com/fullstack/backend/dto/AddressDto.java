package com.fullstack.backend.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressDto {

    private Long id;
    private String flatNumber;
    private String societyName;
    private String residenceArea;
    private String city;
    private String state;
    private String country;
    private String zipCode;

    private UserDto user;
    private LocalDateTime createdAt;
}
