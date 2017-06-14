package com.js.mock.web.bases;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Show on 2017/6/2.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class VideoPager {
    private int totalPages;
    private int currentPage;
    private int viewBy;
    private int totalItems;
}
