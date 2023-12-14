package webTables
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.google.common.collect.MapDifference;
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory

public class webTableComparison {
	/**
	 * Refresh browser
	 */
	@Keyword



	public static void compareActExpMap(String primaryKeyName, Map<String, Map<String, String>> actMap,
			Map<String, Map<String, String>> expMap, String regimeName) {
		WebDriver driver = DriverFactory.getWebDriver();
		int cntRecPassed = 0;
		int cntRecFailed = 0;
		int cntRecNotfound = 0;
		try {
			for (String actRecordKey : actMap.keySet()) {
				if (!expMap.containsKey(actRecordKey)) {
					cntRecNotfound++;
					System.out.println("Searched actual record not found in expected data :: " + primaryKeyName + " :: "
							+ actRecordKey);
				} else {
					// compare actual and expected map records
					MapDifference<String, String> diff = com.google.common.collect.Maps
							.difference(actMap.get(actRecordKey), expMap.get(actRecordKey));
					if (!diff.areEqual()) {
						cntRecFailed++;
						Map<String, MapDifference.ValueDifference<String>> entriesDiffering = diff.entriesDiffering();
						Map<String, String> entriesOnlyOnLeft = diff.entriesOnlyOnLeft();
						Map<String, String> entriesOnlyOnRight = diff.entriesOnlyOnRight();
						reportMapDifference(primaryKeyName, actRecordKey, entriesDiffering, entriesOnlyOnLeft,
								entriesOnlyOnRight);
					} else {
						cntRecPassed++;
						System.out.println("All values matched for " + primaryKeyName + " :: " + actRecordKey);
					}
				}
			}
		} catch (Exception exception) {
			//			CommonUtils.reportException("compareActExpMap", "", "", "", exception);
		}
	}

	private static void getExpRecordMissingFrmActData(String primaryKeyName, Map<String, Map<String, String>> actMap,
			Map<String, Map<String, String>> expMap) {
		// Report records present in expected data but missing in actual data
		for (String expRecordKey : expMap.keySet()) {
			if (!actMap.containsKey(expRecordKey)) {

				System.out.println("Searched expected record not found in actual data :: " + primaryKeyName + " :: "
						+ expRecordKey);
			}
		}
	}

	private static void reportMapDifference(String recordKeyName, String recordKeyValue,
			Map<String, MapDifference.ValueDifference<String>> entriesDiffering, Map<String, String> entriesOnlyOnLeft,
			Map<String, String> entriesOnlyOnRight) {
		try {
			String failureMsg = "Value mismatch for field :: ";
			for (String keyName : entriesOnlyOnLeft.keySet()) {
				String actValue = entriesOnlyOnLeft.get(keyName);
				String expValue = " ** NOT FOUND ** ";
				System.out
						.println("Failed " + recordKeyName + " :: " + recordKeyValue + " " + actValue + " " + expValue);
			}
			for (String keyName : entriesOnlyOnRight.keySet()) {
				String actValue = " ** NOT FOUND ** ";
				String expValue = entriesOnlyOnRight.get(keyName);
				System.out
						.println("Failed " + recordKeyName + " :: " + recordKeyValue + " " + actValue + " " + expValue);
			}
			for (String keyName : entriesDiffering.keySet()) {
				String actValue = entriesDiffering.get(keyName).leftValue();
				String expValue = entriesDiffering.get(keyName).rightValue();
				System.out
						.println("Failed " + recordKeyName + " :: " + recordKeyValue + " " + actValue + " " + expValue);
			}
		} catch (Exception exception) {
			//					reportException("reportMapDifference", "", "", "", exception);
		}
	}

	public static void compareMap(String primaryKeyName, Map<String, Map<String, String>> actMap,
			Map<String, Map<String, String>> expMap, String regimeName) {
		try {
			if (actMap.size() != expMap.size()) {
				System.out.println("Record count MISMATCH :: " + "Actual record count :: " + actMap.size()
						+ " Expected record count :: " + expMap.size());
			} else if (actMap.size() == 0) {
				System.out.println("Map empty :: " + "Actual record count :: " + actMap.size()
						+ "Expected record count :: " + expMap.size());
			} else {
				System.out.println("Record count MATCHED :: " + "Actual record count :: " + actMap.size()
						+ "Expected record count :: " + expMap.size());
			}
			// using keySet() for iteration over keys
			compareActExpMap(primaryKeyName, actMap, expMap, regimeName);
			getExpRecordMissingFrmActData(primaryKeyName, actMap, expMap);
			// reportRecordsCompared();
		} catch (Exception exception) {
			// CommonUtils.reportException("compareMap", "", "", "", exception);
		}
	}
	public static Map<String, Map<String, String>> getExcelAsMap(WebElement table, String keyName) {
		Map<String, Map<String, String>> transactionRecords = new LinkedHashMap();
		int recordCounter = 0;
		try {

			List<String> excelData = readWebTableDataSmit(table);

			String colNames = excelData.get(0);
			String[] arrColName = colNames.split(",", -1);
			int columnCount = arrColName.length;
			for (String colValues : excelData) {
				String[] arrColValue = colValues.split(",", -1);
				Map<String, String> fileRecord = new LinkedHashMap<>();
				String mapKey = "";
				for (int i = 0; i < columnCount; i++) {
					String columnName = arrColName[i];
					if (columnName.equalsIgnoreCase(keyName))
						mapKey = arrColValue[i];
					fileRecord.put(columnName, arrColValue[i]);
				}
				if (keyName.equalsIgnoreCase("DEFAULT") || mapKey.equalsIgnoreCase("")) {
					transactionRecords.put(String.valueOf(recordCounter), fileRecord);
					recordCounter++;
				} else
					transactionRecords.put(mapKey, fileRecord);
			}
		} catch (Exception exception) {
			//					CommonUtils.reportException("getExcelAsMap", "", "", "", exception);
		}
		return transactionRecords;
	}

	public static List<String> readWebTableDataSmit(WebElement tableElement) {
		List<String> tableData = new ArrayList<>();

		// Get all rows
		List<WebElement> rows = tableElement.findElements(By.tagName("tr"));

		for (WebElement row : rows) {
			// Get all cells in the current row
			String rowData = null;
			List<WebElement> headers = row.findElements(By.tagName("th"));
			List<WebElement> cells = row.findElements(By.tagName("td"));

			int count = 0;
			for (WebElement header : headers) {
				// Extract data from each cell and add it to the list
				if (count == 0) {
					rowData = header.getText();
				} else {
					rowData = rowData + "," + header.getText();
				}
				count++;
				//				tableData.add(cell.getText());
			}

			for (WebElement cell : cells) {
				// Extract data from each cell and add it to the list
				if (count == 0) {
					rowData = cell.getText();
				} else {
					rowData = rowData + "," + cell.getText();
				}
				count++;
			}
			tableData.add(rowData);
		}
		return tableData;
	}

	public static getData(){
		WebDriver driver = DriverFactory.getWebDriver();
		driver.manage().window().maximize();
		driver.get("https://www.geeksforgeeks.org/compare-and-find-differences-between-two-tables-in-sql/");

		// Locate the web table
		WebElement tableElement1 = driver.findElement(By.xpath("//*[@id=\"post-593260\"]/div[4]/figure[1]/table"));
		WebElement tableElement2 = driver.findElement(By.xpath("//*[@id=\"post-593260\"]/div[4]/figure[2]/table"));

		Map<String, Map<String, String>> actMap = getExcelAsMap(tableElement1, "");
		Map<String, Map<String, String>> expMap = getExcelAsMap(tableElement2, "");
		System.out.println("Actual Maps :" + actMap);
		System.out.println("ExpMap Maps :" + expMap);

		compareMap("", actMap, expMap, null);

		driver.quit();
	}
}
