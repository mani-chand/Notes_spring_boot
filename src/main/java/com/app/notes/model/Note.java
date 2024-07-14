package com.app.notes.model;
public class Note {
    private String id;
    private String description;
    private String tittle;

    /**
     * @param id
     * @param description
     * @param tittle
     */
    public Note(String id, String description, String tittle){
        this.id = id;
        this.description = description;
        this.tittle = tittle;
    }

    public String getId(){
        return this.id;
    }
    public String getTitle(){
        return this.tittle;
    }

    public String getDescription(){
        return this.description;
    }

     @Override
    public String toString() {
        return "Note{" +
                "id='" + id + '\'' +
                ", Tittle='" + tittle + '\'' +
                ", Description='" + description + '}';
    }

}