document.addEventListener('DOMContentLoaded', function () {
    const reservationForm = document.getElementById('reservation-form');
    const reservationList = document.getElementById('reservation-list');

    reservationForm.addEventListener('submit', function (e) {
        e.preventDefault();

        const name = document.getElementById('name').value;
        const date = document.getElementById('date').value;
        const guests = document.getElementById('guests').value;

        // Create a new reservation item
        const reservationItem = document.createElement('li');
        reservationItem.innerHTML = `
            <strong>Name:</strong> ${name}<br>
            <strong>Date:</strong> ${date}<br>
            <strong>Number of Guests:</strong> ${guests}
        `;

        reservationList.appendChild(reservationItem);

        // Clear the form fields
        reservationForm.reset();
    });
});
