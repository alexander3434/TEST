package com.git;

public class Git {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
//        $ git config-- global user.name "alexander3434"
//        $ git config-- global user.email alexander.kozyrev2012 @yandex.ru
//        $ git config-- global core.editor vim // использую текстовый редактор вим
//        $ git config-- list  //гит находит все настройки
//        $ cd /Users/user/my_project // Создает поддиректорию в директории
//        $ git status -s// какие файлы в каком состоянии находятся (?? - неотслеживаемые, А-отлсеживаемые, М-отредактированные)
//        $ git add//  (добавить под версионный контроль) новый файл
//        $ git rm удаляет файл из вашего рабочего каталога
//        $ mv README.md README (переименовка файла)
//        $ git rm README.md (удаление прошлого названия
//        $ git add README (проиндексировка)
//        $ git commit --amend (если надо переделать комит)
//        $ git commit -m (добавление файлов)
//        $ git remote -v (чтение удаленного репозитория  + их адрес)
//        $ git fetch [remote-name] (получение данных из удал.репозитория)
//        $ git pull (автоматически получить изменения из удалённой ветки + слить со своими (merge)
//        $ git push origin master (поделиться наработками) ориг, мастер по умолчанию
//        $ git remote rename pb paul (переименовка удаленного сервера в паул)
//        $ git tag -d (удаление тега локальный!!!)
//        $ git push origin --delete <tagname> (удаление удаленного репозитория!!!)
//        $ git config --global alias.ci commit (псевдоним комиту на ci)
//        $ git log --oneline --decorate --graph --all (показывает указатели строк)
//        $ git checkout testing (переключение на ветку тестинг) HEAD - указывает на текущую ветку
//        $ vim test.rb (создаение файла тест.рб)
//        $ git commit -a -m 'made other changes' (комит в ветку файла)
//        $ git checkout -b <newbranchname>. (создание ветки + автоматическое переключение)
//        $ git merge МОРЖ (слияние с веткой МОРЖ)
//        $ git branch -d МОРЖ (удаление ветки Морж)
//        $ git branch testing (создание ветки тестинг)
//        $ git branch (список сущесвтующих веток)
//        $ git branch -v (покаывает последний комит на каждой ветке)
//        $ git branch --merged (показывает ветки которые слиты)
//        $ git remote show <remote> (показывает удаленные ветки)
//        $ git remote add ... (добавление  удаленной ссылки ...)
//        $ git fetch <remote> (синхронизация изменений с удаленным сервером)
//        $ git push <remote> <branch> (отправка ветки "branch") remote-origin
//        $ git checkout --track origin/serverfix (отслеживание ветки "serverfix")
//   GIT IGNORE
//# Исключить все файлы с расширение .a
//        *.a
//
//        # Но отслеживать файл lib.a даже если он подпадает под исключение выше
//        !lib.a
//
//        # Исключить файл TODO в корневой директории, но не файл в subdir/TODO
//        /TODO
//
//        # Игнорировать все файлы в директории build/
//        build/
//
//        # Игнорировать файл doc/notes.txt, но не файл doc/server/arch.txt
//        doc/*.txt
//
//# Игнорировать все .txt файлы в директории doc/
//doc/**/*.txt
