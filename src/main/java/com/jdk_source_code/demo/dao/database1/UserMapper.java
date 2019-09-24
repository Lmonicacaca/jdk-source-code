package com.jdk_source_code.demo.dao.database1;

import com.jdk_source_code.demo.domain.UserDO;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author lilin
 * @date 2019-09-24
 */
public interface UserMapper extends MySqlMapper<UserDO>, Mapper<UserDO> {
}
