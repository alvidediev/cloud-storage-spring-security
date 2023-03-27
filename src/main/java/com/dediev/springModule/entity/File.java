package com.dediev.springModule.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "file")
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "file_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    private Status status;
}
