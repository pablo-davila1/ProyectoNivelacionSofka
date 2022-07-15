package com.sofka.ExamenNivelacion.repositories;

import com.sofka.ExamenNivelacion.models.Ciclista;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CiclistaRepository extends ReactiveMongoRepository<Ciclista,String> {

}
