public class RestaurantBillingSystem {
    public static void main(String[] args) {
        Restaurant dineInOrder = new DineIn();
        Restaurant takeawayOrder = new Takeaway();
        
        int quantity = 5;
        double pricePerItem = 100.0;
        
        System.out.println("Dine-In Bill: Rs. " + dineInOrder.calculateBill(quantity, pricePerItem));
        System.out.println("Takeaway Bill: Rs. " + takeawayOrder.calculateBill(quantity, pricePerItem));
    }
}
class Restaurant {
    
    double calculateBill(int quantity, double pricePerItem) {
        return quantity * pricePerItem;
    }
}

class DineIn extends Restaurant {
    @Override
    double calculateBill(int quantity, double pricePerItem) {
        double baseAmount = super.calculateBill(quantity, pricePerItem);
        double serviceCharge = baseAmount * 0.10; // 10% service charge
        return baseAmount + serviceCharge;
    }
}

class Takeaway extends Restaurant {
    @Override
    double calculateBill(int quantity, double pricePerItem) {
        double baseAmount = super.calculateBill(quantity, pricePerItem);
        double packagingCharge = baseAmount * 0.02; // 2% packaging charge
        return baseAmount + packagingCharge;
    }
}