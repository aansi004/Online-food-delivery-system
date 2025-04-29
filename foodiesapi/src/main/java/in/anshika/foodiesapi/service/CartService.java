package in.anshika.foodiesapi.service;

import in.anshika.foodiesapi.io.CartRequest;
import in.anshika.foodiesapi.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}
