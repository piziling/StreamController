package top.dzurl.pushwebpage.core.conf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import top.dzurl.pushwebpage.core.model.ReportModel;

import java.util.Map;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "push.task")
public class PushTaskConf {


    /**
     * docker.sock 路径
     */
    private String DockerSock = "/var/run/docker.sock";

    /**
     * 镜像地址
     */
    private String imageUrl = "registry.cn-chengdu.aliyuncs.com/1s/ffmpeg_chrome";

    /**
     * 镜像里的端口
     */
    private int remoteHostPort = 4444;


    /**
     * 网桥的名称,必须一致，否则可能无法通信
     */
    private String dockerNetWorkName = "stream_bridge";


    /**
     * 保留的内存
     */
    private double reservationsMemory = 1 * 1024 * 1024 * 1024 * 1.2;


    /**
     * 保留的CPU百分比
     */
    private double reservationsCpu = 0.2f;


    /**
     * 限制CPU的核心频率(核心数),支持小数
     */
    private float limitCpuCore = 2f;


    /**
     * 每次报告的时间
     */
    private long reportTime = 1000 * 60;


    /**
     * 报告
     */
    private ReportModel report;


}
