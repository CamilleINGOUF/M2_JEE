package fr.ingoufcamille.javaquarium.service;

import java.util.List;

import fr.ingoufcamille.javaquarium.bean.dto.FishDTO;

public interface IFishService 
{
	/**
	 * find all
	 * @return List<FisHDTO>
	 */
	public List<FishDTO> findAll();

	/**
	 * Classic crud
	 * @param fish
	 * @return
	 */
	public FishDTO save(FishDTO fish);
	
	/**
	 * Classic crud
	 * @param id
	 */
	public void delete(Integer id);
}
