package org.lexicon;

public class CurrencyRates {

    public static final double SEK_TO_USD_RATE = 0.097851038 ;
    public static final double USD_TO_SEK_RATE = 10.2189;
    public static final double SEK_TO_EURO_RATE = 0.089541932;
    public static final double EURO_TO_SEK_RATE = 11.1680;

    public static double exchangeRateSekToUsd(double SekToUsdAmount) {
        return SekToUsdAmount * SEK_TO_USD_RATE;
    }

    public static double exchangeRateUsdToSek(double UsdToSekAmount) {
        return UsdToSekAmount * USD_TO_SEK_RATE;
    }

    public static double exchangeRateSekToEuro(double sekToEuroAmount) {
        return sekToEuroAmount * SEK_TO_EURO_RATE;
    }

    public static double exchangeRateEuroToSek(double euroToSekAmount) {
        return EURO_TO_SEK_RATE * SEK_TO_EURO_RATE;
    }


}


