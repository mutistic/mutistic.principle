package com.mutistic.common.utils;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStream;
//import java.text.NumberFormat;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.poi.hssf.usermodel.HSSFDateUtil;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import com.sun.media.sound.InvalidFormatException;
//import com.sun.rowset.internal.Row;
//
//import javafx.scene.control.Cell;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
///**
// * <p>功能描述：Excel工具类</p> 
// * <p>依赖org.apache.poi </p>
// * YC.Yin-2016-11-9 上午10:04:34 
// * @version v1.0
// */
public class ExcelUtil {
//	
//    private static Logger log = LoggerFactory.getLogger(ExcelUtil.class);
//	
//	
//	/**
//	 * @desc:判断是否是Excel文件
//	 * @author Clyde
//	 * @date:2014-7-16
//	 * @param fileName
//	 * @return
//	 */
//	public static boolean isExcelFile(String fileName) {
//		boolean isE2007 = false; // 判断是否是excel2007格式
//		boolean isE2003 = false;
//		if (fileName.endsWith("xlsx")) {
//			isE2007 = true;
//		} else if (fileName.endsWith("xls")) {
//			isE2003 = true;
//		}
//		return isE2003 || isE2007;
//	}
//
//	/**
//	 * @desc:获取Excel的格式
//	 * @author Clyde
//	 * @date:2014-7-16
//	 * @param fileName
//	 * @return 0为2003,1为2007，-1不是Excel
//	 */
//	public static Integer excelType(String fileName) {
//		boolean isE2007 = false; // 判断是否是excel2007格式
//		boolean isE2003 = false;
//		if (fileName.endsWith("xlsx")) {
//			isE2007 = true;
//		} else if (fileName.endsWith("xls")) {
//			isE2003 = true;
//		}
//		if (isE2003) {
//			return 0;
//		} else if (isE2007) {
//			return 1;
//		} else {
//			return -1;
//		}
//	}
//
//	/**
//	 * @desc:获取workbook
//	 * @author Clyde
//	 * @date:2014-7-16
//	 * @param fileName
//	 * @return
//	 */
//	public static Workbook getCurrentWorkbook(String fileName,InputStream input) {
//		boolean isE2007 = false; // 判断是否是excel2007格式
//		boolean isE2003 = false;
//		if (fileName.endsWith("xlsx")) {
//			isE2007 = true;
//		} else if (fileName.endsWith("xls")) {
//			isE2003 = true;
//		}
//		Workbook wb = null;
//		try {
//			// 根据文件格式(2003或者2007)来初始化
//			if (isE2007) {
//				wb = new XSSFWorkbook(input);
//			} else if (isE2003) {
//				wb = new HSSFWorkbook(input);
//			}
//		} catch (FileNotFoundException e) {
//			log.error("[ERROR:]", e);
//		} catch (IOException e) {
//			log.error("[ERROR:]", e);
//		} catch (Exception e) {
//			log.error("[ERROR:]", e);
//		}
//		return wb;
//	}
//	
//	/**
//	 * @desc:获取workbook
//	 * @author Clyde
//	 * @date:2014-8-4
//	 * @param input
//	 * @return
//	 */
//	public static Workbook getCurrentWorkbook(InputStream input){
//		Workbook wb = null;
//		try {
//			wb=WorkbookFactory.create(input);
//		} catch (Exception e) {
//			log.error("[ERROR:]", e);
//		}
//		return wb;
//	}
//
//	/**
//	 * @desc:获取某页的总条数
//	 * @author Clyde
//	 * @date:2014-7-16
//	 * @param wb
//	 * @param numSheet
//	 * @return
//	 */
//	public static Integer getAllRows(Workbook wb, Integer numSheet) {
//		Sheet sheet = wb.getSheetAt(numSheet);// 根据传的参数获取工作表
//		Integer count=sheet.getPhysicalNumberOfRows()-1;
//		if (count < 0) {
//			count = 0;
//		}
//		return count;
//	}
//	
//	/**
//	 * @desc:获取所有记录数
//	 * @author Clyde
//	 * @date:2014-7-17
//	 * @param wb
//	 * @return
//	 */
//	public static Integer getTotalRows(Workbook wb){
//		Integer count=0;
//		for (int numSheet = 0; numSheet < wb.getNumberOfSheets(); numSheet++) {
//			count+=getAllRows(wb, numSheet);
//		}
//		return count;
//	}
//
//	/**
//	 * @desc:解析Excel
//	 * @author Clyde
//	 * @date:2014-7-16
//	 * @param wb
//	 * @param numSheet
//	 * @param cellCount
//	 * @return
//	 */
//	public static List<String[]> readExcel(Workbook wb, Integer numSheet, int cellCount, boolean... _isFromat) {
//		List<String[]> list = new ArrayList<String[]>();
//		if (wb!=null) {
//			// 循环工作表Sheet
//			Sheet sheet = wb.getSheetAt(numSheet);// 根据传的参数获取工作表
//			// 循环行Row
//			for (int rowNum = 0; rowNum <= sheet.getLastRowNum(); rowNum++) {
//				Row row = sheet.getRow(rowNum);
//				if (row == null) {
//					continue;
//				}
//				String[] str = new String[cellCount];
//				if (row.getRowNum() != 0) {
//					// 循环列Cell
//					for (int cellNum = 0; cellNum < cellCount; cellNum++) {
//						Cell cell = row.getCell(cellNum);
//						if (cell == null) {
//							continue;
//						}
//						if(_isFromat == null || _isFromat.length == 0 || !_isFromat[0]){
//							str[cellNum] = getCellValue(cell);
//						} else {
//							str[cellNum] = getCellValue(cell, true);
//						}
//					
//					}
//					list.add(str);
//				}
//			}
//		}
//		return list;
//	}
//	
//	/**
//	 * <p>方法描述：解析Excel-包括第一行</p>
//	 * Pierce.Yin-2016-2-20 上午10:18:52 
//	 * @param wb
//	 * @param numSheet
//	 * @param cellCount
//	 * @return
//	 */
//	public static List<String[]> readExcelAll(Workbook wb, Integer numSheet, int cellCount,
//			boolean isFormat) {
//		List<String[]> list = new ArrayList<String[]>();
//		if (wb!=null) {
//			// 循环工作表Sheet
//			Sheet sheet = wb.getSheetAt(numSheet);// 根据传的参数获取工作表
//			// 循环行Row
//			for (int rowNum = 0; rowNum <= sheet.getLastRowNum(); rowNum++) {
//				Row row = sheet.getRow(rowNum);
//				if (row == null) {
//					continue;
//				}
//				String[] str = new String[cellCount];
//				// 循环列Cell
//				for (int cellNum = 0; cellNum < cellCount; cellNum++) {
//					Cell cell = row.getCell(cellNum);
//					if (cell == null) {
//						continue;
//					}
//					str[cellNum] = getCellValue(cell,isFormat);
//				}
//				list.add(str);
//			}
//		}
//		return list;
//	}
//	
//	/**
//	 * <p>方法描述：获取Excel某页某行的列数</p>
//	 * Pierce.Yin-2016-2-19 上午9:46:39 
//	 * @param wb
//	 * @param sheetNum
//	 * @param rowNum
//	 * @return
//	 */
//	public static int getColumnNumByRow(Workbook wb,Integer sheetNum, int rowNum){
//		int column = 0;
//		if(wb != null && rowNum >= 0){
//			Sheet sheet = wb.getSheetAt((sheetNum == null || sheetNum < 0) ? 0 : sheetNum);
//			Row row = sheet.getRow(rowNum);
//			column = row.getPhysicalNumberOfCells();
//		}
//		return column;
//	}
//	
//	/**
//	 * @desc:解析Excel(根据传入的数据类型)
//	 * @author Clyde
//	 * @date:2014-11-7
//	 * @param wb
//	 * @param numSheet
//	 * @param clazzs
//	 * @return
//	 */
//	public static List<Object[]> readExcel(Workbook wb, Integer numSheet, List<Object> clazzs) {
//		List<Object[]> list = new ArrayList<Object[]>();
//		if (wb!=null) {
//			// 循环工作表Sheet
//			Sheet sheet = wb.getSheetAt(numSheet);// 根据传的参数获取工作表
//			// 循环行Row
//			for (int rowNum = 0; rowNum <= sheet.getLastRowNum(); rowNum++) {
//				Row row = sheet.getRow(rowNum);
//				if (row == null) {
//					continue;
//				}
//				Object[] objValue = new Object[clazzs.size()];
//				if (row.getRowNum() != 0) {
//					// 循环列Cell
//					for (int cellNum = 0; cellNum < clazzs.size(); cellNum++) {
//						Cell cell = row.getCell(cellNum);
//						if (cell == null) {
//							continue;
//						}
//						objValue[cellNum] = getCellValue(cell,clazzs.get(cellNum));
//					}
//					list.add(objValue);
//				}
//			}
//		}
//		return list;
//	}
//	
//	/**
//	 * @desc:获取所有的单元格内容(忽略空)
//	 * @author Clyde
//	 * @date:2014-8-26
//	 * @param wb
//	 * @return
//	 */
//	public static List<String> readExcel(Workbook wb){
//		List<String> list = new ArrayList<String>();
//		if (wb!=null) {
//			// 循环工作表Sheet
//			for (int numSheet = 0; numSheet < wb.getNumberOfSheets(); numSheet++) {
//				Sheet sheet = wb.getSheetAt(numSheet);// 根据传的参数获取工作表
//				// 循环行Row
//				for (int rowNum = 0; rowNum <= sheet.getPhysicalNumberOfRows(); rowNum++) {
//					Row row = sheet.getRow(rowNum);
//					if (row == null) {
//						continue;
//					}
//					// 循环列Cell
//					for (int cellNum = 0; cellNum < row.getPhysicalNumberOfCells(); cellNum++) {
//						Cell cell = row.getCell(cellNum);
//						if (cell == null) {
//							continue;
//						}
//						String value=getCellValue(cell);
//						if (value==null||value.trim().length()==0) {
//							continue;
//						}
//						list.add(value);
//					}
//				}
//			}
//		}
//		return list;
//	}
//	
//	/**
//	 * @desc:获取所有的单元格内容(忽略空)(有工作簿选择)
//	 * @author Clyde
//	 * @date:2014-8-26
//	 * @param wb
//	 * @param sheetIndex
//	 * @return
//	 */
//	public static List<String> readExcel(Workbook wb,int sheetIndex){
//		List<String> list = new ArrayList<String>();
//		if (wb!=null) {
//			// 循环工作表Sheet
//			Sheet sheet = wb.getSheetAt(sheetIndex);// 根据传的参数获取工作表
//			// 循环行Row
//			for (int rowNum = 0; rowNum <= sheet.getPhysicalNumberOfRows(); rowNum++) {
//				Row row = sheet.getRow(rowNum);
//				if (row == null) {
//					continue;
//				}
//				// 循环列Cell
//				for (int cellNum = 0; cellNum < row.getPhysicalNumberOfCells(); cellNum++) {
//					Cell cell = row.getCell(cellNum);
//					if (cell == null) {
//						continue;
//					}
//					String value=getCellValue(cell);
//					if (value==null||value.trim().length()==0) {
//						continue;
//					}
//					list.add(value);
//				}
//			}
//		}
//		return list;
//	}
//	
//	/**
//	 * 获取Excel列名
//	 * @param wb
//	 * @param numSheet
//	 * @return
//	 */
//	public static List<String> readExcelColumn(Workbook wb, Integer numSheet){
//		List<String> list=new ArrayList<String>();
//		if (wb!=null) {
//			// 循环工作表Sheet
//			Sheet sheet = wb.getSheetAt(numSheet);// 根据传的参数获取工作表
//			// 循环行Row
//			for (int rowNum = 0; rowNum < 1; rowNum++) {
//				Row row = sheet.getRow(rowNum);
//				if (row == null) {
//					continue;
//				}
//				for (int cellNum = 0; cellNum <row.getLastCellNum(); cellNum++) {
//					Cell cell = row.getCell(cellNum);
//					if (cell == null) {
//						continue;
//					}
//					list.add(getCellValue(cell));
//				}
//			}
//		}		
//		return list;
//	}
//
//	/**
//	 * @desc:获取单元格中的值
//	 * @author Clyde
//	 * @date:2014-7-16
//	 * @param cell
//	 * @return
//	 */
//	public static String getCellValue(Cell cell) {
//		String strValue = "";
//		switch (cell.getCellType()) { // 根据cell中的类型来输出数据
//		case Cell.CELL_TYPE_NUMERIC:
//			try {
//				boolean cdf=HSSFDateUtil.isCellDateFormatted(cell);
//				boolean cidf=HSSFDateUtil.isCellInternalDateFormatted(cell);
//				if (cdf||cidf) {
////					strValue = DateUtils.formatDateToString(cell.getDateCellValue());
//				}else{
////					NumberFormat nf = NumberFormat.getInstance();   
////					nf.setGroupingUsed(false);  
////					strValue = nf.format(cell.getNumericCellValue());
//					strValue = cell.getNumericCellValue()+"";
//				}
//			} catch (Exception e) {
//				log.error("[ERROR:Excel解析出错]", e);
//			}
//			break;
//		case Cell.CELL_TYPE_STRING:
//			strValue = cell.getStringCellValue();
//			break;
//		case Cell.CELL_TYPE_BOOLEAN:
//			strValue = String.valueOf(cell.getBooleanCellValue());
//			break;
//		case Cell.CELL_TYPE_FORMULA:
//			try {
//				int resultType=cell.getCachedFormulaResultType();
//				if (resultType==0) {
//					strValue = String.valueOf(cell.getNumericCellValue());
//				}else{
//					strValue = cell.getCellFormula();
//				}
//			} catch (Exception e) {
//				log.error("ERROR:CELL_TYPE_FORMULA", e);
//				strValue = cell.getCellFormula();
//			}
//			break;
//		case Cell.CELL_TYPE_ERROR:
//			strValue = String.valueOf(cell.getErrorCellValue());
//			break;
//		}
//		return strValue.trim();
//	}
//	
//	/**
//	 * @desc:获取单元格中的值
//	 * @author Clyde
//	 * @date:2014-7-16
//	 * @param cell
//	 * @return
//	 */
//	public static String getCellValue(Cell cell,boolean isFormat) {
//		String strValue = "";
//		switch (cell.getCellType()) { // 根据cell中的类型来输出数据
//		case Cell.CELL_TYPE_NUMERIC:
//			try {
//				boolean cdf=HSSFDateUtil.isCellDateFormatted(cell);
//				boolean cidf=HSSFDateUtil.isCellInternalDateFormatted(cell);
//				if (cdf||cidf) {
////					strValue = DateUtils.formatDateToString(cell.getDateCellValue());
//				}else{
//					if(isFormat){
//						NumberFormat nf = NumberFormat.getInstance();   
//						nf.setGroupingUsed(false);  
//						strValue = nf.format(cell.getNumericCellValue());
//					} else {
//						strValue = cell.getNumericCellValue()+"";
//					}
//				}
//			} catch (Exception e) {
//				log.error("[ERROR:Excel解析出错]", e);
//			}
//			break;
//		case Cell.CELL_TYPE_STRING:
//			strValue = cell.getStringCellValue();
//			break;
//		case Cell.CELL_TYPE_BOOLEAN:
//			strValue = String.valueOf(cell.getBooleanCellValue());
//			break;
//		case Cell.CELL_TYPE_FORMULA:
//			try {
//				int resultType=cell.getCachedFormulaResultType();
//				if (resultType==0) {
//					strValue = String.valueOf(cell.getNumericCellValue());
//				}else{
//					strValue = cell.getCellFormula();
//				}
//			} catch (Exception e) {
//				log.error("ERROR:CELL_TYPE_FORMULA", e);
//				strValue = cell.getCellFormula();
//			}
//			break;
//		case Cell.CELL_TYPE_ERROR:
//			strValue = String.valueOf(cell.getErrorCellValue());
//			break;
//		}
//		return strValue.trim();
//	}
//	
//	/**
//	 * @desc:根据类型获取单元格中的值
//	 * @author Clyde
//	 * @date:2014-11-7
//	 * @param cell
//	 * @param objType
//	 * @return
//	 */
//	public static Object getCellValue(Cell cell,Object objType) {
//		Object objValue = null;
//		if (objType.equals(Integer.class)) {
//			
//		}else if(objType.equals(Double.class)){
//			
//		}else if(objType.equals(String.class)){
//			
//		}
//		return objValue;
//	}
//
//	public static boolean isBlankRow(Row row) {
//		if (row == null)
//			return true;
//		boolean result = true;
//		for (int i = row.getFirstCellNum(); i < row.getLastCellNum(); i++) {
//			Cell cell = row.getCell(i, Row.RETURN_BLANK_AS_NULL);
//			String value = "";
//			if (cell != null) {
//				switch (cell.getCellType()) {
//				case Cell.CELL_TYPE_STRING:
//					value = cell.getStringCellValue();
//					break;
//				case Cell.CELL_TYPE_NUMERIC:
//					value = String.valueOf((int) cell.getNumericCellValue());
//					break;
//				case Cell.CELL_TYPE_BOOLEAN:
//					value = String.valueOf(cell.getBooleanCellValue());
//					break;
//				case Cell.CELL_TYPE_FORMULA:
//					value = String.valueOf(cell.getCellFormula());
//					break;
//				default:
//					break;
//				}
//				if (!value.trim().equals("")) {
//					result = false;
//					break;
//				}
//			}
//		}
//		return result;
//	}
//	
//	public static void main(String[] args) throws FileNotFoundException {
//		InputStream input = new FileInputStream("C:/Users/es01/Desktop/1.xls"); // 建立输入流
//		Workbook wb = getCurrentWorkbook("1.xls",input);
//		System.out.println(getAllRows(wb, 0));
//	}
}
