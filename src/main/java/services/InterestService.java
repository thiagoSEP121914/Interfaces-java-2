package services;

public interface InterestService {

    Double getInteresRate ();

    default Double payment (Double amount, int months) {
        return amount * Math.pow( 1.0 + getInteresRate() / 100.0, months );
    }

}
