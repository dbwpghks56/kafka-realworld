package net.javaguides.springboot.application;

import lombok.RequiredArgsConstructor;
import net.javaguides.springboot.domain.service.WikimediaService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WikimediaFacade {
    private final WikimediaService wikimediaService;

    @KafkaListener(topics = "wikimedia_recentchange", groupId = "myGroup")
    public void consume(String eventMessage) {
        wikimediaService.consume(eventMessage);
    }
}
