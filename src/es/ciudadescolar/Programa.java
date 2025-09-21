package es.ciudadescolar;

import es.ciudadescolar.utils.MessageManager;

public class Programa
{
    public static void main(String[] args) throws Exception
    {
        //System.out.println("Empezamos a usar Repositorios de Código…");
        System.out.println(MessageManager.SALUDO);
        System.out.print(MessageManager.metodoUsuario());

    }
}