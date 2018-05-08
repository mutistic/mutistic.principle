package com.mutistic.common.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileUtil
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fileInputStream = new FileInputStream("F:/工作/YMDD/YMDD/2 SVN/omtk/文档管理/yimidida.rtf"); //("f:"+ File.separator +"IBM e-Mentor Program Kickoff Night 1105.pdf");
		FileOutputStream fileOutputStream = new FileOutputStream("F:/工作/YMDD/YMDD/2 SVN/omtk/文档管理/test.rtf"); //("f:" + File.separator + "test.txt");
		FileChannel inChannel = fileInputStream.getChannel();
		FileChannel outChannel= fileOutputStream.getChannel();
		ByteBuffer byteBuffer = ByteBuffer.allocate(1024); //非直接缓冲区 
		//Direct Buffer的效率会更高。
		//ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1024);   // 直接字节缓冲区
		long start = System.currentTimeMillis();
		while(true)
		{
			int eof = inChannel.read(byteBuffer);
			if(eof == -1 ) break;
			byteBuffer.flip();
			outChannel.write(byteBuffer);
			byteBuffer.clear();
		}
		System.out.println("spending : " + (System.currentTimeMillis()-start));
		inChannel.close();
		outChannel.close();
	}
}