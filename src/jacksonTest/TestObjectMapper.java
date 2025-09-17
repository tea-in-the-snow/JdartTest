package jacksonTest;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestObjectMapper {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static String testWriteValueAsString(Object value) throws Exception {
        return objectMapper.writeValueAsString(value);
    }
    
    // 一个用于测试的简单POJO类
    private static class User {
        public String name;
        public int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        System.out.println("Testing ObjectMapper");
    }
}
