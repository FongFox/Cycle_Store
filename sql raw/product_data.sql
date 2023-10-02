use cycle_store;

-- create category data
INSERT INTO category (name)
VALUES 
	("Mountain Bike"), ("Touring Bike"), ("City Bike"), ("Accessories");

-- create product data
INSERT INTO product (sku, name, image, description, price, stock, active, category_id)
VALUES 
	-- create moutain bike data
	("mb01", "product 01", "example_image", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", 10.99, 10, true, 1),
	("mb02", "product 02", "example_image", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", 15.99, 15, true, 1),
    ("mb03", "product 03", "example_image", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", 20.99, 20, true, 1),
    -- create touring bike data
    ("tb01", "product 01", "example_image", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", 10.99, 20, true, 2),
    ("tb02", "product 02", "example_image", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", 15.99, 10, true, 2),
    ("tb03", "product 03", "example_image", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", 25.99, 25, true, 2),
    -- create city bike data
    ("cb01", "product 01", "example_image", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", 10.99, 5, true, 3),
    ("cb02", "product 02", "example_image", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", 15.99, 10, true, 3),
    ("cb03", "product 03", "example_image", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", 20.99, 25, true, 3),
    -- create accessories data
    ("a01", "product 01", "example_image", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", 2.99, 5, true, 4),
    ("a02", "product 02", "example_image", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", 5.99, 10, true, 4),
    ("a03", "product 03", "example_image", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", 7.99, 15, true, 4);