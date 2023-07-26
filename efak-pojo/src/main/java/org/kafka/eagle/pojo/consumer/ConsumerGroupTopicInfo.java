/**
 * ConsumerGroupTopicInfo.java
 * <p>
 * Copyright 2023 smartloli
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kafka.eagle.pojo.consumer;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Description: TODO
 * @Author: smartloli
 * @Date: 2023/7/26 21:51
 * @Version: 3.4.0
 */
@Data
@TableName("ke_consumer_group_topic")
public class ConsumerGroupTopicInfo implements Cloneable {
    /**
     * BrokerId AUTO_INCREMENT
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * clusterId
     */
    private String clusterId = "";

    /**
     * Consumer group id.
     */
    private String groupId = "";

    private String topicName = "";

    private Long logsize;

    private Long logsizeDiff;

    private Long offsets;

    private Long offsetsDiff;

    private Long lag;

    private String day;

    private Long timespan;

    /**
     * Update time.
     */
    private LocalDateTime modifyTime = LocalDateTime.now();


}
