package com.xinlan.tilemapeditor;

import javax.swing.*;

public class Menu {

    private JFrame mFrame;
    private App mContext;

    protected JMenuBar mMenuBar;

    protected JMenu mFileMenu;
    protected JMenuItem mNewFile;
    protected JMenuItem mOpenMapFile;
    protected JMenuItem mLoadImageAsTile;


    protected JMenu mAboutMenu;
    protected JMenuItem mAboutItem;


    public Menu(App context){
        this.mContext = context;

        mFrame = mContext.mMainFrame;
        initMenu();
    }

    private void initMenu(){
        mMenuBar = new JMenuBar();
        mFrame.setJMenuBar(mMenuBar);


        //文件
        mFileMenu = new JMenu("文件");
        mNewFile = new JMenuItem("新建地图文件");
        mFileMenu.add(mNewFile);
        mOpenMapFile = new JMenuItem("打开地图文件");
        mFileMenu.add(mOpenMapFile);
        mLoadImageAsTile = new JMenuItem("导入图片");
        mLoadImageAsTile.setEnabled(false);
        mFileMenu.add(mLoadImageAsTile);

        mMenuBar.add(mFileMenu);


        //关于
        mAboutMenu = new JMenu("关于");
        mAboutItem = new JMenuItem("关于此软件");
        mAboutMenu.add(mAboutItem);
        mMenuBar.add(mAboutMenu);
    }
}//end class
