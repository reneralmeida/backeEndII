package com.dh.serie.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Chapter {

    @Id
    private BigInteger id;
    private String name;
    private String number;
    private String urlStream;
}
