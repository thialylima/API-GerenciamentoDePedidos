package com.thialy.desafio_api.controller;

import com.thialy.desafio_api.model.entities.Order;
import com.thialy.desafio_api.model.service.OrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Operation(summary = "Get all orders")
    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @Operation(summary = "Get an order by ID")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Found the order",
                     content = { @Content(mediaType = "application/json",
                     schema = @Schema(implementation = Order.class)) }),
        @ApiResponse(responseCode = "404", description = "Order not found",
                     content = @Content)
    })
    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
        try {
            Order order = orderService.getOrderById(id);
            return ResponseEntity.ok(order);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @Operation(summary = "Create a new order")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Order created",
                     content = { @Content(mediaType = "application/json",
                     schema = @Schema(implementation = Order.class)) }),
        @ApiResponse(responseCode = "400", description = "Invalid input",
                     content = @Content)
    })
    @PostMapping
    public ResponseEntity<String> createOrder(@RequestBody Order order) {
        try {
            orderService.saveOrder(order);
            return ResponseEntity.ok("Pedido criado com sucesso.");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @Operation(summary = "Update an existing order")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Order updated",
                     content = { @Content(mediaType = "application/json",
                     schema = @Schema(implementation = Order.class)) }),
        @ApiResponse(responseCode = "404", description = "Order not found",
                     content = @Content)
    })
    @PutMapping("/{id}")
    public ResponseEntity<String> updateOrder(@PathVariable Long id, @RequestBody Order order) {
        try {
            orderService.updateOrder(id, order);
            return ResponseEntity.ok("Pedido atualizado com sucesso.");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @Operation(summary = "Delete an order by ID")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Order deleted",
                     content = @Content),
        @ApiResponse(responseCode = "404", description = "Order not found",
                     content = @Content)
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteOrder(@PathVariable Long id) {
        try {
            orderService.deleteOrder(id);
            return ResponseEntity.ok("Pedido excluído com sucesso.");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
