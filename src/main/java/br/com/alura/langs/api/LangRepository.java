package br.com.alura.langs.api;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LangRepository extends MongoRepository<Lang, String> {
}
