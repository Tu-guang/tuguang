package com.tuguang.openapi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tuguang.openapi.common.ErrorCode;
import com.tuguang.openapi.exception.BusinessException;
import com.tuguang.openapi.model.entity.InterfaceInfo;
import com.tuguang.openapi.service.InterfaceInfoService;
import com.tuguang.openapi.mapper.InterfaceInfoMapper;
import org.springframework.stereotype.Service;

/**
 * @author 陈
 * @description 针对表【interface_info(接口信息)】的数据库操作Service实现
 * @createDate 2023-05-12 23:04:12
 */
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
        implements InterfaceInfoService {

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo,boolean add){
        if(interfaceInfo==null){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
    }
}




