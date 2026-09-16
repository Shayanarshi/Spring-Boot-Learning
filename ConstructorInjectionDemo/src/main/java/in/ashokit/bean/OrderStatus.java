package in.ashokit.bean;

import in.ashokit.model.Delivery;
import in.ashokit.model.Kitchen;

// dependent class
public class OrderStatus {
    KitchenStatus kitchenStatus;
    DeliveryStatus deliveryStatus;


    public OrderStatus(KitchenStatus kitchenStatus,DeliveryStatus deliveryStatus ) {
        this.kitchenStatus = kitchenStatus;
        this.deliveryStatus = deliveryStatus;
    }
    public void findOrderStatus(String orderId){
        Kitchen kitchen = kitchenStatus.findKitchenStatus(orderId);
        Delivery delivery = deliveryStatus.findDeliveryStatus(orderId);

        if (kitchen!=null && delivery!=null){
            System.out.println("order id : " + orderId);
            System.out.println("food item : " + kitchen.getFoodItemName());
            System.out.println("food item status : " + kitchen.getStatus());
            System.out.println("delivery status : " + delivery.getDeliveryStatus());
            System.out.println("eta : " + delivery.getEta());
        }
        else {
            System.out.println("The orderid : "+orderId+" is invalid");
        }
    }
}
