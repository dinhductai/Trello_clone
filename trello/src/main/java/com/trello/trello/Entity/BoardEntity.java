package com.trello.trello.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Table(name = "board")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name",nullable = false ,unique = true)
    private String name;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "is_public")
    private boolean isPublic;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id")
    private SiteUserEntity siteUser;

}
