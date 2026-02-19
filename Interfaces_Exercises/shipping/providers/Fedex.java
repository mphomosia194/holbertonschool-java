package providers;

public class Fedex implements ShippingProvider {

    @Override
    public Shipping calculateShipping(double weight, double value) {

        double weightKg = weight / 1000.0;
        double shippingCost;

        if (weightKg > 1)
            shippingCost = value * 0.10;
        else
            shippingCost = value * 0.05;

        return new Shipping(shippingCost, getShippingProviderType());
    }

    @Override
    public ShippingProviderType getShippingProviderType() {
        return ShippingProviderType.FEDEX;
    }
}
