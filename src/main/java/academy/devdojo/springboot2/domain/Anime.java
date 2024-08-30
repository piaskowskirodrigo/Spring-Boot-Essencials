package academy.devdojo.springboot2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
//pacote representa o que tem no BD
@Data
@AllArgsConstructor
public class Anime {
    private String name;
    private Long id;

}
