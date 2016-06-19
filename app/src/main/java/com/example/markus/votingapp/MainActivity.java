package com.example.markus.votingapp;

import android.annotation.TargetApi;
import android.app.FragmentManager;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.example.markus.votingapp.wrapper.Einstellungen;
import com.example.markus.votingapp.wrapper.HintergrundEinstellung;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Login_Fragment f1;
    Register_Fragment f2;
    Restaurants_Fragment f3;
    Groups_Fragment f4;
    static Voting_Fragment f5;
    static Statistik_Fragment f6;
    Einstellungen f7;
    static NavigationView navigationView = null;
    static Toolbar toolbar = null;
    static Window window;
    ActionBarDrawerToggle toggle;
    static int farbe = 0xFFA7F166;
    static MainActivity activity;
    static String sum="";
    static String face="<font face=\"normal\" ";
    static String col="  color='#FFFFFFFF'>";

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    public static class Utility {
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
        public static void farbeChange(int color) {
            toolbar.setBackground(new ColorDrawable(color));
            toolbar.setDrawingCacheBackgroundColor(color);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(color-2500);
            f5.farbeAendern(color);
//          navigationView.setBackgroundColor(color);
            f6.farbeAendern(color);
        }
        public static void updateTitle(int id) {
            switch (id) {
                case (0):
                    face = "<font face=\"normal\"";
                    break;
                case (1):
                    face = "<font face=\"cursive\"";
                    break;
                case (2):
                    face = "<font face=\"serif\"";
                    break;
                case (3):
                    face = "<font face=\"monospace\"";
                    break;
                case (4):
                    col = "  color='#FFFFFF'>";
                    break;
                case (5):
                    col = "  color='#ff0000'>";
                    break;
                case (6):
                    col = " color='#ff9500'>";
                    break;
                case (7):
                    col = " color='#08ff00'>";
                    break;
                case (8):
                    col = " color='#0022ff'>";
                    break;
                case (9):
                    col = " color='#9500ff'>";
                    break;

                case (11):
                    face = "<font face=\"courier\"";
                    break;

                default:
                    face = "<font face=\"normal\" ";
                    col = "  color='#FFFFFFFF'>";
            }
            sum = face + col;
            activity.getSupportActionBar().setTitle(Html.fromHtml(sum + "LunchVote </font>"));
            // Update the action bar title with the TypefaceSpan instance
            // ActionBar actionBar = getActionBar();
            // actionBar.setTitle(s);
            // tv.setTextColor(Color.RED);
            // tv.setBackgroundColor(Color.BLUE);
            //    activity.setTheme("transaktionbtn");
            // activity.getSupportActionBar().setTitle("KLaus");
            //  activity.getSupportActionBar().setCustomView(tv);
             }

        }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        window= this.getWindow();
        activity=this;
        // nav = R.id.nav_view;
        f1 = new Login_Fragment();
        f2 = new Register_Fragment();
        f3 = new Restaurants_Fragment();
        f4 = new Groups_Fragment();
        f5 = new Voting_Fragment();
        f6 = new Statistik_Fragment();
        f7 = new Einstellungen();
        FragmentTransaction fragmentTransaction =
                getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, f1);
        fragmentTransaction.commit();
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        window = this.getWindow();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu ) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Pass the event to ActionBarDrawerToggle, if it returns
        // true, then it has handled the app icon touch event
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            startActivity(new Intent(this, Einstellungen.class));
            return true;
        }
        // Handle your other action bar items...

        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        FragmentTransaction fragmentTransaction =
                getSupportFragmentManager().beginTransaction();


        switch (id) {
            case R.id.nav_login:
                fragmentTransaction.replace(R.id.fragment_container, f1);
                break;
            case R.id.nav_registrierung:
                fragmentTransaction.replace(R.id.fragment_container, f2);
                break;
            case R.id.nav_restaurants:
                fragmentTransaction.replace(R.id.fragment_container, f3);
                break;
            case R.id.nav_gruppe:
                fragmentTransaction.replace(R.id.fragment_container, f4);
                break;
            case R.id.nav_voting:
                fragmentTransaction.replace(R.id.fragment_container, f5);
                break;
            case R.id.nav_statistics:
                fragmentTransaction.replace(R.id.fragment_container, f6);
                break;
            case R.id.settings:
                fragmentTransaction.replace(R.id.fragment_container, f7);
        }

        fragmentTransaction.commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.markus.votingapp/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.markus.votingapp/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }


}
