package com.app.notes.repository;
import com.app.notes.model.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface NoteRepository extends MongoRepository<Note, String> {
    Optional<Note> findByTitle(String title);
}
