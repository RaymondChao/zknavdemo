package org.zkoss.zknavdemo;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zkmax.zul.Navbar;
import org.zkoss.zkmax.zul.Navitem;
import org.zkoss.zul.Include;

public class NavController extends SelectorComposer<Component> {

	private static final long serialVersionUID = 1L;

	@Wire
	private Navbar sidebar;
	
	@Wire
	private Include mainInclude;
	
	@Listen("onSelect = #sidebar")
	public void doSelect () {
		Navitem item = sidebar.getSelectedItem();
		String label = item.getLabel(),
				icon = item.getIconSclass();
		if ("Inbox".equals(label)) {
			mainInclude.setSrc("inbox.zul");
		} else if ("Create New Task".equals(label)) {
			mainInclude.setSrc("create.zul");
		} else if ("Rescue the Baby".equals(label)) {
			mainInclude.setSrc("baby.zul");
		} else if ("Play Darts".equals(label)) {
			mainInclude.setSrc("dart.zul");
		} else if ("Plant Flowers".equals(label)) {
			mainInclude.setSrc("flower.zul");
		} else if ("Wash the Car".equals(label)) {
			mainInclude.setSrc("car.zul");
		} else if ("Buy Aspirin".equals(label)) {
			mainInclude.setSrc("head.zul");
		} else if ("Hide and Seek".equals(label)) {
			mainInclude.setSrc("cat.zul");
		} else if ("Say Hi to the Soldier".equals(label)) {
			mainInclude.setSrc("hi.zul");
		} else {
			mainInclude.setSrc("");
			mainInclude.setSrc("none.zul");
		}
	}
}
