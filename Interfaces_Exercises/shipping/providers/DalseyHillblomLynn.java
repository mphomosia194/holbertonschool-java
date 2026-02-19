package providers;

public class DalseyHillblomLynn implements ShippingProvider {

    @Override
    public Shipping calculateShipping(double weight, double value) {

        double weightKg = weight / 1000.0;
        double shippingCost;

        if (weightKg > 5)
            shippingCost = value * 0.12;
        else
            shippingCost = value * 0.04;

        return new Shipping(shippingCost, getShippingProviderType());
    }

    @Override
    public ShippingProviderType getShippingProviderType() {
        return ShippingProviderType.DHL;
    }
}
