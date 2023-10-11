package net.javaguides.springboot.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_wikimedia")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Wikimedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String wikiEventData;
}
