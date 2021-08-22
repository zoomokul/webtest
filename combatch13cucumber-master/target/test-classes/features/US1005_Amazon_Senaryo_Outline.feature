Feature: US1005_Amazon_Senaryo_Outline

  Scenario Outline: TC_10_Amazon Çoklu Arama

    Given kullanici amazon sayfasina gider
    And "<meyve>" icin arama yapar
    And sonuclarin  "<meyve>" icerdigini test eder

    Examples:
    |meyve|
    |elma|
    |armut|
    |kavun|
    |erik|
    |muz|
