package br.com.alura.langs.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LangController {
    @Autowired
    private LangRepository repository;

    @GetMapping("/")
    public List<Lang> findAll() {
        return this.repository.findAll();
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Lang create(@RequestBody Lang lang) {
        return this.repository.save(lang);
    }
}
