document.addEventListener("DOMContentLoaded", function () {
    const slider = document.querySelector(".slide");
    const dots = document.querySelectorAll(".dot");

    let currentIndex = 0;

    dots.forEach((dot, index) => {
        dot.addEventListener("click", () => {
            currentIndex = index;
            updateSlider();
        });
    });

    function updateSlider() {
        const newPosition = -currentIndex * 100 + "%";
        slider.style.transform = "translateX(" + newPosition + ")";
        updateActiveDot();
    }

    function updateActiveDot() {
        dots.forEach((dot, index) => {
            dot.classList.remove("active");
            if (index === currentIndex) {
                dot.classList.add("active");
            }
        });
    }
});

document.addEventListener("DOMContentLoaded", function () {
    const popupContainer = document.querySelector(".popup-container");
    const popupImage = document.querySelector(".popup-image");
    const popupTriggers = document.querySelectorAll(".popup-trigger");

    popupTriggers.forEach((trigger) => {
        trigger.addEventListener("click", function () {
            const imageUrl = this.src;
            popupImage.src = imageUrl;
            popupContainer.style.display = "flex";
        });
    });

    popupContainer.addEventListener("click", function () {
        this.style.display = "none";
    });
});