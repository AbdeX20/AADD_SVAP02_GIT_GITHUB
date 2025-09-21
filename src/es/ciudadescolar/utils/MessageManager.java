package es.ciudadescolar.utils;

public class MessageManager
{
    public static final String SALUDO = "Empezamos a usar Repositorios de Código…";

    public static String metodoUsuario()
    {
        String usuario = System.getProperty("user.name").toLowerCase();
        return usuario;
    }
}