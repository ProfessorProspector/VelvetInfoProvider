package prospector.velvetinfodisplay.element;

import net.minecraft.client.MinecraftGame;
import prospector.velvetinfodisplay.gui.HudVelvet;

public abstract class InfoElement {
	public abstract int getWidth();

	public abstract int getHeight();

	public abstract void pre(MinecraftGame game);

	public abstract void draw(int x, int y, HudVelvet hud);

	public boolean isVisible() {
		return true;
	}

	public void onRemove() {

	}
}
