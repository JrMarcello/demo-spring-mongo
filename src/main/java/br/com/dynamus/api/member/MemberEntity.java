package br.com.dynamus.api.member;

import java.util.List;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.dynamus.api.pojos.Address;
import br.com.dynamus.api.pojos.Name;
import br.com.dynamus.api.pojos.Phone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "members")
public class MemberEntity {
    @Id
    private String id;

    @NonNull
    private Name name;

    @NonNull
    @Size(min=11, max=12)
    private String cpf;

    @Size(min=11, max=12)
    private String mail;

    @NonNull
    private Address address;

    @NonNull
    private List<Phone> phones;
    private Boolean active = true;
}