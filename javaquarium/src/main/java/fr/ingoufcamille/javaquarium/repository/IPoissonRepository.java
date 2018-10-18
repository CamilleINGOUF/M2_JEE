package fr.ingoufcamille.javaquarium.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.ingoufcamille.javaquarium.bean.entity.FishDO;

public interface IPoissonRepository extends JpaRepository<FishDO, Integer> {

}
