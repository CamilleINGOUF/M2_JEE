package fr.ingoufcamille.javaquarium.bean.dto;

public class FishDTO {

	private Integer id;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private String name;
	private String desc;
	private String colour;
	private String dimension;
	private int price;
	
	public FishDTO(Integer id, String species, String desc1, String colour, String dimension, int price) 
	{
		this.id = id;
		this.name = species;
		this.desc = desc1;
		this.colour = colour;
		this.dimension = dimension;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
