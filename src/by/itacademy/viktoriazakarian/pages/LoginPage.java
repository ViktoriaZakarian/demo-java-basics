package by.itacademy.viktoriazakarian.pages;

public class LoginPage extends BasePage {
    protected String LOGIN_PAGE = getBASE_URL() + "/форма логина";
    String title = "Форма логина";

    public String getLOGIN_PAGE() {
        return LOGIN_PAGE;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void open() {
        System.out.println("Пользователь открыл страницу " + getLOGIN_PAGE());
    }
}
