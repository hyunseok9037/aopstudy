package shop.mtcoding.aopstudy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
    private String tel;
}
