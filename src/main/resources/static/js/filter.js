function filterByDate() {
    const selectedDate = document.getElementById('date-filter').value;
    const showBlocks = document.querySelectorAll('.show-block');
    let count = 0;

    showBlocks.forEach(block => {
        const showDate = block.querySelector('.show-date').textContent;
        if (showDate === selectedDate) {
            block.style.display = 'block'; // Показываем спектакль, если дата совпадает
            count++;
        } else {
            block.style.display = 'none'; // Скрываем спектакль, если дата не совпадает
        }
    });

    // Обновляем счетчик спектаклей
    const countDisplay = document.getElementById('count');
    countDisplay.textContent = count; // Устанавливаем количество спектаклей
}

// Инициализируем счетчик спектаклей
const showBlocks = document.querySelectorAll('.show-block');
const countDisplay = document.getElementById('count');
countDisplay.textContent = showBlocks.length; // Устанавливаем количество спектаклей
