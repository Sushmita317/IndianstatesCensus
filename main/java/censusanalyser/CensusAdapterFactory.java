package censusanalyser;

import java.util.Map;

public class CensusAdapterFactory {
    public static Map<String,CensusDAO> getCensusData(CensusAnalyser.Country country,String... csvFilePath) throws CensusAnalyserException {
        if(country.equals(CensusAnalyser.Country.INDIA))
            return new IndiaCensusAdapter().loadCensusData(csvFilePath);
        if(country.equals(CensusAnalyser.Country.US))
            return new USCensusAdapter().loadCensusData(csvFilePath[0]);
        throw new CensusAnalyserException("Unknow Country", CensusAnalyserException.ExceptionType.INVALID_COUNTRY);

    }


}
