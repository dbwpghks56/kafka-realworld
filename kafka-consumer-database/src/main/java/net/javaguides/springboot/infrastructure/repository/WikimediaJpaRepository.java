package net.javaguides.springboot.infrastructure.repository;

import net.javaguides.springboot.domain.Wikimedia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaJpaRepository extends JpaRepository<Wikimedia, Long> {
}
