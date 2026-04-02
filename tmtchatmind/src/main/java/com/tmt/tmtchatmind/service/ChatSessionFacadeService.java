package com.tmt.tmtchatmind.service;

import com.tmt.tmtchatmind.model.request.CreateChatSessionRequest;
import com.tmt.tmtchatmind.model.request.UpdateChatSessionRequest;
import com.tmt.tmtchatmind.model.response.CreateChatSessionResponse;
import com.tmt.tmtchatmind.model.response.GetChatSessionResponse;
import com.tmt.tmtchatmind.model.response.GetChatSessionsResponse;

public interface ChatSessionFacadeService {
    GetChatSessionsResponse getChatSessions();

    GetChatSessionResponse getChatSession(String chatSessionId);

    GetChatSessionsResponse getChatSessionsByAgentId(String agentId);

    CreateChatSessionResponse createChatSession(CreateChatSessionRequest request);

    void deleteChatSession(String chatSessionId);

    void updateChatSession(String chatSessionId, UpdateChatSessionRequest request);
}
