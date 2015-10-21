package cn.iwgang.parallaxguidedemo;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.ArrayList;

public class ViewPaperAdapter extends PagerAdapter {
    private ArrayList<View> views;

    public ViewPaperAdapter(ArrayList<View> views) {
        this.views = views;
    }

    @Override
    public int getCount() {
        if (views != null) {
            return views.size();
        } else
            return 0;
    }

    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        return (arg0 == arg1);
    }

    @Override
    public void destroyItem(View container, int position, Object object) {
        ((ViewPager) container).removeView(views.get(position));
    }

    @Override
    public Object instantiateItem(View container, int position) {
        ((ViewPager) container).addView(views.get(position), 0);
        return views.get(position);
    }

}
