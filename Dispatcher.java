
public class Dispatcher {
    private String nameDispatcher;

    public void setNameDispatcher(String nameDispatcher){
        this.nameDispatcher= nameDispatcher;

    }

    public String getNameDispatcher(){
        return nameDispatcher;
    }
    // проверяем может ли водитель поехать в поездку на машине, если да, то отправляем
    public void appointTrip(Automobile automobile, Driver driver){

        if(!driver.getIsDismissed() && !automobile.getIsAutoBroken()){
            System.out.println("The driver can go on a trip");

            System.out.println("Sent " + driver.getNameDriver() + " on automobile " + automobile.getNumberAuto());
            System.out.println("============================");
        }else if(driver.getIsDismissed()){
            System.out.println("The driver is dismissed");
            System.out.println("============================");
        }else if(automobile.getIsAutoBroken()){
            System.out.println("The auto is broken");
        }
    }

    public void dismissedDriver(Driver driver){

        driver.setIsDismissed(true);
        System.out.println("The driver " + driver.getNameDriver() + " was dismissed");
        System.out.println("=================================");
    }

}
