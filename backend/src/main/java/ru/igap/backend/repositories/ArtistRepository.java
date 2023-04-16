package ru.igap.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.igap.backend.models.Artist;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {

}
