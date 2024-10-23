package by.itacademy.viktoriazakarian.pages;

public class HomePage extends BasePage {

    protected String HOME_URL = BASE_URL + "/домашняя страница";
    private String title = "Домашняя страница";

    public String getTitle() {
        return title;
    }

    @Override
    public void open() {
        System.out.println("Пользователь открыл страницу " + HOME_URL);
    }

    public void clickLogin() {
        System.out.println("Пользователь кликнул по кнопке Войти");
    }
}
