package services;

public class UsaInterestingService implements  InterestService {

    private double interestingRate;

    public UsaInterestingService (double interestingRate) {
        this.interestingRate = interestingRate;
    }
    @Override
    public Double getInteresRate() {
        return this.interestingRate;
    }
}
