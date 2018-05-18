package com.xinlan.tilemapeditor;

import javax.swing.*;
import java.awt.*;

public class App {
    public static final String APP_NAME = "Map Editor";

    public static final int SCREEN_WIDTH = 1200;
    public static final int SCREEN_HEIGHT = 800;
    protected JFrame mMainFrame;
    protected JPanel mMainContainer;

    protected Menu mMenu;
    protected CubePanel mCubePanel;

    public void execute(){
        init();
    }

    private void init(){
        JFrame.setDefaultLookAndFeelDecorated(true);

        mMainFrame = new JFrame();
        mMainFrame.setTitle(APP_NAME);
        mMainFrame.setSize(SCREEN_WIDTH , SCREEN_HEIGHT);
        mMainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        mMainContainer = new JPanel();
        mMainContainer.setLayout(new BorderLayout());

        mMainFrame.setLayout(new BorderLayout());

        mMainFrame.setLocation(100,0);

        mMenu = new Menu(this);
        mCubePanel = new CubePanel(this);

        mMainFrame.setVisible(true);
    }
}//end class
