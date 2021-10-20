package pages.mail_page;

public class Locators {
    /**english language locators */
    public static class locatorsMailPageCheckMessage{
        public static final String FILTER_BTN  = "[aria-label='Advanced search options']";
        //invisible untill press filter key
        public static final String THEME_FIELD_FILTER = "//div[@style='visibility: visible; top: 56px;']/div/div/div[3]/span/input";
        public static final String SEARCH_BUTTON = "[aria-label='Search Mail']";
        public static final String MESSAGE_QUANTITY = "//div[@aria-label='Show more messages']/span/span[2]";
        //public static final String MESSAGE_QUANTITY = "ts";

        public static final String MESSAGE_QUANTITY_ON_PAGE ="//span[.='Simbirsoft']";
    }
    /**russian language locators */
    public static class RulocatorsMailPageCheckMessage{
        public static final String FILTER_BTN  = "[aria-label='Расширенный поиск']";
        public static final String THEME_FIELD_FILTER = "//div[@style='visibility: visible; top: 56px;']/div/div/div[3]/span/input";
        public static final String SEARCH_BUTTON = "[aria-label='Поиск почты']";
    }

    public static class locatorsMailPageWriteMessage{
    /**english language locators */
        public static final String WRITE_BTN = "//*[contains(text(),'Compose')]";
        public static final String WRITE_TO = "[aria-label='To']";
        public static final String WRITE_THEME = "[aria-label='Subject']";
        public static final String WRITE_MSG = "div[aria-label='Message Body']";
        //stupid locator
        public static final String SEND_MSG = ".T-I.J-J5-Ji.aoO.v7.T-I-atl.L3";

    }

    public static class RuLocatorsMailPageWriteMessage{
    /**russian language locators */
        public static final String WRITE_BTN = "//*[.='Написать']";
        public static final String WRITE_TO = "[aria-label='Кому']";
        public static final String WRITE_THEME = "[aria-label='Тема']";
        public static final String WRITE_MSG = "[aria-label='Текст письма']";

    }

}
