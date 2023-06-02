
public class DropDown {
	@Test
	public void MonthDropDown() throws Throwable, Throwable {

		List<String> actualMonthList = new ArrayList<String>();
		List<String> expectedMonthList = new ArrayList<String>();
		FaceBookSigupPage signupPage = new FaceBookSigupPage(driver);
		Select monthSelect = new Select(signupPage.getMonthDropDown());
		List<WebElement> allMonthOptions = monthSelect.getOptions();
		for (WebElement option : allMonthOptions) {
			String monthName = option.getText();
			actualMonthList.add(monthName);
		}

		FileInputStream fis = new FileInputStream("./src/test/resources/myprofile.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("mydata");
		Row row = sheet.getRow(0);
		int minColIx = (int) row.getFirstCellNum();
		//System.out.println("minColIx = " + minColIx);
		int maxColIx = (int) row.getLastCellNum();
		//System.out.println("maxColIx = " + maxColIx);
		for (int colIx = ++minColIx; colIx <= maxColIx - 1; colIx++) {
			String cellData = row.getCell(colIx).getStringCellValue();
			//System.out.println(cellData);
			expectedMonthList.add(cellData);
		}
		workbook.close();
		Reporter.log("actualMonthList = " + actualMonthList);
		Reporter.log("expectedMonthList = " + expectedMonthList);
		if (actualMonthList.equals(expectedMonthList)) {
			Reporter.log("Pass:The Month Dropdown options are in the right order it is verified and found correct.");
		}else {
			Reporter.log("Fail:The Month Dropdown options are in the inappropriate order it is verified and found incorrect.");
		}
	}
}
