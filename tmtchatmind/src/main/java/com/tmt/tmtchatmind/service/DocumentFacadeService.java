package com.tmt.tmtchatmind.service;

import com.tmt.tmtchatmind.model.request.CreateDocumentRequest;
import com.tmt.tmtchatmind.model.request.UpdateDocumentRequest;
import com.tmt.tmtchatmind.model.response.CreateDocumentResponse;
import com.tmt.tmtchatmind.model.response.GetDocumentsResponse;
import org.springframework.web.multipart.MultipartFile;

public interface DocumentFacadeService {
    GetDocumentsResponse getDocuments();

    GetDocumentsResponse getDocumentsByKbId(String kbId);

    CreateDocumentResponse createDocument(CreateDocumentRequest request);

    CreateDocumentResponse uploadDocument(String kbId, MultipartFile file);

    void deleteDocument(String documentId);

    void updateDocument(String documentId, UpdateDocumentRequest request);
}
