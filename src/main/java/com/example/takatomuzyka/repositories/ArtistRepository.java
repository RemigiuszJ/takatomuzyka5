package com.example.takatomuzyka.repositories;

import com.example.takatomuzyka.model.Artist;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ArtistRepository extends CrudRepository<com.example.takatomuzyka.model.Artist, Long> {
    Optional<Artist> getFirstByFirstNameAndLastName(String firstName, String lastName);
}
