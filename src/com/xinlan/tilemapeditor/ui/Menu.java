package com.xinlan.tilemapeditor.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        createNewMap();
    }

    private void createNewMap(){
        this.mNewFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doCreateNewMap();
            }
        });
    }

    private void doCreateNewMap(){
        //显示一个对话框
        CreateNewMapDialog newMapDialog = new CreateNewMapDialog(mContext);
        newMapDialog.setVisible(true);
    }
}//end class
