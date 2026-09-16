package in.ashokit.bean;

import in.ashokit.model.Kitchen;

// dependency class of OrderStatus
public class KitchenStatus {

    public Kitchen findKitchenStatus(String orderId){
            if (orderId.equals("123-456"))
                return  new Kitchen("Veg-Starter","PREPARED");
            else if (orderId.equals("456-321"))
                return new Kitchen("Non-VegStarter","PREPARING");
            else
                return null;
    }

}
