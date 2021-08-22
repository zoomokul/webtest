@smart
Feature: SmartPulseTestCase01


  Scenario: KGÜP verisi indir


    Given Sayfaya gider
    And Uretim menüsüne tıklar
    And Planlama menüsüne tıklar
    And KGUP menüsüne tıklar
    And Verisini indirmek istediği tarihi girer
    Then Veriyi indirir