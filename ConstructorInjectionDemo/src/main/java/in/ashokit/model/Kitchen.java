package in.ashokit.model;

import in.ashokit.bean.KitchenStatus;

public class Kitchen {
    private  String foodItemName;
    private  String status;


    public Kitchen(String foodItemName, String status){
        this.foodItemName =foodItemName;
        this.status = status;
    }

    public String getFoodItemName() {
        return foodItemName;
    }

    public void setFoodItemName(String foodItemName) {
        this.foodItemName = foodItemName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
