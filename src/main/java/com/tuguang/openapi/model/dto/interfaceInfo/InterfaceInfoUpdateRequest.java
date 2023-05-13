package com.tuguang.openapi.model.dto.interfaceInfo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户更新请求
 *
 * @author
 */
@Data
public class InterfaceInfoUpdateRequest implements Serializable {
    /**
     * 主键
     */
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
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
