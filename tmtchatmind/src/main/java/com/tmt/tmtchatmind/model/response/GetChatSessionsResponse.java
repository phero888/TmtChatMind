package com.tmt.tmtchatmind.model.response;

import com.tmt.tmtchatmind.model.vo.ChatSessionVO;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetChatSessionsResponse {
    private ChatSessionVO[] chatSessions;
}
