import helpers.Drink;
import models.DrinkModel;
import models.MessageModel;
import models.ReportModel;
import services.DrinkServiceImpl;
import services.OverageQuantityCheckerImpl;
import services.PersistenceServiceI;
import services.PersistenceServiceImpl;

public class Main {
    public static void main(String[] args) {
        PersistenceServiceImpl persistenceService = new PersistenceServiceImpl();
        OverageQuantityCheckerImpl checker =  new OverageQuantityCheckerImpl();
        ReportModel report = persistenceService.getReport();

        DrinkServiceImpl coffeeService = new DrinkServiceImpl(report, checker);

        coffeeService.makeDrink(new DrinkModel(Drink.TEA,2, false),0.7);

        coffeeService.sendMessage(new MessageModel("I need more shugar!"));

        report.getReport();

        persistenceService.saveReport(report);
    }
}
