package br.com.dynamus.api.bsclass;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "classes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassEntity {
    @Id
    private String id;
    private String name;
    private String description;
}