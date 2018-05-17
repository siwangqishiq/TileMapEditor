package com.xinlan.tilemapeditor;

import javax.swing.*;

public class App {
    public static final String APP_NAME = "Map Editor";

    private static final int SCREEN_WIDTH = 1200;
    private static final int SCREEN_HEIGHT = 800;
    protected JFrame mMainFrame;

    protected Menu mMenu;

    public void execute(){
        init();
    }

    private void init(){
        mMainFrame = new JFrame();
        mMainFrame.setTitle(APP_NAME);
        mMainFrame.setSize(SCREEN_WIDTH , SCREEN_HEIGHT);
        mMainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        mMainFrame.setLocation(100,0);

        mMenu = new Menu(this);
        mMainFrame.setVisible(true);
    }
}//end class
