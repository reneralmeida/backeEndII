package com.dh.catalogservice.model;


import lombok.*;
import org.springframework.data.annotation.Id;

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
