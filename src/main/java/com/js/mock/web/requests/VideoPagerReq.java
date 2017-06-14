package com.js.mock.web.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Show on 2017/5/17.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VideoPagerReq {
    private int totalPages;
    private int currentPage;
    private int viewBy;
    private String condition;
}
