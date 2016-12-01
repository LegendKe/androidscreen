package com.dqqdo.androidscreen.ui;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class TopLayout extends JPanel{

	private String strSelect = "选择效果图尺寸:";
	
	
	private ButtonGroup group;
	private JRadioButton jrb1280x720;
	private JRadioButton jrb1920x1280;
	
	
	private JCheckBox jcbSP;
	/**
	 * 构造容器
	 */
	TopLayout(){
		
		
		JLabel jlShow = new JLabel(strSelect);
		group = new ButtonGroup();
		
		this.add( jlShow);
		jrb1280x720 = new JRadioButton("1280x720");
		jrb1280x720.setSelected(true);
		group.add(jrb1280x720);
		this.add( jrb1280x720);
		jrb1920x1280 = new JRadioButton("1920x1280");
		group.add(jrb1920x1280);
		this.add( jrb1920x1280);
		
		
		
		// 添加可选，生成sp
		jcbSP = new JCheckBox("同时生成sp单位");
		this.add(jcbSP);
		
		
	}
	
	
	public boolean isSPSelected(){
		
		
		return jcbSP.isSelected();
	}
	
	
	public String getSrcSize(){
		
		
		if(jrb1280x720.isSelected()){
			return "720";
		}else if(jrb1920x1280.isSelected()){
			return "1280";
		}
		
//		String result = group.getSelection().getSelectedObjects(1) + "";
//		System.out.println("result  ====" + result);
//		return result;
		
		return null;
	}
	
	
	
}
