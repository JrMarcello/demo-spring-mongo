package br.com.dynamus.api.member;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "members", path = "member")
public interface MemberRepository extends MongoRepository<MemberEntity, String> {
    //MemberEntity findBy_id(ObjectId _id);
    //MemberEntity findByCpf(String cpf);
}