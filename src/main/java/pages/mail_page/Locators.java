package pages.mail_page;

public class Locators {
    public static class locatorsMailPageCheckMessage{
        public static final String filterBtn  = "[aria-label='Расширенный поиск']";
        public static final String themeFieldFielter = "//div[@style='visibility:visible;top 56px;left:256px']/div/div/div[3]/span/[2]/input";
    }
    public static class locatorsMailPageWriteMessage{
    /**english language locators */
        public static final String WRITE_BTN = "//*[contains(text(),'Compose')]";
        public static final String WRITE_TO = "[aria-label='To']";
        public static final String WRITE_THEME = "[aria-label='Subject']";
        public static final String WRITE_MSG = "div[aria-label='Message Body']";
        public static final String SEND_MSG = "//div[.='Send']";
    }

    public static class RuLocatorsMailPageWriteMessage{
    /**russian language locators */
        public static final String WRITE_BTN = "//*[.='Написать']";
        public static final String WRITE_TO = "[aria-label='Кому']";
        public static final String WRITE_THEME = "[aria-label='Тема']";
        public static final String WRITE_MSG = "[aria-label='Текст письма']";

    }

}
