/**   
 * Copyright © 2016 诸葛天下. All rights reserved.
 * 
 * @Title ProcessThread.java 
 * @Prject plugTool
 * @Package com.plug.tool 
 * @Description TODO
 * @author qinfei   
 * @date 2016年11月3日 下午5:41:18 
 * @version V2.0   
 */
package com.qf.plug.tool;

import javax.swing.JProgressBar;

/** 
 * @ClassName: ProcessThread 
 * @Description: TODO
 * @author: qinfei
 * @date: 2016年11月3日 下午5:41:18 
 */
public class ProcessThread extends Thread{

	private ProgressDialog dlgMain;
	
	public ProcessThread(ProgressDialog dlgMain) {
		this.dlgMain=dlgMain;
	}
	
	@Override
	public void run() {
		int max = 20;
        dlgMain.setVisible(true);
        JProgressBar progressBar = dlgMain.getProgressBar();
        for (int i = 0; i < max; i++) {
            progressBar.setValue(i + 1);
            try {
                Thread.sleep(1000);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        dlgMain.dispose();
	}
}
