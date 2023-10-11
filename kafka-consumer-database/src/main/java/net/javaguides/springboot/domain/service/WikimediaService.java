package net.javaguides.springboot.domain.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.javaguides.springboot.domain.repository.WikimediaRepository;
import net.javaguides.springboot.presentation.dto.request.WikimediaRequestDto;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class WikimediaService implements WikimediaCommandUseCase {
    private final WikimediaRepository wikimediaRepository;

    public void consume(String eventMessage) {
        log.info(String.format("receive message => %s", eventMessage));

        WikimediaRequestDto wikimediaRequestDto = WikimediaRequestDto.builder().wikiEventData(eventMessage).build();

        wikimediaRepository.save(wikimediaRequestDto.toEntity());
    }
}
