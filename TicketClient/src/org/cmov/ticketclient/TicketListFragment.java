package org.cmov.ticketclient;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TicketListFragment extends ListFragment {
	
	public TicketListFragment() {
		// TODO Setup fragment.
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Setup layout.
		View root = inflater.inflate(R.layout.list_ticket, container, false);
		return root;
	}

}
