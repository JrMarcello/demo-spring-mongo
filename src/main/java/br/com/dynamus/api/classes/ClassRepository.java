package br.com.dynamus.api.classes;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "classes", path = "class")
public interface ClassRepository extends MongoRepository<ClassEntity, String> {
    //MemberEntity findById(ObjectId _id);
    //MemberEntity findByName(String cpf);
}