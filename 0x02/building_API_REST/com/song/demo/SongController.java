package com.song.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api-song")
public class SongController {

    @Autowired
    private SongRepository repo;

    @GetMapping("/welcome")
    public String welcomeMessage() {
        return "WELCOME TO SONG API";
    }

    @GetMapping("/allSongs")
    public List<Song> getAllSongs() {
        return repo.getAllSongs();
    }

    @GetMapping("/findSong/{id}")
    public Song findSongById(@PathVariable Integer id) {
        return repo.getSongById(id);
    }

    @PostMapping("/addSong")
    public Song addSong(@RequestBody Song song) {
        repo.addSong(song);
        return song;
    }

    @PutMapping("/updateSong")
    public Song updateSong(@RequestBody Song song) {
        repo.updateSong(song);
        return song;
    }

    @DeleteMapping("/removeSong")
    public void deleteSongById(@RequestBody Song song) {
        repo.removeSong(song);
    }
}
