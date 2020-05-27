package com.example.takatomuzyka.tools;

import com.example.takatomuzyka.repositories.ArtistRepository;
import com.example.takatomuzyka.repositories.SongRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
@Component
public class DBInflater implements ApplicationListener<ContextRefreshedEvent> {

    public DBInflater(SongRepository songRepository, ArtistRepository artistRepository) {
        this.songRepository = songRepository;
        this.artistRepository = artistRepository;

    }
    private SongRepository songRepository;
    private ArtistRepository artistRepository;





@Override
public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
    initData();
}

    private void initData() {

        com.example.takatomuzyka.model.Artist StefaniJoanneAngelina = new com.example.takatomuzyka.model.Artist("Stefani Joanne Angelina", "Germanotta", "Lady Gaga");

        com.example.takatomuzyka.model.Song pokerface = new com.example.takatomuzyka.model.Song("Poker Face", "Dance", "9781423481096",
                "2008");
        StefaniJoanneAngelina.getSongs().add(pokerface);
        pokerface.getArtists().add(StefaniJoanneAngelina);

        artistRepository.save(StefaniJoanneAngelina);
        songRepository.save(pokerface);


        com.example.takatomuzyka.model.Artist dawid = new com.example.takatomuzyka.model.Artist("Dawid", "Podsiadło", "Wąsik");

        com.example.takatomuzyka.model.Song trojkatyikwadraty = new com.example.takatomuzyka.model.Song("Trójkąty i kwadraty", "Soul", "888430071827",
                "2013");
        dawid.getSongs().add(trojkatyikwadraty);
        trojkatyikwadraty.getArtists().add(dawid);

        artistRepository.save(dawid);
        songRepository.save(trojkatyikwadraty);



        com.example.takatomuzyka.model.Artist freddie = new com.example.takatomuzyka.model.Artist("Freddie", "Mercury", "Freddie");

        com.example.takatomuzyka.model.Song callingAllGirls = new com.example.takatomuzyka.model.Song("Calling All Girls", "Many", "09309823091",
                "1982");
        freddie.getSongs().add(callingAllGirls);
        callingAllGirls.getArtists().add(freddie);

        artistRepository.save(freddie);
        songRepository.save(callingAllGirls);


        com.example.takatomuzyka.model.Artist krzysztof = new com.example.takatomuzyka.model.Artist("Krzysztof", "Zalewski", "Złoty");

        com.example.takatomuzyka.model.Song kurier = new com.example.takatomuzyka.model.Song("Kurier", "Many", "09309823091",
                "2019");
        krzysztof.getSongs().add(kurier);
        callingAllGirls.getArtists().add(krzysztof);

        artistRepository.save(krzysztof);
        songRepository.save(kurier);

    }


}

