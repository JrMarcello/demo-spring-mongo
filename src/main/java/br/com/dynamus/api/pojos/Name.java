package br.com.dynamus.api.pojos;

import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Name {
	@NonNull
	@Size(min=1,max=15)
	private String firstName;
	
	@NonNull
	@Size(min=1,max=15)
	private String lastName;
	
	public String getFullName() {
		return this.getFirstName().concat(" ").concat(this.getLastName());
	}
}
