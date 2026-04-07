package com.song.demo;

import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class SongRepository {

    private List<Song> list = new ArrayList<>();

    public List<Song> getAllSongs() {
        return list;
    }

    public Song getSongById(Integer id) {
        return list.stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
    }

    public void addSong(Song s) {
        list.add(s);
    }

    public void updateSong(Song s) {
        removeSong(s);
        list.add(s);
    }

    public void removeSong(Song s) {
        list.removeIf(song -> song.getId().equals(s.getId()));
    }
}
