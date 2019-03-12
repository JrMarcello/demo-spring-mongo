package br.com.dynamus.api.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Phone {

    private String ddd;
    private String number;
    private String type;
}