package br.com.dynamus.api.discipline;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "disciplines")
public class DisciplineEntity {
	@Id
	private Long id;

	@NotNull
	@Size(min=1, max=50)
	private String name;

	@Size(min=1,max=150)
	private String description;
	private Boolean active = true;
}
