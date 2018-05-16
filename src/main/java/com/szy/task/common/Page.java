package com.szy.task.common;

import lombok.Data;

/**
 * @Description:
 * @Author: sunzhaoyan
 * @CreateDate: 2018-05-15 23:19
 * @Version: 1.0
 **/
@Data
public class Page {
    private Integer pageNum;
    private Integer pageSize;

    public Page() {}

    public Page(Integer pageNum, Integer pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public boolean checkVaild() {
        if (this.pageNum == null) {
            return false;
        }
        if (this.pageSize == null) {
            return false;
        }
        return true;
    }
}
