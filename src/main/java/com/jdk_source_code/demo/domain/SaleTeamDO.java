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
@Table(name = "tb_sale_team")
public class SaleTeamDO implements Serializable {
    @Id
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "user_pid")
    private Integer userPid;
}
