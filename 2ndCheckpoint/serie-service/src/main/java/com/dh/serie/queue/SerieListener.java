package com.dh.serie.queue;

import com.dh.serie.dto.SerieDTO;
import com.dh.serie.model.Chapter;
import com.dh.serie.model.Season;
import com.dh.serie.model.Serie;
import com.dh.serie.service.SerieService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class SerieListener {

    private final SerieService service;

    @RabbitListener(queues = {"${queue.serie.name}"})
    public void receiveMessage(SerieDTO dto, List<Season> seasonList, List<Chapter> chapterList) { service.save(dto, seasonList, chapterList); }
}
