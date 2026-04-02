package com.tmt.tmtchatmind.model.response;

import com.tmt.tmtchatmind.model.vo.AgentVO;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetAgentsResponse {
    private AgentVO[] agents;
}
