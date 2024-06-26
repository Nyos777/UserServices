package kz.message_project.userProject.dto;

import kz.message_project.userProject.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserDto {
    private Long id;
    private String username;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String password;
    private byte[] image;
    private Role role;
}
