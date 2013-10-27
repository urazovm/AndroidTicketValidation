package org.cmov.ticketclient;

import java.io.Serializable;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter implements Serializable {

	private static final long serialVersionUID = 1L;
	private Activity context = null;
	private Fragment mUnusedTicketsFragment = null;

	public Fragment getmUnusedTicketsFragment() {
		return mUnusedTicketsFragment;
	}
	
	public void setContext(Activity context) {
		this.context = context;
	}

	public SectionsPagerAdapter(FragmentManager fm, Activity context) {
		super(fm);
		this.context = context;
		mUnusedTicketsFragment = new TicketUnusedFragment();
	}

	@Override
	public Fragment getItem(int position) {

		// TODO Set fragment arguments.
		Fragment fragment = null;
		Bundle bundle = null;
		switch (position) {
		case 0:
			bundle = new Bundle();
			mUnusedTicketsFragment.setArguments(bundle);
			return mUnusedTicketsFragment;
		case 1:
			fragment = new TicketUsedFragment();
			bundle = new Bundle();
			fragment.setArguments(bundle);
			return fragment;
		case 2:
			fragment = new TicketPresentFragment();
			bundle = new Bundle();
			fragment.setArguments(bundle);
			return fragment;
		case 3:
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
		return 4;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		switch (position) {
		case 0:
			return context.getString(R.string.title_unused_tickets);
		case 1:
			return context.getString(R.string.title_used_tickets);
		case 2:
			return context.getString(R.string.title_present_ticket);
		case 3:
			return context.getString(R.string.title_buy_tickets);
		}
		return null;
	}
}