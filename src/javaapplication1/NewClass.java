
import javaapplication1.Article;

public class Principale
{
    public static void main(String[] args)
    {
        Article a1;a2;
        a1=new Article();
            a1.setReference(100);
            a1.setDesignation(La programation en java);
            a1.setPrix(10.5);
            
        a2=new Article(110,"Les méthodes d'agile",25.5);
        
            test=(a1);
            System.out.println(a1.toString());
            
            test=(a2);
            System.out.println(a2.to string());
            
    }
    public static void test(Article a)
            (
    System.out.println("reference : " +a.getReference());
    
}