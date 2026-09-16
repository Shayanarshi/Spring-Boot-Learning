package in.ashokit.bean;

import java.util.HashMap;
import java.util.Map;

// dependency class
public class InventoryService {

    Map<String,Integer> stock = Map.of("oneplusc6",8,"iphone17",5,"vivox30",15);

    public  boolean isInStock(String skuCode,int requiredQuantity){

        if (stock.containsKey(skuCode) && stock.get(skuCode)>=requiredQuantity){
            return true;
        }
        return  false;

    }

}
