package com.times.cloud.mybatis.mapper;

import com.times.cloud.common.bean.mysql.ProcessTask;
import com.times.cloud.mybatis.core.IMapper;

public interface ProcessTaskMapper extends IMapper<ProcessTask> {

    public void deleteByProcessIdAndTaskId(String processId, String taskId);
}