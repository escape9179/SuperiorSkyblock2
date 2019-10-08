package com.bgsoftware.superiorskyblock.api.events;

import com.bgsoftware.superiorskyblock.api.island.Island;
import com.bgsoftware.superiorskyblock.api.wrappers.SuperiorPlayer;
import org.bukkit.event.HandlerList;

/**
 * IslandLeaveProtectedEvent is called when a player is walking out from the island's protected area.
 * The protected area is the area that players can build in.
 */
public class IslandLeaveProtectedEvent extends IslandLeaveEvent {

    private static final HandlerList handlers = new HandlerList();

    private boolean cancelled = false;

    /**
     * The constructor of the event.
     * @param superiorPlayer The player who left the island's protected area.
     * @param island The island that the player left.
     */
    public IslandLeaveProtectedEvent(SuperiorPlayer superiorPlayer, Island island){
        super(superiorPlayer, island);
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

}
