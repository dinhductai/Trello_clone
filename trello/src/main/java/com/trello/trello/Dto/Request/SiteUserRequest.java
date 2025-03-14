package com.trello.trello.Dto.Request;

import com.trello.trello.Enum.Role;
import com.trello.trello.Enum.Status;
import lombok.*;

import java.util.Date;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SiteUserRequest {
    private String name;
    private String email;
    private String image;
    private String password;
    private Date signupDate;
    private Status status;
    private Role role;

}
