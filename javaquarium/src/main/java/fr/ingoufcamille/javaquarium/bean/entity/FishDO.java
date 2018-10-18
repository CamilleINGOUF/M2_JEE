package fr.ingoufcamille.javaquarium.bean.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="P_FISH")
public class FishDO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="P_ID")
	private int id;
	
	@Column(name="P_SPECIES")
	private String species;
	
	@Column(name="P_DESC1")
	private String desc1;
	
	@Column(name="P_DESC2")
	private String desc2;
	
	@Column(name="P_DESC3")
	private String desc3;
	
	@Column(name="P_COLOUR")
	private String colour;
	
	@Column(name="P_WIDTH")
	private float width;
	
	@Column(name="P_HEIGHT")
	private float height;
	
	@Column(name="P_PRICE")
	private int price;
	
	public FishDO(){}
	
	public FishDO(int id, String species, String desc1, String desc2, String desc3, String colour, float width,
			float height,int price) {
		this.id = id;
		this.species = species;
		this.desc1 = desc1;
		this.desc2 = desc2;
		this.desc3 = desc3;
		this.colour = colour;
		this.width = width;
		this.height = height;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getDesc1() {
		return desc1;
	}
	public void setDesc1(String desc1) {
		this.desc1 = desc1;
	}
	public String getDesc2() {
		return desc2;
	}
	public void setDesc2(String desc2) {
		this.desc2 = desc2;
	}
	public String getDesc3() {
		return desc3;
	}
	public void setDesc3(String desc3) {
		this.desc3 = desc3;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
}
