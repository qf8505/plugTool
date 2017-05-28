package com.qf.plug.tool;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
 
import javax.swing.JDialog;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
 
public class ProgressDialog extends JDialog implements MouseListener,
        MouseMotionListener {
    private static final long serialVersionUID = 1L;
 
    private JProgressBar progressBar;
 
    private int height = 20;//进度条高度
    private int width = 260;//进度条宽度
 
    private int mouseX;//鼠标X坐标
    private int mouseY;//鼠标Y坐标
 
    private int currentX;//进度条当前X坐标
    private int currentY;//进度条当前Y坐标
 
    private boolean isMove = false;
 
    public ProgressDialog(int number) {
        initialize();
        initProgressBar(number);
        this.add(progressBar);
    }
 
    /**
     * 初始化窗体
     */
    private void initialize() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();//屏幕尺寸
        Insets screenInsets = Toolkit.getDefaultToolkit().getScreenInsets(
                this.getGraphicsConfiguration());
        currentX = (int) (dimension.getWidth() - width - 3);
        currentY = (int) (dimension.getHeight() - screenInsets.bottom - height - 3);
        this.setAlwaysOnTop(true);
        this.setSize(width, height);
        this.setLocation(currentX, currentY);
        this.setUndecorated(true);
    }
     
    /**
     * @param number进度条最大值
     * 初始化进度条
     */
    private void initProgressBar(int number) {
        progressBar = new JProgressBar(SwingConstants.HORIZONTAL);
        progressBar.setMinimum(0);
        progressBar.setMaximum(number);
        progressBar.setStringPainted(true);//显示进度条数值
        progressBar.addMouseMotionListener(this);
        progressBar.addMouseListener(this);
    }
 
    public JProgressBar getProgressBar() {
        return progressBar;
    }
 
    @Override
    public void mouseDragged(MouseEvent e) {
        if (isMove) {
            //鼠标拖动处理
            int dx = e.getXOnScreen() - mouseX;
            int dy = e.getYOnScreen() - mouseY;
            this.setLocation(currentX + dx, currentY + dy);
        }
    }
 
    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
 
    }
 
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
 
    }
 
    @Override
    public void mousePressed(MouseEvent e) {
        isMove = true;
        //记住拖动起始的坐标
        mouseX = e.getXOnScreen();
        mouseY = e.getYOnScreen();
    }
 
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
 
    }
 
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
 
    }
 
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
 
    }
}