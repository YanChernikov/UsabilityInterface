package com.thecherno.usability;

import com.tracnode.engine.graphics.Color;
import com.tracnode.engine.graphics.object.Rectangle;
import com.tracnode.engine.menu.Menu;

public class EnterDetails {

	private Menu menu = new Menu();

	public EnterDetails() {
		menu.setBackground(Color.WHITE);
		menu.addObject(new Rectangle(140, 30, Color.BLACK));
	}

	public Menu getMenu() {
		return menu;
	}

}
