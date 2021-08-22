

Feature: US1003_Yandex_Arama

  Background: Kullanici yandex gider
    Given Kullanici yandex anasayfa gider

    Scenario: TC05_Iphone arama
      When yandex iPhone icin arama yapar
      Then yandex sonuclarin iPhone icerdigini test eder

  Scenario: TC06_tea pot arama
    When Yandex tea pot icin arama yapar
    Then Yandex sonuclarin tea pot icerdigini test eder
    Then sayfayi kapatir