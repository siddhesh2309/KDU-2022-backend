package com.kd.spring.jdbc;

import com.kd.spring.jdbc.service.ActorService;
import com.kd.spring.jdbc.service.FilmService;
import com.kd.spring.jdbc.utils.ObjectUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ActorService actorService = context.getBean(ActorService.class);

        int queryId = 150;
        String queryFirstName = "%ewan%";
        String queryLastName = "%jayne%";
        System.out.println("Get Actor By ID\n");
        System.out.println(ObjectUtils.convertToJson(actorService.getActorById(queryId)));
        System.out.println("Get Actor By FirstName\n");
        System.out.println(ObjectUtils.convertToJson(actorService.getActorByFirstName(queryFirstName)));
        System.out.println("Get Actor By LastName\n");
        System.out.println(ObjectUtils.convertToJson(actorService.getActorByLastName(queryLastName)));
        System.out.println("Get Film By ActorName\n");
        System.out.println(ObjectUtils.convertToJson(actorService.getFilmByActorName(queryFirstName)));


//        FilmService service = context.getBean(FilmService.class);
//        System.out.println(ObjectUtils.convertToJson(service.getFilmById(100L)));
//        System.out.println("\n=========================\n");
//        System.out.println(ObjectUtils.convertToJson(service.getFilmByTitle("%desert%")));
//        System.out.println("\n=========================\n");
//        System.out.println(ObjectUtils.convertToJson(service.getFilmsOfYear(2006L, 10)));
    }
}
