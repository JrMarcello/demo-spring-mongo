package br.com.dynamus.api.discipline;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="disciplines", path="discipline")
public interface DisciplineRepository extends MongoRepository<DisciplineEntity, Long> {
    //  ...
}
