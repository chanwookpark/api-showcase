import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.factories.SchemaFactoryWrapper;
import org.junit.Test;

import java.io.Serializable;

/**
 * Created by chanwook on 2014. 8. 6..
 */
public class JsonSchemaTest {
    static class Person implements Serializable{
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    @Test
    public void readSchemaString() throws Exception {
        SchemaFactoryWrapper v = new SchemaFactoryWrapper();
        ObjectMapper m = new ObjectMapper();
        m.acceptJsonFormatVisitor(m.constructType(Person.class), v);
        JsonSchema schema = v.finalSchema();

        String schemaString =
                m.writerWithDefaultPrettyPrinter().writeValueAsString(schema);
        System.out.println("schema: " + schemaString);
    }
}
