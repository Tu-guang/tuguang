package com.tuguang.openapi.model.vo;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 接口信息
 *
 * @TableName interface_info
 */
@TableName(value = "interface_info")
@Data
public class InterfaceInfoPageVO implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

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
     * 接口状态 (0-关闭，1-开启)
     */
    private Integer status;

    /**
     * 请求类型
     */
    private String method;


    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}