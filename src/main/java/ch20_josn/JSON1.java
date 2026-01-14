package ch20_josn;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON1 {

    public static void main(String[] args) {
        JsonObject jsonObject1 = new JsonObject();
        // 속성(키-값 쌍)을 추가하는 메서드 -> addProperty()메서드
        jsonObject1.addProperty("username", 1);
        jsonObject1.addProperty("password", 1234);
        jsonObject1.addProperty("email", "a@test.com");
        jsonObject1.addProperty("name", "김일");
        jsonObject1.addProperty("score", 4.5);
        System.out.println(jsonObject1);
        /*
            Map과의 차이점은
            1. Map에서 키에 ""가 없었고 JSON에서는 모든 키에 ""가 있음
            2. Map에서 출력할때 키1=값1 이지만 JSON에서는 "키1":값1임
         */
        jsonObject1.addProperty("job", "대학생 인턴");
        System.out.println(jsonObject1);
        jsonObject1.addProperty("job", "대기업 정규직");
        System.out.println(jsonObject1);
        // 이상은 맵과 같음
        /*
            콘솔에 출력한 결과를 확인했을 때, JSON 결과값이 한 줄로 출력됨 -> 가독성 개선하는 방법
            사람이 읽기 적합한 형태로 출력 가능함
         */
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonData = gson.toJson(jsonObject1);
        System.out.println(jsonData);
    }
}
