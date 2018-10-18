package fr.ingoufcamille.javaquarium.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ingoufcamille.javaquarium.bean.dto.FishDTO;
import fr.ingoufcamille.javaquarium.bean.entity.FishDO;
import fr.ingoufcamille.javaquarium.dao.IFishDAO;
import fr.ingoufcamille.javaquarium.repository.IPoissonRepository;

@Service
public class FishService implements IFishService
{
	@Autowired
	private IFishDAO fishDAO;
	
	@Autowired
	private IPoissonRepository repo;

	@Override
	public List<FishDTO> findAll() {
		
		final List<FishDO> bos = repo.findAll();
		
		List<FishDTO> fishes = new ArrayList<>();
		
		for(FishDO f : bos)
		{
			fishes.add(new FishDTO(f.getId(),f.getSpecies(), f.getDesc1(), f.getColour(), f.getWidth()+" x "+f.getHeight(), 10));
		}
		
		return fishes;
	}

	@Override
	public FishDTO save(FishDTO fish) 
	{
		FishDO fishToSave = new FishDO();
		fishToSave.setSpecies(fish.getName());
		fishToSave.setDesc1(fish.getDesc());
		String[] dims = fish.getDimension().split(" x ");
		fishToSave.setWidth(Float.parseFloat(dims[0]));
		fishToSave.setHeight(Float.parseFloat(dims[1]));
		fishToSave.setColour(fish.getColour());
		
		fishDAO.save(fishToSave);
		
		return fish;
	}

	@Override
	public void delete(Integer id) 
	{
		repo.deleteById(id);
	}
	
}
