package com.company.city;

/**
 * Описание города(его порядковый номер, регион, федеральный округ,
 * количество людей проживающих в данном городе, год основания)
 * @author      Nikolay Nikolskiy
 * @version     %I%, %G%
 * @since       1.0
 */
public class City {
    /**
     * Создает город с соответсвующими параметрами
     * @param id
     * @param name
     * @param region
     * @param district
     * @param population
     * @param foundation
     */
    public City(Long id, String name, String region, String district, int population, int foundation) {
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
        this.id = id;
    }
    private long id;
    private String name;
    private String region;
    private String district;
    private int population;
    private int foundation;

    /**
     * Возвращает порядковый номер города под которым он записан
     * @return long - представляет собой порядкоыый номер
     */
    public long getId() { return id; }

    /**
     * Возвращает название города
     * @return String - представляет собой название города
     */
    public String getName() { return name; }

    /**
     * Возвращает название региона где расположен город
     * @return String - представляет собой название региона
     */
    public String getRegion() { return region; }

    /**
     * Возвращает федеральный округ где расположен город
     * @return String - название федерального округа
     */
    public String getDistrict() { return  district; }

    /**
     * Возвращает количество людей населяющих город
     * @return int - количество населения
     */
    public int getPopulation() { return population; }

    /**
     * Возвращает год основания города
     * @return int - год основания города
     */
    public int getFoundation() { return foundation; }

    /**
     * Устанавливает новое название города
     * @param name String передаем название города
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Устанавливает новое название региона
     * @param region String передаем название региона
     */
    public void setRegion(String region) {
        this.region = region;
    }
    /**
     * Устанавливает новое название федерального округа
     * @param district String передаем название федереального округа
     */
    public void setDistrict(String district) {
        this.district = district;
    }
    /**
     * Устанавливает количество населения проживающего в городе
     * @param population int передаем численность города
     */
    public void setPopulation(int population) {
        this.population = population;
    }
    /**
     * Устанавливает год основания города
     * @param foundation int передаем численность города
     */
    public void setFoundation(int foundation) {
        this.foundation = foundation;
    }
    /**
     * Устанавливает количество населения проживающего в городе
     * @param id int передаем численность города
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Возвращает название this City соглсано
     * данному шаблону
     * City{name='Алдан', region='Якутия', district='Дальневосточный', population=21277, foundation='1924'}
     * @return String - представляет собой азвание this City соглсано вышеуказанному шаблону
     */
    @Override
    public String toString() {
        String result = String.format("City{name=\'%s\',region=\'%s\',district=\'%s\',population=%d,foundation=\'%d\'}",
                name, region, district, population, foundation);
        return result;
    }
}
