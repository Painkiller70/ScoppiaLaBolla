package esercizio.client;

import com.google.web.bindery.event.shared.Event;

public class BollaBeccataEvent extends Event<BollaBeccataEvent.Handler> {
	
	Bubble bubble;
	
	public BollaBeccataEvent(Bubble bubble){
		this.bubble=bubble;
	}
	
	public interface Handler{
		public void onBubbleBeccata(BollaBeccataEvent be);
	}
	
	public static final Type<BollaBeccataEvent.Handler> TYPE =new Type<>();
	@Override
	public com.google.web.bindery.event.shared.Event.Type<BollaBeccataEvent.Handler> getAssociatedType() {
		// TODO Auto-generated method stub
		return TYPE;
	}

	@Override
	protected void dispatch(BollaBeccataEvent.Handler handler) {
		// TODO Auto-generated method stub
		handler.onBubbleBeccata(this);
	}

}
