package br.com.dynamus.api.pojos;

import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	@NonNull
	@Size(min=1,max=150)
	private String street;

	@NonNull
	@Size(min=1,max=10)
	private String number;

	@Size(min=1,max=15)
	private String complement;

	@NonNull
	@Size(min=8,max=9)
	private String cep;

	@NonNull
	@Size(min=1,max=15)
	private String neighborhood;

	@NonNull
	@Size(min=1,max=15)
	private String city;

	@NonNull
	@Size(min=1,max=15)
	private String country;
}
