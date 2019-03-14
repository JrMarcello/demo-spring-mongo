package br.com.dynamus.api.pojos;

import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phone {
    @NonNull
	@Size(min=2,max=2)
    private String ddd;

    @NonNull
	@Size(min=8,max=10)
    private String number;

    @NonNull
    private PhoneType type;
}