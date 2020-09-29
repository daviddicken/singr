package com.daviddicken.singr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Array;
import java.util.ArrayList;

@Controller// Album(String title, String artist, int count, int seconds, String image)
public class AlbumController {
    @GetMapping("/albums")
    public String allAlbums(Model m){
        ArrayList<Album> albums = new ArrayList<>();

        albums.add(new Album("Welcome to the New", "Mercy Me", 10,2251,"https://images-na.ssl-images-amazon.com/images/I/71c1wtCTcsL._SX522_.jpg"));
        albums.add(new Album("The Hurt & The Healer", "Mercy Me", 10,2344,"https://images-na.ssl-images-amazon.com/images/I/813Cgs1sfhL._SX522_.jpg"));
        albums.add(new Album("Lifer", "Mercy Me", 10, 2095,"https://images-na.ssl-images-amazon.com/images/I/51wAv7HrrqL._SX522_.jpg"));

        m.addAttribute("music", albums);
        return "collection";
    }
}
