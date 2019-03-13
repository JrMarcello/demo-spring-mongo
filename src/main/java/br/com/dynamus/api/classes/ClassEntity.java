package br.com.dynamus.api.classes;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "classes")
public class ClassEntity {
    @Id
    private String id;

    @NonNull
    @Size(min=1, max=50)
    private String name;

    @Size(min=1, max=150)
    private String description;
}