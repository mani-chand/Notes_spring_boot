package com.app.notes.controller;
import com.app.notes.model.Note;
import com.app.notes.service.NoteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// import java.util.Optional;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class NoteController {
    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping
    public ResponseEntity<List<Note>> getAllNotes() {
        List<Note> notes = noteService.getAllNotes();
        return ResponseEntity.ok(notes);
    }

    @PostMapping
    public ResponseEntity<Note> saveNote(@RequestBody Note note) {
        Note createdNote = noteService.saveNote(note);
        return new ResponseEntity<>(createdNote, HttpStatus.CREATED);
    }

}
