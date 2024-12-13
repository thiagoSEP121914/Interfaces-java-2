package services;

public class BrazilInterestService implements InterestService {

    private double interestService;

    public BrazilInterestService (double interestRate) {
        this.interestService = interestRate;
    }
    @Override
    public Double getInteresRate() {
        return this.interestService;
    }
}
