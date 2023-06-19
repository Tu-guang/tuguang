package com.tuguang.openapi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tuguang.tuguangcommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2023-06-07 21:41:50
* @Entity com.tuguang.openapi.model.entity.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




