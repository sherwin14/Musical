package com.webteq.musical;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    /**
     * The number of pages (wizard steps) to show in this demo.
     */
    private static final int NUM_PAGES = 5;

    /**
     * The pager widget, which handles animation and allows swiping horizontally to access previous
     * and next wizard steps.
     */
    private ViewPager mPager;

    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    private PagerAdapter mPagerAdapter;

    /**
     * Declaring the buttons.
     * Buttons below the musical icons, this will be the page identifier.
     *
     */
    private Button pageOne,pageTwo,pageThree,pageFour,pageFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content view to layou_screen_slide, Located at res/layout/
        setContentView(R.layout.layout_screen_slide);

        /**
         * Instantiate the buttons
         * R.id.btnPageOne,R.id.btnPageTwo,R.id.btnPageThree,R.id.btnPageFour,R.id.btnPageFive
         * was declared to a button in layout_Screen_slide.xml
         *
         * Event of this button is in Onclick voic function below.
         */
        pageOne = (Button) findViewById(R.id.btnPageOne);
        pageTwo = (Button) findViewById(R.id.btnPageTwo);
        pageThree = (Button) findViewById(R.id.btnPageThree);
        pageFour = (Button) findViewById(R.id.btnPageFour);
        pageFive = (Button) findViewById(R.id.btnPageFive);

        // When the button is click it calls the Implemented Interface OnClickLister.
        // You can modify the code inside the Override function below.   OnClick
        pageOne.setOnClickListener(this);
        pageTwo.setOnClickListener(this);
        pageThree.setOnClickListener(this);
        pageFour.setOnClickListener(this);
        pageFive.setOnClickListener(this);

        // Instantiate a ViewPager and a PagerAdapter.
        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
        mPager.setCurrentItem(0);
        mPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                switch (position){
                    case 0:
                        pageOne.setTextColor(ResourcesCompat.getColor(getResources(),R.color.colorPrimaryDark,null));
                        pageTwo.setTextColor(Color.BLACK);
                        pageThree.setTextColor(Color.BLACK);
                        pageFour.setTextColor(Color.BLACK);
                        pageFive.setTextColor(Color.BLACK);

                        break;
                    case 1:
                        pageTwo.setTextColor(ResourcesCompat.getColor(getResources(),R.color.colorPrimaryDark,null));
                        pageOne.setTextColor(Color.BLACK);
                        pageThree.setTextColor(Color.BLACK);
                        pageFour.setTextColor(Color.BLACK);
                        pageFive.setTextColor(Color.BLACK);

                        break;
                    case 2:
                        pageThree.setTextColor(ResourcesCompat.getColor(getResources(),R.color.colorPrimaryDark,null));
                        pageOne.setTextColor(Color.BLACK);
                        pageTwo.setTextColor(Color.BLACK);
                        pageFour.setTextColor(Color.BLACK);
                        pageFive.setTextColor(Color.BLACK);

                        break;
                    case 3:
                        pageFour.setTextColor(ResourcesCompat.getColor(getResources(),R.color.colorPrimaryDark,null));
                        pageOne.setTextColor(Color.BLACK);
                        pageTwo.setTextColor(Color.BLACK);
                        pageThree.setTextColor(Color.BLACK);
                        pageFive.setTextColor(Color.BLACK);
                        break;
                    case 4:
                        pageFive.setTextColor(ResourcesCompat.getColor(getResources(),R.color.colorPrimaryDark,null));
                        pageOne.setTextColor(Color.BLACK);
                        pageTwo.setTextColor(Color.BLACK);
                        pageThree.setTextColor(Color.BLACK);
                        pageFour.setTextColor(Color.BLACK);
                        break;
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btnPageOne:
                mPager.setCurrentItem(0);  //Change the page to PAGE 1
                pageOne.setTextColor(ResourcesCompat.getColor(getResources(),R.color.colorPrimaryDark,null));
                pageTwo.setTextColor(Color.BLACK);
                pageThree.setTextColor(Color.BLACK);
                pageFour.setTextColor(Color.BLACK);
                pageFive.setTextColor(Color.BLACK);

                break;
            case R.id.btnPageTwo:
                mPager.setCurrentItem(1); //Change the page to PAGE 2
                pageTwo.setTextColor(ResourcesCompat.getColor(getResources(),R.color.colorPrimaryDark,null));
                pageOne.setTextColor(Color.BLACK);
                pageThree.setTextColor(Color.BLACK);
                pageFour.setTextColor(Color.BLACK);
                pageFive.setTextColor(Color.BLACK);

                break;
            case R.id.btnPageThree:
                mPager.setCurrentItem(2); //Change the page to PAGE 3
                pageThree.setTextColor(ResourcesCompat.getColor(getResources(),R.color.colorPrimaryDark,null));
                pageOne.setTextColor(Color.BLACK);
                pageTwo.setTextColor(Color.BLACK);
                pageFour.setTextColor(Color.BLACK);
                pageFive.setTextColor(Color.BLACK);

                break;
            case R.id.btnPageFour:
                mPager.setCurrentItem(3); //Change the page to PAGE 4
                pageFour.setTextColor(ResourcesCompat.getColor(getResources(),R.color.colorPrimaryDark,null));
                pageOne.setTextColor(Color.BLACK);
                pageTwo.setTextColor(Color.BLACK);
                pageThree.setTextColor(Color.BLACK);
                pageFive.setTextColor(Color.BLACK);

                break;
            case R.id.btnPageFive:
                mPager.setCurrentItem(4); //Change the page to PAGE 5
                pageFive.setTextColor(ResourcesCompat.getColor(getResources(),R.color.colorPrimaryDark,null));
                pageOne.setTextColor(Color.BLACK);
                pageTwo.setTextColor(Color.BLACK);
                pageThree.setTextColor(Color.BLACK);
                pageFour.setTextColor(Color.BLACK);

                break;
        }
    }

    @Override
    public void onBackPressed() {
        if (mPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }
    }

    /**
     * A simple pager adapter that represents 5 ScreenSlidePageFragmentOne objects, in
     * sequence.
     */
    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new ScreenSlidePageFragmentOne();
                case 1:
                    return new ScreenSlidePageFragmentTwo();
                case 2:
                    return new ScreenSlidePageFragmentThree();
                case 3:
                    return new ScreenSlidePageFragmentFour();
                case 4:
                    return new ScreenSlidePageFragmentFive();
            }

            return null;
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}
