package gg.quartzdev.qshieldconfig;

import org.bukkit.plugin.java.JavaPlugin;

public final class qArrowsDisableShields extends JavaPlugin {

    private static qArrowsDisableShields instance;

    public static qArrowsDisableShields getInstance(){
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        // Plugin startup logic
        this.getServer().getPluginManager().registerEvents(new ShieldHitListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
