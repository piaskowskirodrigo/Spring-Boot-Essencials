package academy.devdojo.springboot2.service;

import academy.devdojo.springboot2.domain.Anime;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

//pacote logico de negocio
@Service
public class AnimeService {
    private static List<Anime> animes ;
    static {
        animes = new ArrayList<>(List.of(new Anime("DBZ", 1L), new Anime("Berserk",2L)));
    }
    public List<Anime> listAll(){
    return animes;
    }
    public Anime findById(long id){
        return animes.stream().filter(anime -> anime.getId().equals(id)).findFirst().orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not found"));
    }

    public Anime save(Anime anime) {
    anime.setId(ThreadLocalRandom.current().nextLong(3,100000));
    animes.add(anime);
    return anime;
    }
}
