package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    /**
     * Банковский сервис по переводу денежных средств.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в систему.
     * Метод принимает два параметра: пользователя и список счетов.
     * @param user пользователь которого добавляем.
     */

    public void addUser(User user) {
        List<Account> accounts = new ArrayList<>();
        users.putIfAbsent(user, accounts);
    }

    /**
     * Метод ищет пользователя по паспорту, затем получаем список его счетов.
     * Метод добавляет новый счет к пользователю.
     * @param passport по паспорту ищем пользователя.
     * @param account получаем список счетов.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (accounts != null) {
                if (!accounts.contains(account)) {
                    accounts.add(account);
                }
            }
        }
    }

    /**
     * Метод ищет пользователя по паспорту.
     * @param passport паспорт пользователя.
     * @return возвращает найденного пользователя.
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод ищет счет пользователя по реквизитам.
     * @param passport паспорт пользователя.
     * Ищем список счетов найденного пользователя.
     * @param requisite реквизиты счета.
     * @return возвращает найденный счет по реквизитам.
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
             for (Account userAccount : accounts) {
                 if (userAccount.getRequisite().contains(requisite)) {
                     return userAccount;
                 }
             }
        }
        return null;
    }

    /**
     * Метод реализует перечисление денег с одного счета на другой.
     * @param srcPassport паспорт пользователя который перечисляет денежные средства
     * @param srcRequisite реквизиты пользователя который перечисляет денежные средства
     * @param destPassport паспорт пользователя который получает денежные средства
     * @param destRequisite реквизиты на которые перечисляются денежные средства
     * @param amount итоговая сумма на счете после получения перевода.
     * @return если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят),
     * то метод должен вернуть false
     */

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account accountSrc = findByRequisite(srcPassport, srcRequisite);
        Account accountDest = findByRequisite(destPassport, destRequisite);
        if (accountSrc != null && accountDest != null) {
            if (accountSrc.getBalance() > accountDest.getBalance()) {
                amount = accountSrc.getBalance() + accountDest.getBalance();
                accountDest.setBalance(amount);
            }
        }
        return rsl;
    }
}