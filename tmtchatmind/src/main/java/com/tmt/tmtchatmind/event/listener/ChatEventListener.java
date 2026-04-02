package com.tmt.tmtchatmind.event.listener;

import com.tmt.tmtchatmind.agent.TmtChatMind;
import com.tmt.tmtchatmind.agent.TmtChatMindFactory;
import com.tmt.tmtchatmind.event.ChatEvent;
import lombok.AllArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ChatEventListener {

    private final TmtChatMindFactory tmtChatMindFactory;

    @Async
    @EventListener
    public void handle(ChatEvent event) {
        // 创建一个 Agent 实例处理聊天事件
        TmtChatMind tmtChatMind = tmtChatMindFactory.create(event.getAgentId(), event.getSessionId());
        tmtChatMind.run();
    }
}
