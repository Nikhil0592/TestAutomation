<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>DataDriven-SauceDemo</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>e1c505b4-973c-4b05-bc03-df9f8637f3ad</testSuiteGuid>
   <testCaseLink>
      <guid>168537d3-4be5-4661-95a0-f21b218c7872</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <iterationNameVariable>
         <defaultValue>'Nikhil'</defaultValue>
         <description></description>
         <id>51f15580-b410-4f0d-95ec-3d01cfead229</id>
         <masked>false</masked>
         <name>var_firstname</name>
      </iterationNameVariable>
      <testCaseId>Test Cases/Tests Using Custom Keywords/TestCase2-SauceDemo</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>dc4a750a-e022-42e1-a23e-837dbf2a0bf5</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-2</value>
         </iterationEntity>
         <testDataId>Data Files/TestData/SauceDemoTestData</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>dc4a750a-e022-42e1-a23e-837dbf2a0bf5</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>First Name</value>
         <variableId>51f15580-b410-4f0d-95ec-3d01cfead229</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>dc4a750a-e022-42e1-a23e-837dbf2a0bf5</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Last Name</value>
         <variableId>14579ba5-787b-41cd-ba78-e03ddf20fa5e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>dc4a750a-e022-42e1-a23e-837dbf2a0bf5</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Zip/Postal Code</value>
         <variableId>321c7ffb-0bfb-475e-90d7-e7fdba94c54b</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
