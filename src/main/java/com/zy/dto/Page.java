package com.zy.dto;

import java.util.List;

public class Page<T> {
    private List<T> page;
    private Integer pageCount;
    private boolean hasPre;
    private boolean hasNext;

    @Override
    public String toString() {
        return "Page{" +
                "page=" + page +
                ", pageCount=" + pageCount +
                ", hasPre=" + hasPre +
                ", hasNext=" + hasNext +
                '}';
    }

    public List<T> getPage() {
        return page;
    }

    public void setPage(List<T> page) {
        this.page = page;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public boolean isHasPre() {
        return hasPre;
    }

    public void setHasPre(boolean hasPre) {
        this.hasPre = hasPre;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }
}
