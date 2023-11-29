package gg.quartzdev.qarrowsdisableshields;

import gg.quartzdev.qarrowsdisableshields.listeners.ArrowHitPlayerListener;
import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;
import sun.security.jca.GetInstance;

public final class qArrowsDisableShields extends JavaPlugin {

    @Override
    public void onEnable() {
        int pluginId = 20414;
        Metrics metrics = new Metrics(this, pluginId);
        this.getServer().getPluginManager().registerEvents(new ArrowHitPlayerListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
