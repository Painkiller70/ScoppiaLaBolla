package esercizio.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class RitentaClickHandler implements ClickHandler {
	ProvaGWT p = new ProvaGWT();

	@Override
	public void onClick(ClickEvent event) {
		// TODO Auto-generated method stub
		p.onModuleLoad();		
	}
	

}
