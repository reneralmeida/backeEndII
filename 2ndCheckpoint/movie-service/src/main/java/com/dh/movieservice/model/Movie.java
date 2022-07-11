package com.dh.movieservice.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="movie")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String genre;
    private String urlStream;
}
