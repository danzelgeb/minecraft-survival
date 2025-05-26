package dev.danzel.smp;

import com.google.common.collect.Lists;
import lombok.Getter;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;

import java.util.ArrayList;

public class Data {
    private static final MiniMessage miniMessage = MiniMessage.miniMessage();
    @Getter
    private static final ArrayList<String> hide = Lists.newArrayList("vulcan", "pl", "plugins", "grim", "grimac", "?", "vulcan:vulcan");

    public static Component text(String text) {
        return miniMessage.deserialize(text);
    }
}
