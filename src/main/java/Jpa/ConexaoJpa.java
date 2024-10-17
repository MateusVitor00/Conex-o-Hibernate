package Jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConexaoJpa {
    private static EntityManager entityManager;
    public static void connect(){
        try{
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("CONNECT");
            entityManager = factory.createEntityManager();
            System.out.println("Conexão realizada com sucesso");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static EntityManager getEntityManager(){
        return entityManager;
    }
}
