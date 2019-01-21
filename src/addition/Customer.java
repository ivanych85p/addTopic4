package addition;

public class Customer {
    String name;
    Car car;
    boolean customerCardOfSto;
    boolean needEngineService;
    boolean ownEngineOil;
    boolean needFilterService;
    boolean ownFilters;
    boolean needAntifreezeService;
    boolean needTransmissionService;
    boolean ownTransmissionOil;
    boolean needComputerDiagnostic;

    public Customer(String name, Car car, boolean customerCardOfSto, boolean needEngineService,
                    boolean ownEngineOil, boolean needFilterService, boolean ownFilters, boolean needAntifreezeService,
                    boolean needTransmissionService, boolean ownTransmissionOil,
                    boolean needComputerDiagnostic) {
        this.name = name;
        this.car = car;
        this.customerCardOfSto = customerCardOfSto;
        this.needEngineService = needEngineService;
        this.ownEngineOil = ownEngineOil;
        this.needFilterService = needFilterService;
        this.ownFilters = ownFilters;
        this.needAntifreezeService = needAntifreezeService;
        this.needTransmissionService = needTransmissionService;
        this.ownTransmissionOil = ownTransmissionOil;
        this.needComputerDiagnostic = needComputerDiagnostic;
    }
}
