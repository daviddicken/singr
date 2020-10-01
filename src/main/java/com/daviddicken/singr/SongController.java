package com.daviddicken.singr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SongController {
    @Autowired AlbumRepository albumRepository;

    @Autowired SongRepository songRepository;

    //("albumSong/{album.id}")
    //go to database and diplpay all songs that have a matching
    @PostMapping("/song")
    public RedirectView addSong(String name, long albumId, int track, int length){

        Album thisAlbum = albumRepository.getOne(albumId);

        Song thisSong = new Song(thisAlbum, name, length, track);
        songRepository.save(thisSong);

       // albumRepository.save(thisAlbum);

        return new RedirectView("/albums");


    }

}
