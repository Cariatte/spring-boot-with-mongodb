package br.com.dcariatte.sbmdb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.dcariatte.sbmdb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
