package sappy.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.*;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.entity.Item;
import org.bukkit.Location;
import org.bukkit.Material;

public class ItemSpawnListener implements Listener {
    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = false)
    public void OnItemSpawn(ItemSpawnEvent event) throws InterruptedException {
        if (!event.getEntity().getName().contains("sapling")) {
            return;
        }

        Item entity = event.getEntity();
        while (!entity.isOnGround()) {
            wait(500);
        }

        Location location = entity.getLocation();
        entity.remove();

        entity.getWorld().getBlockAt(location.add(0, 1, 0)).setType(Material.getMaterial(entity.getName()));
    }
}