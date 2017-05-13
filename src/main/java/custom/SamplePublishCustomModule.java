package custom;


import morph.base.actions.Action;
import morph.base.actions.impl.GoToFlowAction;
import morph.base.actions.impl.PublishMessageAction;
import morph.base.beans.simplifiedmessage.SimplifiedMessage;
import morph.base.beans.simplifiedmessage.SimplifiedMessagePayload;
import morph.base.beans.simplifiedmessage.TextMessagePayload;
import morph.base.beans.variables.BotContext;
import morph.base.modules.Module;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jayeshathila
 * on 24/04/17.
 */
@Service
public class SamplePublishCustomModule implements Module {

    @Override
    public String getModuleName() {
        return "sample";
    }

    @Override
    public List<Action> execute(BotContext context) {
        ArrayList<Action> actions = new ArrayList<>();
        SimplifiedMessage message = new SimplifiedMessage();
        TextMessagePayload payload = new TextMessagePayload();
        payload.setText("Hello " + context.getUser().getName());
        ArrayList<SimplifiedMessagePayload> payloads = new ArrayList<>();
        payloads.add(payload);
        message.setPayloads(payloads);
        PublishMessageAction e = new PublishMessageAction();
        e.setSimplifiedMessage(message);
        actions.add(e);
        return actions;
    }
}
