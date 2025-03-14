package com.trello.trello.Dto.Response;

import com.trello.trello.Enum.Status;
import lombok.*;

import java.util.Date;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SiteUserResponse {
    private String name;
    private String email;
    private String image;
    private String password;
    private Date signupDate;
    private Status status;

}
