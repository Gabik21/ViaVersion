package us.myles.ViaVersion.protocols.protocol1_9to1_8.providers;

import us.myles.ViaVersion.api.data.UserConnection;
import us.myles.ViaVersion.api.minecraft.item.Item;
import us.myles.ViaVersion.api.platform.providers.Provider;

public class HotbarProvider implements Provider {
  public Item getItem(final UserConnection info, final int slot) {
    return new Item((short) 0, (byte) 0, (short) 0, null);
  }
}
