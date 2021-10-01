package censusanalyser;

import com.opencsv.bean.CsvBindByName;

public class IndiaCensusCSV {

    @CsvBindByName(column = "state", required = true)
    public String state;

    @CsvBindByName(column = "Population", required = true)
    public int population;

    @CsvBindByName(column = "AreaInSqKm", required = true)
    public int totalArea;

    @CsvBindByName(column = "DensityPerSqKm", required = true)
    public int populationDensity;

    public IndiaCensusCSV(){

    }
    public IndiaCensusCSV(String state, int population, int populationDensity, int totalArea) {
        this.state=state;
        this.population=population;
        this.populationDensity=populationDensity;
        this.totalArea=totalArea;

    }
}
