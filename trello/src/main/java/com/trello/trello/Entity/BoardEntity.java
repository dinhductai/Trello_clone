package com.trello.trello.Entity;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.*;

import java.io.Serializable;

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
}
