package br.com.dynamus.api.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Name {

    private String firstName;
    private String lastName;
}