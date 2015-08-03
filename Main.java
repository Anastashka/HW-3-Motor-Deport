//������� ���������������, ����� ��������� ������ ���������
/*�������  ��������.  ���������  ������������ ������ ��  �����  ����� ���������� � ���������

        ��� ����� ����������. �������� ����� ������� ������ �� ������. ��������� ����� ����������

        �������� �� ������. �������� ������ ������� � ���������� ����� � ��������� ����������.
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
        //������ �������, ��� ������ �������, ������ ����� ������� ������ � 1� ������, �.� ����� �������� ������� �� false. � ����������� ������ ������ ����� ��������
        automobile.setIsAutoBroken(true);
        driver.needRepair(automobile);
        //���������� �������� 1, ����� ��������� ������ ���������
        dispatcher.dismissedDriver(driver);
        for(int i=0; i<automobiles.length; i++){
            //��������� ����� �� �������� ����������
            System.out.println("Check driver " + drivers[i].getNameDriver());
            dispatcher.appointTrip(automobiles[i], drivers[i]);
            //���� �������� ���������� � ������� ������ �������, ��� ������� ���������
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
