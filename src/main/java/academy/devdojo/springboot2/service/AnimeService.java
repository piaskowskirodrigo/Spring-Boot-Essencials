package academy.devdojo.springboot2.service;

import academy.devdojo.springboot2.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

//pacote logico de negocio
@Service
public class AnimeService {
    public List<Anime> listAll(){
    return List.of(new Anime("DBZ", 1L), new Anime("Berserk",2L));
    }
}
