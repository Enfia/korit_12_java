package ch19_collections;

import java.util.*;

/*
    Map은 key-value pair / 쌍 / entry
 */
public class Strmap {
    public static void main(String[] args) {
        Map<String, String> strMap1 = new HashMap<>();
        // key - value 삽입 함수 -> /put(키, 값);
        strMap1.put("kor2026001","김일");
        strMap1.put("kor2026002","김이");
        strMap1.put("kor2026003","김삼");
        strMap1.put("kor2026004","김사");
        strMap1.put("kor2026005","김오");
        System.out.println(strMap1);
        strMap1.put("kor2026005","Five");
        System.out.println(strMap1);

        Map<String, Double[]> koreanScores = new HashMap<>();
        koreanScores.put("김일", new Double[4]);
        Map<String, Double> koreanScore2 = new HashMap<>();
        koreanScore2.put("김일", 98.2);
        koreanScore2.put("김이", 100.0);
        koreanScore2.put("김삼", 22.2);
        koreanScore2.put("김사", 67.45);
        koreanScore2.put("김오", 70.1);
        // value 수정 방법
        // 1. key를 쓰고 value를 수정 가능
        koreanScore2.put("김오", 4.5);
        // 2. replace
        koreanScore2.replace("김육", 789.2);
        /*
            두 가지 방법이 존재하는 이유는 .put()의 경우에는 기본에 key가 존재한다면
            value에 재대입학게 되겠지만 없는 key라면 아예 key를 새로 생성
            반면에 .replace()의 경우에는 존재하지 않는 key라면 value의 갱신이 일어나지 않음
            key가 존재할 떄만 value의 값이 변경됨
         */
        // .contaionsKey() -> boolean 특정 key 존재 여부
        boolean searchKeyFlag1 = strMap1.containsKey("kor2026001");
        System.out.println("kor2026001 존재 여부 : " + searchKeyFlag1);

        // .containsValue() -> boolean : 특정 value 존재 여부
        boolean searchValueFlag1 = strMap1.containsValue("김삼");
        System.out.println(strMap1.get("kor2026001")+ " 존재 여부 : " + searchKeyFlag1);
        //Map의 entry로부터 Set을 생성
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>();
        // 이상의 코드는 set 하나 생성하는데, 내부의 Key가 String, Value가 String인 Map이
        // Set의 각각의 element에 해당한다는 것을 의미함
        Set<Map.Entry<String, String>> entrySet2= strMap1.entrySet();
        // strMap1의 자료형은 당연히 Map일텐데 .entrySet()의 호출 결과가 Set<Map.Entry<String, String>>
        // 으로 자동완성 된 이유는 저희가 그렇게 선언했기 때문임 -> 인텔리제이 support에 해당함
        // 그럼 이제 우리 수준에서는 strMap1.entrySet()의 호출 결과가 일종의 형변환이 이루어진 로직이 있고
        // 해당 자료형으로 리턴해서 entrySet2라는 객체에 데이터를 담았다고 해석할 수 있음
        System.out.println(entrySet2);
        // Map을 Set으로 바꿨다면 아까 학슨한 내용을 토대로 봤을 때 Set -> List로 형변환할 수 있음
//        List<Map.Entry<String, String>> entryList1 = strMap1.entryL
        // 위에 거는 보니까 안됨. Map을 List로 바꾸고 싶다면 Set을 경유해야함
        // 경유해서 Map -> Set -> List가 됐다면 List에 있는 함수도 쓸 수 있으니까 .sort()등을 이용할 수 있음
        Set<String> keySet = strMap1.keySet();
        System.out.println(keySet);
//        Set<String> valueSet = strMap1.values();
        /*
            키는 당연히 중복이 안되기 때문에 Set으로 변환하더라도 데이터의 손실이 없지만
            각 키의 값들은 중복 값이 있을 수도 있기 때문에 그것을 Set 자료형으로 변경할 경우 데이터 누락이
            생실 수 있으므로 불가능함

            그리고 제가 여러분에게 요구하는 수준은 .values()를 봤을 때 Collection 이라는 자료형이 return 된다느 것을 확인했기 때문에
         */
        Collection<String> values = strMap1.values();
        System.out.println(values);
        // 로 써보면 되지 않을까 라고 스스로 추측할 수 있으면 됨
        /*
            Collections는 .sort()할 떄 써봤지만 Collection은 처음 써봤습니다
            근데 리턴 형 본 다음에 직접 쓰신다면 너무 좋겠음
         */

    }
}
