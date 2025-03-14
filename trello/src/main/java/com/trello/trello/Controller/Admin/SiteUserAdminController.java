package com.trello.trello.Controller.Admin;

import com.trello.trello.Dto.Response.SiteUserResponse;
import com.trello.trello.Entity.SiteUserEntity;
import com.trello.trello.Repository.SiteUserRepository;
import com.trello.trello.Service.SiteUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/admin")
public class SiteUserAdminController {
    @Autowired
    private SiteUserService siteUserService;

    @Autowired
    private SiteUserRepository siteUserRepository;

    //lay tat ca user
    @GetMapping(value = "/all-user")
    public ResponseEntity<Page<SiteUserResponse>>allUser(@RequestParam(defaultValue = "0") int page,
                                                         @RequestParam(defaultValue = "10") int size) {
        //page chi trang hien tai (1+), size chi so user duoc hien thi (10,5...)
        return ResponseEntity.ok(siteUserService.getAllUserActive(page,size));
    }

    @PostMapping(value = "/create-user")
    public ResponseEntity<SiteUserEntity> createUser(@RequestBody SiteUserEntity newUser) {
        return ResponseEntity.ok(siteUserRepository.save(newUser));
    }
}
