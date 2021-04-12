package org.zerock.ex2.entity;

import lombok.ToString;

import javax.persistence.*;


@lombok.ToString
@Entity
@Table(name="tbl_memo")
public class Memo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;
}
