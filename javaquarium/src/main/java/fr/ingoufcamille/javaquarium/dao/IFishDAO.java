package fr.ingoufcamille.javaquarium.dao;

import java.util.List;

import fr.ingoufcamille.javaquarium.bean.entity.FishDO;

public interface IFishDAO {
	
	/**
	 * Classic crud
	 * @return
	 */
	public List<FishDO> findAll();
	
	/**
	 * Classic crud
	 * @param fish
	 * @return
	 */
	public FishDO save(FishDO fish);
}
