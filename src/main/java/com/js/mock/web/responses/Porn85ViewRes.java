package com.js.mock.web.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by Show on 2017/5/17.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Porn85ViewRes {
    private List<Porn85Res> porn85Views;
    private Integer pages;
    private Integer currentPage;
    private Integer viewBy;
    private Integer totalItems;
}
