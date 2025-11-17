package utils;

import dto.createpage.CreatePageRequestDto;

public class CurrencyFormatter {

    public static String formatCurrencyToUi(CreatePageRequestDto dto) {
        var value  = dto.getOrder().getAmount() / 100;
        return String.format("%.2f %s", value).replace(".", ",");
    }
}
