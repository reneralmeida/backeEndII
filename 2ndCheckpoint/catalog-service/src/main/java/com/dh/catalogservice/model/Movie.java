package com.dh.catalogservice.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Movie {

    @Id
    private BigInteger id;
    private String name;
    private String genre;
    private String urlStream;
}
