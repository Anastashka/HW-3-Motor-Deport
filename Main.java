//процесс автоматизирован, чтобы проверить работу программы
/*Система  Автобаза.  Диспетчер  распределяет заявки на  Рейсы  между Водителями и назначает

        для этого Автомобиль. Водитель может сделать заявку на ремонт. Диспетчер может отстранить

        Водителя от работы. Водитель делает отметку о выполнении Рейса и состоянии Автомобиля.
        */
public class Main {

    public static void main(String[] args) {
        Automobile automobile = new Automobile(123456);
        Automobile automobile1 = new Automobile(789456);
        Automobile automobile2 = new Automobile(987456);
        Automobile[] automobiles = new Automobile[]{automobile, automobile1, automobile2};

        Driver driver = new Driver("Bob Smith");
        Driver driver2 = new Driver("Jack Nouble");
        Driver driver3 = new Driver("Ivan Ivanov");
        Driver[] drivers = new Driver[]{driver, driver2, driver3};

        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setNameDispatcher("Mikki Rick");


        Voyage voyage = new Voyage();
        //ставим отметку, что машина сломана, машина будет сломана только в 1м случае, т.к потом меняется отметка на false. В последующих рейсах машина будет впорядке
        automobile.setIsAutoBroken(true);
        driver.needRepair(automobile);
        //отстраняем водителя 1, чтобы проверить работу программы
        dispatcher.dismissedDriver(driver);
        for(int i=0; i<automobiles.length; i++){
            //проверяем может ли водитель отправится
            System.out.println("Check driver " + drivers[i].getNameDriver());
            dispatcher.appointTrip(automobiles[i], drivers[i]);
            //если водитель отправился в поездку ставим отметку, что поездка завершена
            if(!drivers[i].getIsDismissed()){
                voyage.setEndVoyage(true);
                drivers[i].endVoyageMark(voyage);
                System.out.println("The voyage is end");
                System.out.println("========================");
            }else{
                voyage.setEndVoyage(false);
                drivers[i].endVoyageMark(voyage);
            }
        }



    }

}
