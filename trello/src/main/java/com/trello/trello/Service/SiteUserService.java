package com.trello.trello.Service;

import com.trello.trello.Dto.Response.SiteUserResponse;
import org.springframework.data.domain.Page;

public interface SiteUserService {
    Page<SiteUserResponse> getAllUserActive(int page, int size);
}
