package top.dzurl.pushwebpage.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.dzurl.pushwebpage.core.type.StreamTaskType;

/**
 * 推送的参数
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseTaskParm {


    /**
     * 任务类型
     */
    private StreamTaskType taskType = StreamTaskType.PushWebPage;


    /**
     * 屏幕宽度
     */
    private long screenWidth = 1366;


    /**
     * 屏幕高度
     */
    private long screenHeight = 768;

    /**
     * 帧率
     */
    private int frameRate = 30;

    /**
     * 视屏码率
     */
    private int vedioBitrate = 2500;

    /**
     * 音频码率
     */
    private int audioBitrate = 64;


    /**
     * 输出的分辨率
     */
    private double outputRate = 1;


    /**
     * 输出宽度,如果为空则为屏幕宽度 * rate
     */
    private Long outputWidth;

    /**
     * 输出高度,如果为空则为屏幕高度 * rate
     */
    private Long outputHeight;


    /**
     * 网页会话超时时间
     */
    private long sessionTimeout = 60 * 60 * 24 * 7;


    /**
     * 原地址
     */
    private String url;

    /**
     * 拉流地址
     */
    private String pushUrl;
}
