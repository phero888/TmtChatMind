package com.tmt.tmtchatmind.service;

import com.tmt.tmtchatmind.model.request.CreateKnowledgeBaseRequest;
import com.tmt.tmtchatmind.model.request.UpdateKnowledgeBaseRequest;
import com.tmt.tmtchatmind.model.response.CreateKnowledgeBaseResponse;
import com.tmt.tmtchatmind.model.response.GetKnowledgeBasesResponse;

public interface KnowledgeBaseFacadeService {
    GetKnowledgeBasesResponse getKnowledgeBases();

    CreateKnowledgeBaseResponse createKnowledgeBase(CreateKnowledgeBaseRequest request);

    void deleteKnowledgeBase(String knowledgeBaseId);

    void updateKnowledgeBase(String knowledgeBaseId, UpdateKnowledgeBaseRequest request);
}

