package fr.ingoufcamille.javaquarium.bean.dto;

import java.util.List;

public class FishesDTO {
	private List<FishDTO> fishes;
	
	public FishesDTO(List<FishDTO> fishes) {
		this.fishes = fishes;
	}

	public List<FishDTO> getFishes() {
		return fishes;
	}

	public void setFishes(List<FishDTO> fishes) {
		this.fishes = fishes;
	}
	
	
}
