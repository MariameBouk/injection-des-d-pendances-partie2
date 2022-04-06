package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotations {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("dao","metier","ext"); //scanner tous les classes de package dao et metier
        IMetier metier=context.getBean(IMetier.class); //ou IMetier metier= (IMetier) context.getBean("metier");
        System.out.println("Résultat avec Spring version annotations : "+metier.calcul());
    }
}
