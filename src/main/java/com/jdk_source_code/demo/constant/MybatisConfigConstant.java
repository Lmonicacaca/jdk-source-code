package com.jdk_source_code.demo.constant;

/**
 * @author lilin
 * @date 2019-09-24
 */
public interface MybatisConfigConstant {
    /**
     * 项目基础包名称，根据公司的项目修改
     */
    String BASE_PACKAGE = "com.jdk_source_code.demo";

    /**
     * Model所在包
     */
    String MODEL_PACKAGE = BASE_PACKAGE + ".domain";


    /**
     * DATABASE_ONE Mapper所在包
     */
     String DATABASE_ONE_PACKAGE = BASE_PACKAGE + ".dao.database1";

    /**
     * DATABASE_TWO Mapper所在包
     */
     String DATABASE_TWO_PACKAGE = BASE_PACKAGE + ".dao.database2";

}
