package ch16_bean;

import lombok.*;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
public class UserEntityLombok {
    private int username;
    @Setter
    private int password;
    @NonNull
    private  String email;
    private String name;
}
