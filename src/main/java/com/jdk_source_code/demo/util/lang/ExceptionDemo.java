package com.jdk_source_code.demo.util.lang;

import com.jdk_source_code.demo.dao.database1.UserMapper;
import com.jdk_source_code.demo.domain.UserDO;
import com.jdk_source_code.demo.exception.MyException;
import com.jdk_source_code.demo.exception.MyExceptionEnum;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lilin
 * @date 2019-09-30
 */
public class ExceptionDemo {
    @Resource
    private static UserMapper userMapper;

    public static void test() throws MyException {
        UserDO userDO = userMapper.selectByPrimaryKey(1);
        if(userDO ==null){
            throw new MyException(MyExceptionEnum.USER_NOT_EXIST.getMsg());
        }

    }

    public static void main(String[] args) {

    }


}
