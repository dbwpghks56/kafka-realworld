package net.javaguides.springboot.domain.repository;

import net.javaguides.springboot.domain.Wikimedia;

public interface WikimediaRepository {
    Wikimedia save(Wikimedia wikimedia);
}
