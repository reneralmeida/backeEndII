package com.dh.catalogservice.dto;

import com.dh.catalogservice.model.Season;
import lombok.Data;
import java.io.Serializable;
import java.math.BigInteger;

@Data
public class SeasonDTO implements Serializable {

    private BigInteger id;
    private String seasonNumber;

    public static SeasonDTO seasonToDTO(Season season) {
        SeasonDTO dto = new SeasonDTO();
        dto.setId(season.getId());
        dto.setSeasonNumber(season.getSeasonNumber());
        return dto;
    }

    public Season toSeason() {
        Season seas = new Season();
        seas.setId(this.getId());
        seas.setSeasonNumber(this.getSeasonNumber());
        return seas;
    }
}
