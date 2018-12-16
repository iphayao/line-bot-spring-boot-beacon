package com.iphayao.linebot.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.linecorp.bot.model.event.beacon.BeaconContent;
import com.linecorp.bot.model.message.Message;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@JsonTypeName("beacon")
@JsonDeserialize(builder = BeaconMessage.BeaconMessageBuilder.class)
public class BeaconMessage implements Message {
    BeaconContent content;

    public BeaconMessage(BeaconContent content) {
        this.content = content;
    }
}
