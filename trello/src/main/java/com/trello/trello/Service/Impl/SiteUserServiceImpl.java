package com.trello.trello.Service.Impl;

import com.trello.trello.Dto.Response.SiteUserResponse;
import com.trello.trello.Enum.Status;
import com.trello.trello.Repository.SiteUserRepository;
import com.trello.trello.Service.SiteUserService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Transactional
public class SiteUserServiceImpl implements SiteUserService {

    @Autowired
    private SiteUserRepository siteUserRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Page<SiteUserResponse> getAllUserActive(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Object[]> listUserActive =  siteUserRepository.findAllUserActive(pageable);
        return listUserActive.map(obj ->  SiteUserResponse.builder()
                        .name((String) obj[0])
                        .email((String) obj[1])
                        .image((String) obj[2])
                        .password((String) obj[3])
                        .signupDate((Date) obj[4])
                        .status(Status.valueOf((String) obj[5]))
                        .build());
    }

}
