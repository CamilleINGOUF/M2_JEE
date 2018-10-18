package fr.ingoufcamille.javaquarium.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.ingoufcamille.javaquarium.bean.dto.FishDTO;
import fr.ingoufcamille.javaquarium.bean.dto.FishesDTO;
import fr.ingoufcamille.javaquarium.service.IFishService;

@RestController
public class FishesController 
{
	@Autowired
	private IFishService fishService;
		
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/fishes", method = RequestMethod.GET)
	public FishesDTO getFishes()
	{
		final List<FishDTO> fishes = fishService.findAll();
		return new FishesDTO(fishes);
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping(value = "/fishes")
	public void createFish(@RequestBody FishDTO fish)
	{
		fishService.save(fish);
	}
	
	@CrossOrigin(origins = "*")
	@DeleteMapping(value = "/fishes/delete/{id}")
	public void deleteFish(@PathVariable Integer id)
	{
		System.out.println("poisson "+id);
		fishService.delete(id);
	}
}
