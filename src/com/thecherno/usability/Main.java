package com.thecherno.usability;

import com.tracnode.engine.Display;
import com.tracnode.engine.Tracnode;
import com.tracnode.engine.action.Action;
import com.tracnode.engine.graphics.text.Font;
import com.tracnode.engine.graphics.text.Text;
import com.tracnode.engine.image.Image;
import com.tracnode.engine.menu.Menu;
import com.tracnode.engine.menu.MenuItem;
import com.tracnode.engine.sprite.Sprite;
import com.tracnode.engine.state.State;

public class Main extends Tracnode {

	public static Menu display = new Menu();
	private Start start;
	private Menu enter = new Menu();

	public void init() {
		createDisplay("ProDuct Alpha Interface", 1024, 768);
		setInput(KEYBOARD, MOUSE);

		start = new Start();
		display = start.getMenu();
		start();
	}

	public void render() {
		Display.setState(State.MENU);
		render(display);
		show();
	}

	public void update() {
		update(display);
	}

	public static void main(String[] args) {
		new Main().init();
	}

}
