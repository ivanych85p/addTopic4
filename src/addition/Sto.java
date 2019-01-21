package addition;

import java.util.Scanner;

public class Sto {

    boolean engineService;
    boolean filterService;
    boolean antifreezeService;
    boolean transmissionService;
    boolean computerDiagnostic;
    Customer customer;
    Car car;

    int basePriceEngineService = 50;
    int basePriceTransmissionService = 80;
    int basePriceFilterService = 10;
    int basePriceAntifreezeService = 20;
    int basePriceComputerDiagnostic = 20;



    public Sto(boolean engineService, boolean filterService, boolean antifreezeService, boolean transmissionService,
               boolean computerDiagnostic, Customer customer, Car car) {
        this.engineService = engineService;
        this.filterService = filterService;
        this.antifreezeService = antifreezeService;
        this.transmissionService = transmissionService;
        this.computerDiagnostic = computerDiagnostic;
        this.customer = customer;
        this.car = car;
    }


    double engineServiceCost = 0;
    double filterServiceCost =0;
    double transmissionServiceCost = 0;
    double antifreezeServiceCost = 0;
    double computerDiagnosticCost = 0;
    double totalCost = 0;


    double engineService(Customer customer, Car car) {
        if (customer.needEngineService) {
            if (engineService) {
                if (car.engineCapacity <= 1000) {
                    engineServiceCost = basePriceEngineService;
                } else if ((car.engineCapacity > 1000) && (car.engineCapacity <= 2000)) {
                    engineServiceCost = basePriceEngineService * 1.2;
                } else if ((car.engineCapacity > 2000) && (car.engineCapacity <= 4000)) {
                    engineServiceCost = basePriceEngineService * 1.5;
                } else if (car.engineCapacity > 4000) {
                    engineServiceCost = basePriceEngineService * 2;
                }
                if (customer.ownEngineOil) {
                    engineServiceCost = engineServiceCost * 0.4;
                }
                int nextToMileage = car.mileageOfCar + 10000;
                System.out.println("Мы выполнили замену масла.");
                System.out.println("Следующая замена масла при пробеге " + nextToMileage + " km");
                System.out.println("Стоимость услуги - " + engineServiceCost + " р");
                System.out.println();
            } else {
                System.out.println("Извините, мы не оказываем услугу по замене масла. Обратитесь на другое СТО");
                System.out.println();
            }
        }

        return engineServiceCost;
    }

    double filterService (Customer customer, Car car) {
        if (customer.needFilterService) {
            if (filterService) {
                System.out.println("Сколько фильтров надо поменять?");
                Scanner scanner = new Scanner(System.in);
                int numberOfFilters = scanner.nextInt();
                filterServiceCost = numberOfFilters * basePriceFilterService;
                if (car.yearProduction > 2013) {
                    filterServiceCost = filterServiceCost * 1.2;
                }
                if (customer.ownFilters) {
                    filterServiceCost = filterServiceCost * 0.4;
                }
                int nextToMileage = car.mileageOfCar + 15000;
                System.out.println("Мы выполнили замену фильтров.");
                System.out.println("Следующая замена фильтров при пробеге " + nextToMileage + " km");
                System.out.println("Стоимость услуги - " + filterServiceCost + " р");
                System.out.println();
            } else {
                System.out.println("Извините, мы не оказываем услугу по замене фильтров. Обратитесь на другое СТО");
                System.out.println();
            }
        }
        return filterServiceCost;
    }


    double transmissionService(Customer customer, Car car) {
        if (customer.needTransmissionService) {
            if (transmissionService) {
                int nextToMileage = 0;
                if (car.transmission.equals("AT")) {
                    transmissionServiceCost = basePriceTransmissionService;
                    nextToMileage = car.mileageOfCar + 15000;
                } else {
                    transmissionServiceCost = basePriceTransmissionService * 0.5;
                    nextToMileage = car.mileageOfCar + 100000;
                }
                if (customer.ownTransmissionOil) {
                    transmissionServiceCost = transmissionServiceCost * 0.4;
                }

                System.out.println("Мы выполнили замену масла в коробке передач.");
                System.out.println("Следующая замена масла в коробке передач при пробеге " + nextToMileage + " km");
                System.out.println("Стоимость услуги - " + transmissionServiceCost + " р");
                System.out.println();

            } else {
                System.out.println("Извините, мы не оказываем услугу по замене масла в коробке передач. Обратитесь на другое СТО");
                System.out.println();
            }
        }
        return transmissionServiceCost;
    }


    double antifreezeService (Customer customer, Car car){
        if (customer.needAntifreezeService){
            if (antifreezeService){
                antifreezeServiceCost = basePriceAntifreezeService;
                int nextToMileage = car.mileageOfCar + 50000;
                System.out.println("Мы выполнили замену антифриза.");
                System.out.println("Следующая замена антифриза при пробеге " + nextToMileage + " km");
                System.out.println("Стоимость услуги - " + antifreezeServiceCost + " р");
                System.out.println();
            } else {
                System.out.println("Извините, мы не оказываем услугу по замене антифриза. Обратитесь на другое СТО");
                System.out.println();
            }
        }
        return antifreezeServiceCost;
    }


    double computerDiagnostic (Customer customer, Car car){
        if (customer.needComputerDiagnostic){
            if (computerDiagnostic){
                if (car.yearProduction <= 2013){
                    computerDiagnosticCost = basePriceComputerDiagnostic;
                } else {
                    computerDiagnosticCost = basePriceComputerDiagnostic * 1.3;
                }
                System.out.println("Мы выполнили компьютерную диагностику автомобиля.");
                System.out.println("Стоимость услуги - " + computerDiagnosticCost + " р");
                System.out.println();
            } else {
                System.out.println("Извините, мы не оказываем услугу компьютерной диагностики авто. Обратитесь на другое СТО");
                System.out.println();
            }
        }
        return computerDiagnosticCost;
    }

    public void calculateTotalCost (){
        totalCost = engineServiceCost + filterServiceCost + transmissionServiceCost + computerDiagnosticCost + antifreezeServiceCost;
        if (customer.customerCardOfSto){
            totalCost = totalCost * 0.9;
        }
        System.out.println("Уважаемый, г-н " + customer.name + ". Общая стоимость технического обслуживания вашего автомобиля "
        + car.brand + " " + car.model + ", " + car.yearProduction + " года выпуска, с двигателем объемом " + car.engineCapacity
        + " куб.см составила: " + totalCost + " р");
    }










    }




























