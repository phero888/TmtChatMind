package com.tmt.tmtchatmind.service;

import com.tmt.tmtchatmind.model.dto.ChatMessageDTO;
import com.tmt.tmtchatmind.model.request.CreateChatMessageRequest;
import com.tmt.tmtchatmind.model.request.UpdateChatMessageRequest;
import com.tmt.tmtchatmind.model.response.CreateChatMessageResponse;
import com.tmt.tmtchatmind.model.response.GetChatMessagesResponse;

import java.util.List;

public interface ChatMessageFacadeService {
    GetChatMessagesResponse getChatMessagesBySessionId(String sessionId);

    List<ChatMessageDTO> getChatMessagesBySessionIdRecently(String sessionId, int limit);

    CreateChatMessageResponse createChatMessage(CreateChatMessageRequest request);

    CreateChatMessageResponse createChatMessage(ChatMessageDTO chatMessageDTO);

    CreateChatMessageResponse agentCreateChatMessage(CreateChatMessageRequest request);

    CreateChatMessageResponse appendChatMessage(String chatMessageId, String appendContent);

    void deleteChatMessage(String chatMessageId);

    void updateChatMessage(String chatMessageId, UpdateChatMessageRequest request);
}
