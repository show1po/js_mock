package com.js.mock.web.requests;

import com.js.mock.web.bases.VideoPager;
import com.js.mock.web.videos.enums.VideoSourceEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Show on 2017/6/2.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindVideoReq {
    private VideoSourceEnum videoSourceEnum;
    private String keyword;
    private VideoPager videoPager;
}
