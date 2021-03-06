package org.javacord.api.event.message;

import org.javacord.api.entity.message.Message;

/**
 * A message event where the message is guaranteed to be in the cache.
 */
public interface CertainMessageEvent extends MessageEvent {

    /**
     * Gets the message of the event.
     *
     * @return The message of the event.
     */
    Message getMessage();

}
