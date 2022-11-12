public class Cargo {

    private final Dimensions dimensions;
    private final double weight;
    private final String address;
    private final boolean isPossibleToFlip;
    private final String regNumber;
    private final boolean isFragile;

    public Cargo(Dimensions dimensions, double weight, String address,
                 boolean isPossibleToFlip, String regNumber, boolean isFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.isPossibleToFlip = isPossibleToFlip;
        this.regNumber = regNumber;
        this.isFragile = isFragile;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    public boolean isPossibleToFlip() {
        return isPossibleToFlip;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean isFragile() {
        return isFragile;
    }

    public Cargo copy(Dimensions dimensions,  double weight, String address) {
        return new Cargo(dimensions, weight, address,
                this.isPossibleToFlip, this.regNumber, this.isFragile);
    }
}
