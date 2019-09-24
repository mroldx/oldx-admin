package com.oldx.common.api;

import com.google.common.base.MoreObjects;

import java.io.Serializable;

public class PageRequest implements Serializable {
    private static final long serialVersionUID = 3424324L;

    private int pageSize;
    private int pageNum;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("pageSize", pageSize)
                .add("pageNum", pageNum)
                .toString();
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

}
