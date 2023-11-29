package gg.quartzdev.qarrowsdisableshields.listeners;

import org.bukkit.EntityEffect;
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

//        Get the player who got hit by the arrow
        Player player = (Player) event.getHitEntity();
//        Makes sure they're using a shield
        if(player.getActiveItem().getType() != Material.SHIELD) return;
//        Applies the 5 second cooldown to the shield
        player.setCooldown(Material.SHIELD, 20*5);
//        Put's their shield down
        player.clearActiveItem();
//        Plays shield break effect
        player.playEffect(EntityEffect.SHIELD_BREAK);
    }
}
