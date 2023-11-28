package gg.quartzdev.qshieldconfig;

import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class ShieldHitListener implements Listener {
    @EventHandler
    public void onArrowHitShield(ProjectileHitEvent event){

        if(!(event.getEntity() instanceof Arrow)) return;

        if(event.getHitEntity() == null) return;
        if(!(event.getHitEntity() instanceof Player)) return;
        Player player = (Player) event.getHitEntity();
        player.setCooldown(Material.SHIELD, 20*5);

    }
}
