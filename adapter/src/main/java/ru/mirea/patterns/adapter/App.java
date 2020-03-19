package ru.mirea.patterns.adapter;

public class App {
    public static void main(String[] args) {
        /*
            Адаптер позволяет без изменения кода поддерживать новый интерфейс

            Например, у нас был старый провайдер и давал список продуктов,
            теперь они поменяли политику и дают только один по ид.
            Делаем адаптер чтобы получать снова списком и не менять код.
         */
        ProductsReceiver receiver = new ProductsReceiver();

        ProductsProvider provider = new OldProvider();
        receiver.doSomeLogic(provider.products());

        provider = new Adapter(new NewProvider());
        receiver.doSomeLogic(provider.products());
    }
}
