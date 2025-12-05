# Скрипт для коммита изменений
$projectPath = 'd:\Учеба\пром разработка все\5 номер\5_number'
Set-Location -LiteralPath $projectPath

# Инициализация репозитория (если еще не инициализирован)
if (-not (Test-Path .git)) {
    git init
}

# Добавление файлов
git add .gitignore
git add src/

# Проверка статуса
git status

# Создание коммита
git commit -m "Add .gitignore and introduce bug in Calculator.subtract()"

# Проверка удаленного репозитория
Write-Host "`nДля отправки в удаленный репозиторий выполните:"
Write-Host "git remote add origin <URL_вашего_репозитория>"
Write-Host "git push -u origin main"
Write-Host "`nИли если удаленный репозиторий уже настроен:"
Write-Host "git push"

