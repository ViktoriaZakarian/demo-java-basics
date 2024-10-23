package by.itacademy.viktoriazakarian.pages;

public class LoginPage extends BasePage {

    protected String LOGIN_PAGE = BASE_URL + "/форма логина";
    private String title = "Форма логина";

    public String getTitle() {
        return title;
    }

    @Override
    public void open() {
        System.out.println("Пользователь открыл страницу " + LOGIN_PAGE);
    }
}
