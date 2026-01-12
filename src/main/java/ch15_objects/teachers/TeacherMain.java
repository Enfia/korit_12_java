package ch15_objects.teachers;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

// 쉬움
public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("안근수", "코리아아이티");
        Teacher teacher2 = new Teacher("안근수", "코리아아이티");
//        System.out.println(teacher1);
//        System.out.println(teacher2);
//        boolean result1 = teacher1.equals(teacher2);
//        System.out.println(result1);
        Class tClass = teacher1.getClass();
        Field[] fields = tClass.getDeclaredFields();

        for(Field fieldNum : fields){
            System.out.println("필드명 출력 : "+fieldNum.getName());
            System.out.println("클래스 명 출력 : " + fieldNum.getType().getSimpleName());
            System.out.println("패키지 명 + 클래스 명 출력 : " + fieldNum.getType());
        }
//        System.out.println(Arrays.toString(fields));
        Method[] methods = tClass.getDeclaredMethods();
        System.out.println(Arrays.toString(methods));
        for (Method method : methods){
            System.out.println("메서드 명 : " + method.getName());
            System.out.println("메서드 명 : " + method.getAnnotatedReturnType());
        }

        ch15_objects.Teacher teacher3 = new ch15_objects.Teacher("안근수", "코리아아이티");
        boolean result2 = teacher1.equals(teacher3);
        System.out.println(result2);

    }
}
