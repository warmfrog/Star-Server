package com.warmfrog.star.common.dto;

/**
 * @author libo
 * @date 2020/2/5
 */
public class PageDto {
    private static final long serialVersionUID = -9191031305731013230L;

    /**
     * 页面大小
     */
    private Integer pageSize = 10;

    /**
     * 当前页
     */
    private Integer currentPage = 1;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }
}
