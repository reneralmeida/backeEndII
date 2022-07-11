package com.dh.catalogservice.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Season {

    @Id
    private BigInteger id;
    private String seasonNumber;

}
