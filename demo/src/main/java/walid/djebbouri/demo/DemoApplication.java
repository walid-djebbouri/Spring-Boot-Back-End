package walid.djebbouri.demo;

import walid.djebbouri.demo.collections.listSet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

        listSet listSet = new listSet();
        listSet.getList();
        listSet.inicializeSet();
        System.out.println("\n\n\n\n Hello walid tu vas bien aujourd'hui ? \n\n\n\n");

        System.out.println(listSet.getListByIndex(0));
        System.out.println(listSet.getListByIndex(2));
        System.out.println(listSet.setChild.size());

        System.out.println("\n\n\n\n ah super ravis d'entendre cela \n\n\n\n");

    }

}
