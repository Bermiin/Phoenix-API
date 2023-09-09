package xyz.refinedev.phoenix.handler;

import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;
import xyz.refinedev.phoenix.chat.api.ChatChannelType;
import xyz.refinedev.phoenix.chat.api.ChatLimitation;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author Creaxx
 * Created At: 5/20/2023
 */

@Getter
public class ChatHandler {
    private final List<ChatChannelType> chatChannels = new ArrayList<>();
    private final List<ChatLimitation> chatLimitations = new ArrayList<>();
    private List<ChatLimitation> sortedChatLimitations = new ArrayList<>();

    public String getReplacedChatFormat(UUID uuid, String message) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public List<String> getAccessChannelsSorted(Player player) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void addChannel(ChatChannelType chatChannelType) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public ChatChannelType getChannelByName(String s) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void addLimitation(ChatLimitation chatLimitation) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public ChatLimitation getLimitationByName(String s) {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }

    public void sortChatLimitations() {
        throw new IllegalPluginAccessException("You need to install the plugin.");
    }
}
