package com.phonebox.core.been;

import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
public class PageData<T> implements Serializable {
    private long count;
    private int currentPage;
    private int pageSize;
    private List<T> data;

}