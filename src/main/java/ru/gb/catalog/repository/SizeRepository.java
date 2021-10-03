package ru.gb.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.catalog.entity.Size;

@Repository
public interface SizeRepository extends JpaRepository<Size, Long> {

}
