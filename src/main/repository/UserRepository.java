package com.kartik.journalApp.repository;
import com.kartik.journalApp.entity.JournalEntry;
import com.kartik.journalApp.entity.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId>{
    User findByUserName(String username);

    void deleteByUserName(String username);

}
