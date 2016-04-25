package com.haniokasai.nukkit.RemoveInv;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;

public class Main extends PluginBase implements Listener{

	public void onEnable() {
		 this.getServer().getPluginManager().registerEvents(this, this);
	}

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        switch (command.getName()) {
            case "ri":
        		if(!sender.hasPermission("removeinv.cmd")){
        			sender.sendMessage(TextFormat.RED + "You don't have permission to use this command.");
        			return false;
        		}else{
        			Player p = (Player) sender;
        			p.getInventory().clearAll();
        			sender.sendMessage(TextFormat.RED + "Your inventory is empty!.");
        			break;
        		}
        }
		return true;
	}
}