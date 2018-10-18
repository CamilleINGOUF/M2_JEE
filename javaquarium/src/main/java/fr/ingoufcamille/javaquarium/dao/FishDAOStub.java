package fr.ingoufcamille.javaquarium.dao;

import java.util.ArrayList;
import java.util.List;

import fr.ingoufcamille.javaquarium.bean.entity.FishDO;

public class FishDAOStub implements IFishDAO {

	@Override
	public List<FishDO> findAll() {
		List<FishDO> fishes = new ArrayList<>();
		
		fishes.add(new FishDO(0, "espece", "desc1", "desc2", "desc3", "couleur", 14.7f, 16.9f,10));
		fishes.add(new FishDO(1, "Anostomus", "Characides Americain", "desc2", "desc3", "Rouge", 12.2f, 15.36f,11));
		
		return fishes;
	}

	@Override
	public FishDO save(FishDO fish) {
		// TODO Auto-generated method stub
		return null;
	}

}
