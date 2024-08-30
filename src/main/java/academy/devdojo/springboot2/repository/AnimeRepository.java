package academy.devdojo.springboot2.repository;

import academy.devdojo.springboot2.domain.Anime;

import java.util.List;
//pacote responsavel pela conexao do BD
public interface AnimeRepository {
    List<Anime> listAll();
}
