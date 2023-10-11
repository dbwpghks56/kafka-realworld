package net.javaguides.springboot.presentation.dto.request;

import lombok.*;
import net.javaguides.springboot.domain.Wikimedia;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WikimediaRequestDto {
    private String wikiEventData;

    public Wikimedia toEntity() {
        return Wikimedia.builder()
                .wikiEventData(this.wikiEventData)
                .build();
    }
}
