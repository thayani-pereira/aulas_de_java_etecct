import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;

/**
 * Export Excel!
 *
 */
public class ExportExcel {
	
	public static void main(String[] args) {
		// Criando o arquivo e uma planilha chamada "Product"
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Product");

		// Definindo alguns padroes de layout
		sheet.setDefaultColumnWidth(15);
		sheet.setDefaultRowHeight((short) 400);

		//Carregando os produtos
		List products = new ArrayList();

		products.add(new Product(1l, "Produto 1", 200.5d));
		products.add(new Product(2l, "Produto 2", 1050.5d));
		products.add(new Product(3l, "Produto 3", 50d));
		products.add(new Product(4l, "Produto 4", 200d));
		products.add(new Product(5l, "Produto 5", 450d));
		products.add(new Product(6l, "Produto 6", 150.5d));
		products.add(new Product(7l, "Produto 7", 300.99d));
		products.add(new Product(8l, "Produto 8", 1000d));
		products.add(new Product(9l, "Produto 9", 350d));
		products.add(new Product(10l, "Produto 10", 200d));


		int rownum = 0;
		int cellnum = 0;
		Cell cell;
		Row row;

		//Configurando estilos de células (Cores, alinhamento, formatação, etc..)
		HSSFDataFormat numberFormat = workbook.createDataFormat();

		CellStyle headerStyle = workbook.createCellStyle();
		headerStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
		// headerStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
		// headerStyle.setAlignment(CellStyle.ALIGN_CENTER);
		// headerStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);

		CellStyle textStyle = workbook.createCellStyle();
		// textStyle.setAlignment(CellStyle.ALIGN_CENTER);
		// textStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);

		CellStyle numberStyle = workbook.createCellStyle();
		// numberStyle.setDataFormat(numberFormat.getFormat("#,##0.00"));
		// numberStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);

		// Configurando Header
		row = sheet.createRow(rownum++);
		cell = row.createCell(cellnum++);
		cell.setCellStyle(headerStyle);
		cell.setCellValue("Code");

		cell = row.createCell(cellnum++);
		cell.setCellStyle(headerStyle);
		cell.setCellValue("Name");

		cell = row.createCell(cellnum++);
		cell.setCellStyle(headerStyle);
		cell.setCellValue("Price");
		
		Product product;
		// Adicionando os dados dos produtos na planilha
		for (int index = 0; products.size() < index; index ++) {
			
			product = (Product) products.get(index);
			row = sheet.createRow(rownum++);
			cellnum = 0;

			cell = row.createCell(cellnum++);
			cell.setCellStyle(textStyle);
			cell.setCellValue(product.getId());

			cell = row.createCell(cellnum++);
			cell.setCellStyle(textStyle);
			cell.setCellValue(product.getName());

			cell = row.createCell(cellnum++);
			cell.setCellStyle(numberStyle);
			cell.setCellValue(product.getPrice());
		}

		try {

			File yourFile = new File("/tmp/products.xls");

			System.out.println(yourFile.getParentFile().getParent());
			yourFile.getParentFile().mkdirs();
			
			yourFile.createNewFile(); // if file already exists will do nothing 
			
			//FileOutputStream oFile = new FileOutputStream(yourFile, false); 
			
			// Escrevendo o arquivo em disco
			FileOutputStream out = new FileOutputStream(yourFile);
			
			workbook.write(out);
			out.close();
			workbook.close();
			System.out.println("Success!!");

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException!!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException!!");
			e.printStackTrace();
		}
	}
}