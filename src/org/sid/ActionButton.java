package org.sid;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionButton implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Vous avez cliqu�!");
	}

}
