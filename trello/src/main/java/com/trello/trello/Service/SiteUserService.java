package com.trello.trello.Service;

import com.trello.trello.Dto.Response.SiteUserResponseDTO;
import com.trello.trello.Entity.SiteUserEntity;
import org.springframework.data.domain.Page;

import java.util.List;

public interface SiteUserService {
    Page<SiteUserResponseDTO> getAllUserActive(int page, int size);
}
