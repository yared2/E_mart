package edu.miu.e_mart.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.miu.e_mart.domain.Product;
import edu.miu.e_mart.exception.ProductNotFoundException;
import edu.miu.e_mart.service.definition.ICategoryService;
import edu.miu.e_mart.service.definition.IProductService;

@Controller
public class ProductController {

	@Autowired
	private IProductService productService;

	@Autowired
	private ICategoryService categoryService;

	@RequestMapping(value = { "/{user}/products/list" }, method = RequestMethod.GET)
	public String findAllProducts(@PathVariable("user") String user, Model model) {

		List<Product> products = productService.findAllProducts();
		
		model.addAttribute("products", products);
		if (user.equals("admin"))
			return "admin_products";

		return "customer_products";
	}

	@RequestMapping(value = { "/admin/products" }, method = RequestMethod.GET)
	public String getProductForm(@ModelAttribute("product") Product product, Model model) {

		model.addAttribute("categories", categoryService.findAllCategories());
		return "productForm";
	}

	@RequestMapping(value = { "/admin/products" }, method = RequestMethod.POST)
	public String saveProduct(@Valid @ModelAttribute("product") Product product, BindingResult result, Model model) {
		model.addAttribute("categories", categoryService.findAllCategories());
		if (result.hasErrors()) {
			return "productForm";
		}
		productService.saveProduct(product);
		return "redirect:/admin/products/list";
	}

	@RequestMapping(value = { "/admin/products/{action}/{id}" }, method = RequestMethod.GET)
	public String getProduct(@PathVariable("action") String action, @PathVariable("id") Integer productId,
			Model model) {
		Product product = productService.findProductById(productId);
		model.addAttribute("product", product);
		if (product == null) {
			throw new ProductNotFoundException("No product with ID :" + productId);

		}
		if (action.equals("get")) {
			System.out.println("get=======" + product.toString());
			return "redirect:/admin/products/list";

		} else if (action.equals("delete")) {
			System.out.println("delete=======" + product.toString());
			productService.deleteProductById(productId);
			return "redirect:/admin/products/list";
		} else if (action.equals("edit")) {
			System.out.println("Edit=======" + product.toString());
			return "edit_product";
		}
		else if (action.equals("comments")) {
			System.out.println("Comments=======" + product.toString());
		//	model.addAttribute("comments", productService.findAllCommentsOfProduct(productId));
			return "comment_product";
		}
		return "public_error";
	}

	@RequestMapping(value = { "/admin/products/edit/{id}" }, method = RequestMethod.POST)
	public String saveEditedProduct(@Valid @ModelAttribute("product") Product product, BindingResult result,
			@PathVariable("id") Integer productId, Model model) {

		Product editedProduct = productService.findProductById(product.getProductId());
		model.addAttribute("product", product);
		if (result.hasErrors()) {
			return "edit_product";
		}
		editedProduct.setCategory(product.getCategory());
		editedProduct.setDescription(product.getDescription());
		editedProduct.setProductImagePath(product.getProductImagePath());
		editedProduct.setProductName(product.getProductName());
		editedProduct.setUnitPrice(product.getUnitPrice());
		
		productService.saveProduct(editedProduct);
		return "redirect:/admin/products/list";

	}

	@RequestMapping(value = { "/{user}/products/{categoty}" }, method = RequestMethod.GET)
	public String findAllProductsByCategory(@PathVariable("categoty") String category,
			@PathVariable("user") String user, Model model) {
		String user_role = "";
		try {
			user_role = productService.identifyUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	//	model.addAttribute("products", productService.findAllProductsByCategory(category));

		if (user_role.equals("admin"))
			return "admin_products";
		return "customer_products";
	}


	@RequestMapping(value = { "/admin/orders" }, method = RequestMethod.GET)
	public String findAllOrders() {

		return "order";
	}

}
