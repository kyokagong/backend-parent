package com.times.cloud.mybatis.mapper;

import com.times.cloud.common.bean.mysql.TaskParam;
import com.times.cloud.mybatis.core.IMapper;

import java.util.List;

public interface TaskParamMapper extends IMapper<TaskParam> {

    public List<TaskParam> queryTaskParamsByTaskId(String taskId);
}