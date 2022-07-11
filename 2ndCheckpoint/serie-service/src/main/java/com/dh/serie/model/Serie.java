package com.dh.serie.model;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Serie {

    @Id
    private BigInteger id;
    private String name;
    private String genre;
    private List<Season> season;
    private List<Chapter> chapter;
}
