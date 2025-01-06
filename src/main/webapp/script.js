const buttons = document.querySelectorAll('.cart');
    let cart = [];

    buttons.forEach(button => {
        button.addEventListener('click', function() {
            const productDiv = button.parentElement;
            const productName = productDiv.querySelector('h2').textContent;
            const productPrice = parseFloat(productDiv.querySelector('p').textContent.replace('$', ''));
            
            
            const checkoutP = productDiv.querySelector('.checkout');
            checkoutP.textContent = "Added to cart !!";
            checkoutP.style.backgroundColor = "peru";
            
            
            cart.push({ name: productName, price: productPrice });
            localStorage.setItem('cart', JSON.stringify(cart));
        });
    });
