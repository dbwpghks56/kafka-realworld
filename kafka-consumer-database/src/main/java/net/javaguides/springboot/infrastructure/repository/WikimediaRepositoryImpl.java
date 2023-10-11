package net.javaguides.springboot.infrastructure.repository;

import lombok.RequiredArgsConstructor;
import net.javaguides.springboot.domain.Wikimedia;
import net.javaguides.springboot.domain.repository.WikimediaRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class WikimediaRepositoryImpl implements WikimediaRepository {
    private final WikimediaJpaRepository wikimediaJpaRepository;


    @Override
    public Wikimedia save(Wikimedia wikimedia) {
        return wikimediaJpaRepository.save(wikimedia);
    }
}
