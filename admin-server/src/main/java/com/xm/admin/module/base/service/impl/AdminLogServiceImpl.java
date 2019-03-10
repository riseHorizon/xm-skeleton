package com.xm.admin.module.base.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xm.admin.module.base.entity.AdminLog;
import com.xm.admin.module.base.mapper.AdminLogMapper;
import com.xm.admin.module.base.service.IAdminLogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author xiaomalover
 * @since 2019-03-06
 */
@Service
public class AdminLogServiceImpl extends ServiceImpl<AdminLogMapper, AdminLog> implements IAdminLogService {

}
