package com.times.cloud.mybatis.mapper;

import com.times.cloud.common.bean.mysql.Task;
import com.times.cloud.mybatis.core.IMapper;

import java.util.List;

public interface TaskMapper extends IMapper<Task> {

    public List<Task> queryTasksByProcessId(String processId);

    public List<Task> queryFromTasksByTaskId(String taskId);
}