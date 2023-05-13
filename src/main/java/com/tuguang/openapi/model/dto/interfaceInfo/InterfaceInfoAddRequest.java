package com.tuguang.openapi.model.dto.interfaceInfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户创建请求
 *
 * @author
 */
@Data
public class InterfaceInfoAddRequest implements Serializable {
    /**
     * 名称
     */
    private String name;

    /**
     * 描达
     */
    private String description;

    /**
     * 接口地址
     */
    private String url;

    /**
     * 请求头
     */
    private String requestHeader;

    /**
     * 相应头
     */
    private String responeHeader;

    /**
     * 参数
     */
    private String params;

    /**
     * 请求类型
     */
    private String method;

    /**
     * 创建人
     */
    private Long userId;

}