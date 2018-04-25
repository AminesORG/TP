import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class EsiMeal {
    public ArrayList<Client> LesClients;
    public Map MetDispo;
    public static final int Capasite= 80;
    public int NbTabInt;
    public int NbTabExt;
    public ArrayList<Commande>LesCommandesEff;
    public ArrayList<Commande>LesCommandesAtt;
    public ArrayList<Date> DateEvenArr;
    public void ReservRest(Evenement Eve){
        boolean Accept=true;
        for (Date Dat:DateEvenArr) {
            if (Eve.getDate_Consommation().compareTo(Dat)== 0 ){
                Accept = false;
            }
        }
        if (Accept){
        DateEvenArr.add(Eve.getDate_Consommation())}
        else{
            System
        }
    };


}
