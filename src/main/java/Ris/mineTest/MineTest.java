package Ris.mineTest;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class MineTest extends JavaPlugin {

    @Override
    public void onEnable() {
        // 플러그인 활성화 시 호출됩니다.
        getLogger().info("HelloWorldPlugin has been enabled!");
        getCommand("hello").setExecutor(this); // /hello 명령어를 이 플러그인으로 처리
    }

    @Override
    public void onDisable() {
        // 플러그인 비활성화 시 호출됩니다.
        getLogger().info("HelloWorldPlugin has been disabled!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // /hello 명령어 처리
        if (command.getName().equalsIgnoreCase("hello")) {
            sender.sendMessage("Hello, World!"); // 채팅에 메시지 전송
            return true;
        }
        return false;
    }
}
