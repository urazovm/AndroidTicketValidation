package org.cmov.ticketclient;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

	private Activity context = null;

	public SectionsPagerAdapter(FragmentManager fm, Activity context) {
		super(fm);
		this.context = context;
	}

	@Override
	public Fragment getItem(int position) {

		// TODO Set fragment arguments.
		Fragment fragment = null;
		Bundle bundle = null;
		switch (position) {
		case 0:
			fragment = new TicketListFragment();
			bundle = new Bundle();
			fragment.setArguments(bundle);
			return fragment;
		case 1:
			fragment = new TicketBuyFragment();
			bundle = new Bundle();
			fragment.setArguments(bundle);
			return fragment;
		default:
			return null;
		}
	}

	@Override
	public int getCount() {
		return 2;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		switch (position) {
		case 0:
			return context.getString(R.string.title_list_tickets);
		case 1:
			return context.getString(R.string.title_buy_tickets);
		}
		return null;
	}
}