package in.ashokit.bean;

import in.ashokit.model.Delivery;

// dependency class of OrderStatus
public class DeliveryStatus {
    public Delivery findDeliveryStatus(String orderId){
        if (orderId.equals("123-456"))
            return new Delivery("PICKED-UP","10:40AM");
        else if (orderId.equals("456-321"))
            return  new Delivery("EN-ROUTE","10:57AM");
        else
            return null;
    }

}
