package by.itacademy.viktoriazakarian.pages;

public class HomePage extends BasePage {
    protected String HOME_URL = getBASE_URL() + "/домашняя страница";

    public String getHOME_URL() {
        return HOME_URL;
    }

    protected String title = "Домашняя страница";

    public String getTitle() {
        return title;
    }

    @Override
    public void open() {
        System.out.println(getHOME_URL());
    }

    public void clickLogin() {
        System.out.println("Пользователь кликнул по кнопке Войти");
    }
}
