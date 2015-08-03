
public class Automobile {
    private int numberAuto;
    //проверка сломано ли авто
    private boolean isBroken;

    Automobile(int numberAuto){
        this.numberAuto = numberAuto;
    }
    public void setNumberAuto(int numberAuto){
        this.numberAuto = numberAuto;
    }
    public void setIsAutoBroken(boolean isBroken){
        this.isBroken = isBroken;
    }

    public int getNumberAuto(){
        return numberAuto;
    }
    public boolean getIsAutoBroken(){
        return isBroken;
    }

}
