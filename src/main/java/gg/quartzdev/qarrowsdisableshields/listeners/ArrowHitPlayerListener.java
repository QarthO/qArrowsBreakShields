package gg.quartzdev.qarrowsdisableshields.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class ArrowHitPlayerListener implements Listener {

    @EventHandler
    public void onArrowHitPlayer(ProjectileHitEvent event){

//        IF projectile isn't an arrow
        if(!(event.getEntity() instanceof Arrow)) return;
//        If it didnt hit an entity
        if(event.getHitEntity() == null) return;
//        If the entity isn't a player
        if(!(event.getHitEntity() instanceof Player)) return;

//        Get player
        Player player = (Player) event.getHitEntity();
//        Put shield on 5 second cooldown
        player.setCooldown(Material.SHIELD, 20*5);
    }
}
