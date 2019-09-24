package com.jdk_source_code.demo.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author lilin
 * @date 2019-09-24
 */
@Data
@Table(name = "tb_user")
public class UserDO implements Serializable {
    @Id
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "nickname")
    private String nickname;
}
