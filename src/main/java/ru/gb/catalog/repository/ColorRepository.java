package ru.gb.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.catalog.entity.Color;

@Repository
public interface ColorRepository extends JpaRepository<Color, Long> {

}
