package com.thecherno.usability;

import com.tracnode.engine.action.Action;
import com.tracnode.engine.graphics.text.Font;
import com.tracnode.engine.graphics.text.Text;
import com.tracnode.engine.image.Image;
import com.tracnode.engine.menu.Menu;
import com.tracnode.engine.menu.MenuItem;
import com.tracnode.engine.sprite.Sprite;

public class Start {

	private Menu start = new Menu();
	private Sprite biometric = new Sprite(new Image("/images/biometric.png"), 400, 350);
	private Text logo = new Text("ProDuct", 180, 120, new Font("Verdana", 180, 0xAAAAAA));
	private MenuItem manual = new MenuItem(new Text("More Options", 400, 650, new Font("Verdana", 40, 0)));

	public Start() {
		start.setBackground(0xffffff);
		Main.display = start;
		start.addObject(biometric);
		start.addObject(logo);
		manual.setAction(new Action() {
			public void action() {
				Main.display = new EnterDetails().getMenu();
			}
		});
		start.createItem(manual);
	}

	public Menu getMenu() {
		return start;
	}

}