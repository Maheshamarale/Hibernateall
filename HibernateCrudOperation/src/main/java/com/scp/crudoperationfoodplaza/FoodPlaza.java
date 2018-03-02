package com.scp.crudoperationfoodplaza;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Food_Plaza")
public class FoodPlaza {
	@Id
	@GeneratedValue
	@Column(name="food_id")
	private int foodId;
	@Column(name="food_name")
	private String foodName;
	@Column(name="food_type")
	private String foodType;
	@Column(name="food_prize")
	private int foodPrize;
	public FoodPlaza(String foodName, String foodType, int foodPrize) {
		super();
		this.foodName = foodName;
		this.foodType = foodType;
		this.foodPrize = foodPrize;
	}
	
	public FoodPlaza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public int getFoodPrize() {
		return foodPrize;
	}
	public void setFoodPrize(int foodPrize) {
		this.foodPrize = foodPrize;
	}
	
	
}
