package providers;

public class UnitedParcelService implements ShippingProvider {

    @Override
    public Shipping calculateShipping(double weight, double value) {

        double weightKg = weight / 1000.0;
        double shippingCost;

        if (weightKg > 2)
            shippingCost = value * 0.07;
        else
            shippingCost = value * 0.045;

        return new Shipping(shippingCost, getShippingProviderType());
    }

    @Override
    public ShippingProviderType getShippingProviderType() {
        return ShippingProviderType.UPS;
    }
}
