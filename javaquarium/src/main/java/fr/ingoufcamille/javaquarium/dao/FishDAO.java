package fr.ingoufcamille.javaquarium.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import fr.ingoufcamille.javaquarium.bean.entity.FishDO;

@Transactional
@Repository
public class FishDAO implements IFishDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<FishDO> findAll() {
		List<FishDO> fishes = em.createQuery("from FishDO").getResultList();
		return fishes;
	}
	
	@Override
	public FishDO save(FishDO fish)
	{
		em.persist(fish);
		return fish;
	}

}
