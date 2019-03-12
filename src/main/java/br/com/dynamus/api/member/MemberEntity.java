package br.com.dynamus.api.member;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import br.com.dynamus.api.pojos.Address;
import br.com.dynamus.api.pojos.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "members")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberEntity {
    @Id
    private String id;
    private Name name;
    private String cpf;
    private String mail;
    private Address address;
    private List<String> phones;
}