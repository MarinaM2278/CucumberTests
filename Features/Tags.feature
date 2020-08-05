Feature: Tags concept

	@Sanity @End2End
	Scenario: Verify login
	Given This is login test
	
	@Sanity @End2End
	Scenario: Verify loguot
	Given This is logout test
	
	@Regression @End2End
	Scenario: Verify search
	Given This is search test

	@Regression @End2End
	Scenario: Verify Advanced search
	Given This is Advanced search test
	
	@End2End
	Scenario: Verify prepaid recharge
	Given This is prepaid recharge test
	
	@Sanity
	Scenario: Verify postpaid recharge
	Given This is postpaid recharge test
	
	
	