
public class Driver {

    private String nameDriver;
    private boolean isDismissed;

    Driver(String nameDriver){
        this.nameDriver = nameDriver;

    }

    public void setIsDismissed(boolean isDismissed) {
        this.isDismissed = isDismissed;
    }
    public void setNameDriver(String nameDriver){
        this.nameDriver = nameDriver;
    }

    public boolean getIsDismissed(){
        return isDismissed;
    }
    public String getNameDriver(){
        return nameDriver;
    }
    //водитель делает ометку завершена ли поездка
    public void endVoyageMark(Voyage voyage){
        voyage.setEndVoyage(true);
    }
    //отметка нужно ли машине чиниться
    public void needRepair(Automobile car){
        //меняем отметку на ОК, чтобы автоматизировать процесс работы программы
        if(car.getIsAutoBroken()) {
            car.setIsAutoBroken(false);
            System.out.println("The car " + car.getNumberAuto() + " is broken. I need to repair car");
        }else{
            System.out.println("It's OK");
        }
    }




}
