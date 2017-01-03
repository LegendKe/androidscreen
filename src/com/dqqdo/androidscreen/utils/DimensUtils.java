package com.dqqdo.androidscreen.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 
 * @ClassName: DimensUtils 
 *
 * @Description: Dimens 元素换算的工具类
 *
 * @author Tyrion
 *
 * @date 2015年6月17日 下午12:18:47 
 *
 */
public class DimensUtils {

	// 800*480
	private static int value_stand = 720;

	public static void outContent(File desFile, float scale) throws IOException {

		BufferedWriter bw = null;
		FileOutputStream fos;

		fos = new FileOutputStream(desFile);
		bw = new BufferedWriter(new OutputStreamWriter(fos));

		String hear = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
		bw.write(hear + "\n");
		String tag = "<resources>";
		bw.write(tag + "\n");

		java.text.DecimalFormat df = new java.text.DecimalFormat("#.##");
		for (int i = 1; i < 600; i++) {
			float pxValue = scale * i;

			String strPXValue = df.format(pxValue);

			String contentLine = "<dimen name=\"dimen_" + i + "_dip\">"
					+ strPXValue + "px</dimen>" + "\n";
			bw.write(contentLine);
		}

		String end = "</resources>" + "\n";
		bw.write(end);

		bw.close();
		fos.close();
	}

//	public static void outContent(File desFile, float scale,
//			boolean, float spScale) throws IOException {
//
//		BufferedWriter bw = null;
//		FileOutputStream fos;
//
//		fos = new FileOutputStream(desFile);
//		bw = new BufferedWriter(new OutputStreamWriter(fos));
//
//		String hear = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
//		bw.write(hear + "\n");
//		String tag = "<resources>";
//		bw.write(tag + "\n");
//
//		java.text.DecimalFormat df = new java.text.DecimalFormat("#.##");
//		// 特别输出0.5的像素单位
//		double doublePXValue = scale * 0.5;
//		String halfStrPXValue = df.format(doublePXValue);
//		String contentLine = "<dimen name=\"dimen_" + 0.5 + "_dip\">"
//				+ halfStrPXValue + "px</dimen>" + "\n";
//		bw.write(contentLine);
//		// 0.5 的像素单位输出完毕
//
//
//		for (int i = -200; i < 600; i++) {
//			float pxValue = scale * i;
//
//			String strPXValue = df.format(pxValue);
//			String strIValue = i + "";
//			if(i < 0){
//				strIValue = "minus" + Math.abs(i);
//			}
//
//			contentLine = "<dimen name=\"dimen_" + strIValue + "_dip\">"
//					+ strPXValue + "px</dimen>" + "\n";
//
//			bw.write(contentLine);
//
//		}
//
//
//
//		String end = "</resources>" + "\n";
//		bw.write(end);
//
//		bw.close();
//		fos.close();
//	}

}
