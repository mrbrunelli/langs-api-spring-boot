package br.com.alura.langs.api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "langs")
public class Lang {
    @Id
    private String id;
    private String title;
    private String poster;
    private int ranking;

    public Lang() {
    }

    public Lang(String title, String poster, int ranking) {
        this.title = title;
        this.poster = poster;
        this.ranking = ranking;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPoster() {
        return poster;
    }

    public int getRanking() {
        return ranking;
    }
}
