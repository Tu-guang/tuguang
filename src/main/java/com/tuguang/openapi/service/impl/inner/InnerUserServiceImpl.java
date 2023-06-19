package com.tuguang.openapi.service.impl.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tuguang.openapi.common.ErrorCode;
import com.tuguang.openapi.exception.BusinessException;
import com.tuguang.openapi.mapper.UserMapper;
import com.tuguang.tuguangcommon.model.entity.User;
import com.tuguang.tuguangcommon.service.InnerUserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * 内部用户服务实现类
 *
 * @author
 * @from
 */
@DubboService
public class InnerUserServiceImpl implements InnerUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getInvokeUser(String accessKey) {
        if (StringUtils.isAnyBlank(accessKey)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("accessKey", accessKey);
        System.out.println(userMapper.selectOne(queryWrapper));
        return userMapper.selectOne(queryWrapper);
    }
}