package ch20_josn;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@ToString
class User{
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}

public class JSON2 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        User user1 = new User("kim1","9876","a@test.com","김일", "20");
        String jsonData1 = gson.toJson(user1);
        String jsonData2 = gsonBuilder.toJson(user1);
        System.out.println("---그냥 gson---\n"+jsonData1+"\n---gson 빌더---\n" + jsonData2);
        /*
            Map 자료형을 json 데이터로 바꾸는 것도 가능
         */
        Map<String, String> productMap1 = new HashMap<>();
        productMap1.put("productCode","MYWY3KH/A");
        productMap1.put("productName","아이폰 16 프로 맥스");
        String jsonProduct1 = gson.toJson(productMap1);
        String jsonProduct2 = gsonBuilder.toJson(productMap1);
        System.out.println("---그냥 gson---\n"+jsonProduct1+"\n---gson 빌더---\n" + jsonProduct2);
        /*
            이상의 두 사례에서 toJson()이라는 메서드는 argument로
            Java Object 넣는 것도 Map으로 생성된 entry를 Json 형태로 바꾸는 것도 가능
            JsonObject 객체도 바꿀 수 있음

            그러면 반대로 json -> Map / Java Object로 바꾸는 것도 가능

            String data인 json을 ""포함해서 생성하는게 너무 귀찮음
            user1과 productMap1을 json으로 바꾼 데이터를 바꿔보자
         */
        User user2 = gsonBuilder.fromJson(jsonData2, User.class);
        System.out.println(user2);
        Map<String, String> productMap2 = gson.fromJson(jsonProduct2, Map.class);
        System.out.println(productMap2);
        /*
            jsonProduct1, 2는 Java Object로 못 바꿈
         */
        System.out.println("-----------");
        Map<String, String> userMap1 = gson.fromJson(jsonData1, Map.class);
        System.out.println(userMap1);

        List<User> users = new ArrayList<>();
        users.add(user1);
        System.out.println(users);
        String jsonUsers = gsonBuilder.toJson(users);
        System.out.println(jsonUsers);
    }
}
