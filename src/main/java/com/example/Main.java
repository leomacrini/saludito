package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] arg){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Saludo saludito = (Saludo) context.getBean("saludo");

        String texto = saludito.Saludar();
        System.out.println(texto);
    }


}
