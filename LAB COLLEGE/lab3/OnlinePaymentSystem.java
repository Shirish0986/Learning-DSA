public class OnlinePaymentSystem {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment upi = new UPIPayment();
        Payment wallet = new WalletPayment();
        
        double amount = 150.0;
        
        System.out.println("Credit Card Payment: $" + creditCard.processPayment(amount));
        System.out.println("UPI Payment: $" + upi.processPayment(amount));
        System.out.println("Wallet Payment: $" + wallet.processPayment(amount));
    }
}

class Payment {
    double processPayment(double amount) {
        return amount;
    }
}

class CreditCardPayment extends Payment {
    @Override
    double processPayment(double amount) {
        return amount + (amount * 0.02); // 2% transaction fee
    }
}

class UPIPayment extends Payment {
    @Override
    double processPayment(double amount) {
        return amount - (amount * 0.01); // 1% discount
    }
}

class WalletPayment extends Payment {
    @Override
    double processPayment(double amount) {
        if (amount > 100) {
            return amount - (amount * 0.05); // 5% cashback
        }
        return amount;
    }
}
