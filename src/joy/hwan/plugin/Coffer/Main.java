package joy.hwan.plugin.Coffer;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	final ColorInventory colorInventory;
	
	public Main() {
		this.colorInventory = new ColorInventory(this);
	}

	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		super.onDisable();
	}

	@Override
	public void onEnable() {
		// TODO Auto-generated method stub
		super.onEnable();
		
		registerEvent();
	}
	
	public void registerEvent() {
		getServer().getPluginManager().registerEvents(colorInventory, this);
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void playerInteractEvent(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		
		Action action = event.getAction();
		
		if(action.equals(Action.RIGHT_CLICK_BLOCK)) {
			Block block = event.getClickedBlock();
			Material material = block.getType();
			
			if(material.equals(Material.CHEST)) {
				
			}
		}
	}

}
