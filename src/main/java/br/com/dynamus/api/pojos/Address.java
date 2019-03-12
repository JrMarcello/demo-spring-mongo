package br.com.dynamus.api.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {

    private String street;
    private String number;
    private String complement;
    private String cep;
    private String neighborhood;
    private String city;
    private String country; 
}