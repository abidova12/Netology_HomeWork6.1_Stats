import ru.netology.stats.StatsService;

public class Main {

    public static void main(String[] args) {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int sumSales = service.sumSales(sales);
        System.out.println(sumSales + " - Сумма всех продаж");

        int averageSumSales = service.averageSumSales(sales);
        System.out.println(averageSumSales + " - Средняя сумма продаж в месяц");

        int resultMinSales = service.minSales(sales);
        System.out.println(resultMinSales + "-ый месяц года - Месяц минимальных продаж");

        int resultMaxSales = service.maxSales(sales);
        System.out.println(resultMaxSales + "-ый месяц года - Месяц максимальных продаж");

        int underAverageSales = service.underAverageSales(sales, averageSumSales);
        System.out.println(underAverageSales + " - Количество месяцев, в которых продажи были ниже среднего");

        int overAverageSales = service.overAverageSales(sales, averageSumSales);
        System.out.println(overAverageSales + " - Количество месяцев, в которых продажи были выше среднего");
    }
}
