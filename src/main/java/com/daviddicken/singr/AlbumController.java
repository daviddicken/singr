package com.daviddicken.singr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

@Controller// Album(String title, String artist, int count, int seconds, String image)
public class AlbumController {
    @Autowired
    public AlbumRepository albumCollection;
    @Autowired
    public SongRepository songRepository;

//    @GetMapping("/getSongs/{id}")
//    public RedirectView getSongs(@PathVariable long id){
//        ArrayList<Song> songs = (ArrayList<Song>) songRepository.findAllById(Collections.singleton(id));
//
//        return new RedirectView("/songList");
//    }


    @PostMapping("/albums")
    public RedirectView addAlbum(String title, String artist,
                                 int count, int seconds, String image){

        //thisAlbum, name, length, track)
        Album addAlbum = new Album(title,artist,count,seconds,image);
        albumCollection.save(addAlbum);
        //Song newSong =new Song(title,track,seconds,track)




        //Song newSong = new Song()

        return new RedirectView("/albums");
    }

    @GetMapping("/albums")
    public String allAlbums(Model m){
        ArrayList<Album> albums = (ArrayList<Album>) albumCollection.findAll();

//        albums.add(new Album("Welcome to the New", "Mercy Me", 10,2251,"https://images-na.ssl-images-amazon.com/images/I/71c1wtCTcsL._SX522_.jpg"));
//        albums.add(new Album("The Hurt & The Healer", "Mercy Me", 10,2344,"https://images-na.ssl-images-amazon.com/images/I/813Cgs1sfhL._SX522_.jpg"));
//        albums.add(new Album("Lifer", "Mercy Me", 10, 2095,"https://images-na.ssl-images-amazon.com/images/I/51wAv7HrrqL._SX522_.jpg"));

        m.addAttribute("music", albums);
        return "collection";
    }


}
