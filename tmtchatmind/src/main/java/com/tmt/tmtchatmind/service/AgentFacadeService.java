package com.tmt.tmtchatmind.service;

import com.tmt.tmtchatmind.model.request.CreateAgentRequest;
import com.tmt.tmtchatmind.model.request.UpdateAgentRequest;
import com.tmt.tmtchatmind.model.response.CreateAgentResponse;
import com.tmt.tmtchatmind.model.response.GetAgentsResponse;

public interface AgentFacadeService {
    GetAgentsResponse getAgents();

    CreateAgentResponse createAgent(CreateAgentRequest request);

    void deleteAgent(String agentId);

    void updateAgent(String agentId, UpdateAgentRequest request);
}
