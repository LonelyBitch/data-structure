import com.jianren.config.myConfig1;
import com.jiaren.animal.Dog;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class Test1 {

    @Test
    public void test01() {

        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(myConfig1.class);

        String[] names = anno.getBeanDefinitionNames();

        System.out.println("===================");
        for (String name: names){
            System.out.println(name);
        }

    }
}
