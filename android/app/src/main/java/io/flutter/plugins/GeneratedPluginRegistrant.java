package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import com.christian.christian_picker_image.ChristianPickerImagePlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    ChristianPickerImagePlugin.registerWith(registry.registrarFor("com.christian.christian_picker_image.ChristianPickerImagePlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
