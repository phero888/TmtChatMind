package com.tmt.tmtchatmind.model.response;

import com.tmt.tmtchatmind.model.vo.ChatMessageVO;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetChatMessagesResponse {
    private ChatMessageVO[] chatMessages;
}

