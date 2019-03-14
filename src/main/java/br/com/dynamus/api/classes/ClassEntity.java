package br.com.dynamus.api.classes;

import java.util.List;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.dynamus.api.member.MemberEntity;
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
    private String subject;

    @Size(min=1, max=150)
    private String description;

    @NonNull
    private MemberEntity teacher;

    @NonNull
    private List<MemberEntity> students;

    @NonNull
    private java.sql.Date startDate;

    @NonNull
    private java.sql.Date endDate;
}
