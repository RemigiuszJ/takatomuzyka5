package com.example.takatomuzyka.repositories;

import com.example.takatomuzyka.model.Artist;
import com.example.takatomuzyka.model.Song;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SongRepository extends CrudRepository<com.example.takatomuzyka.model.Song, Long> {
    List<Song> getAllByArtistsIsContaining(Artist artist);
}