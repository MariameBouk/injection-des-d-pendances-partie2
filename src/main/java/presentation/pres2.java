package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres2 {
    public static void main(String[] args) throws Exception {
        /*
        instanciation dynamique
         */
        String path= "config.txt";
        Scanner scanner=new Scanner(new File(path));
        String daoClassName=scanner.nextLine(); //lire la première ligne de fichier text
        Class cDao=Class.forName(daoClassName); //charger la classe
        IDao dao=(IDao)cDao.newInstance(); //fait appel au constructeur sans paramètres (par défaut)
        System.out.println(dao.getData());

        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();

        Method method=cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);

        System.out.println("Résultat=>"+metier.calcul());
    }
}
