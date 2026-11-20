const noOfDay = 32;

const testSuites = [
    {
        day: 1,
        dayWiseTestcase: [
            {
                fileName: [
                    "DayOneTest.java"
                ],
                testcases: [
                  {
                    "name": "testDefaultConstructor",
                    "value": "Verify that the default constructor creates a Product object successfully and all fields are initialized with their default values."
                  },
                  {
                    "name": "testParameterizedConstructor",
                    "value": "Verify that the parameterized constructor correctly initializes all Product object fields with the values passed as arguments."
                  }
                ]
            }
        ]
    },
    {
      "day": 2,
      "dayWiseTestcase": [
        {
          "fileName": [
            "DayTwoTest.java"
          ],
          "testcases": [
            {
              "name": "testSupplierDefaultConstructor",
              "value": "Verify that the Supplier default constructor creates a non-null Supplier object."
            },
            {
              "name": "testSupplierParameterizedConstructor",
              "value": "Verify that the Supplier parameterized constructor correctly initializes supplierId, supplierName, email, phone, address, username, password, and role."
            },
            {
              "name": "testWarehouseDefaultConstructor",
              "value": "Verify that the Warehouse default constructor creates a non-null Warehouse object."
            },
            {
              "name": "testWarehouseParameterizedConstructor",
              "value": "Verify that the Warehouse parameterized constructor correctly initializes warehouseId, supplierId, warehouseName, location, and capacity."
            }
          ]
        }
      ]
    },
    {
day: 3,
dayWiseTestcase: [
    {
    fileName: [
        "DayThreeTest.java"
    ],
    testcases: [
      {
        "name": "testExceptionHandlingWritten",
        "value": "Verify that an IllegalStateException is thrown when application.properties is not found in the classpath."
      }
      ]
  }
]
    },
     {
        day: 4,
        dayWiseTestcase: [
            {
                fileName: [
                    "DayFourTest.java"
                ],
                testcases: [
                  {
                    "name": "testInterfaceImplementation",
                    "value": "Verify that ProductDAOImpl, SupplierDAOImpl, and WarehouseDAOImpl implement their respective DAO interfaces."
                  },
                  {
                    "name": "testListConcept",
                    "value": "Verify that the DAO classes use the List collection with Product, Supplier, and Warehouse entities."
                  },
                  {
                    "name": "testServiceInterfaceConcept",
                    "value": "Verify that ProductServiceImplJdbc, SupplierServiceImplJdbc, and WarehouseServiceImplJdbc implement their respective service interfaces."
                  }
                ]
            }
        ]
    },
     {
        day: 5,
        dayWiseTestcase: [
            {
                fileName: [
                    "DayFiveTest.java"
                ],
                testcases: [
                  {
                    "name": "testSupplierComparableByName",
                    "value": "Verify that Supplier implements Comparable and compareTo() compares suppliers based on supplierName."
                  },
                  {
                    "name": "testWarehouseComparableByCapacity",
                    "value": "Verify that Warehouse implements Comparable and compareTo() compares warehouses based on capacity."
                  },
                  {
                    "name": "testSupplierComparatorSortingByName",
                    "value": "Verify that SupplierServiceImplArraylist uses Comparator to sort suppliers in ascending order based on supplierName."
                  },
                  {
                    "name": "testWarehouseComparatorSortingByCapacity",
                    "value": "Verify that WarehouseServiceImplArraylist uses Comparator to sort warehouses in ascending order based on capacity."
                  }
                ]
            }
        ]
    },
     {
        day: 6,
        dayWiseTestcase: [
            {
                fileName: [
                    "DaySixTest.java"
                ],
                testcases: [
                  {
                    "name": "testAddProductJdbcOperation",
                    "value": "Verify that ProductServiceImplJdbc correctly delegates the addProduct operation to ProductDAO and returns the generated product ID."
                  },
                  {
                    "name": "testGetProductByIdJdbcOperation",
                    "value": "Verify that ProductServiceImplJdbc correctly delegates getProductById to ProductDAO and returns the requested Product."
                  },
                  {
                    "name": "testGetAllProductsJdbcOperation",
                    "value": "Verify that ProductServiceImplJdbc correctly delegates getAllProducts to ProductDAO and returns the list of Products."
                  }
                ]
            }
        ]
    },
     {
        day: 7,
        dayWiseTestcase: [
            {
                fileName: [
                    "DaySevenTest.java"
                ],
                testcases: [
                  {
                    "name": "testAddSupplierJdbcOperation",
                    "value": "Verify that SupplierServiceImplJdbc correctly delegates addSupplier() to SupplierDAO and returns the generated supplier ID."
                  },
                  {
                    "name": "testGetSupplierByIdJdbcOperation",
                    "value": "Verify that SupplierServiceImplJdbc correctly delegates getSupplierById() to SupplierDAO and returns the requested Supplier."
                  }
                ]
            }
        ]
    },
     {
        day: 8,
        dayWiseTestcase: [
            {
                fileName: [
                    "DayEightTest.java"
                ],
                testcases: [
                  {
                    "name": "testGetWarehouseByIdJdbcOperation",
                    "value": "Verify that the WarehouseDAO correctly retrieves a Warehouse by warehouseId and returns the expected warehouse details."
                  },
                  {
                    "name": "testGetAllWarehouseJdbcOperation",
                    "value": "Verify that the WarehouseDAO correctly retrieves all warehouses and returns the expected list of Warehouse objects."
                  }
                ]
            }
        ]
    },
     {
        day: 9,
        dayWiseTestcase: [
            {
                fileName: [
                    "DayNineTest.java"
                ],
                testcases: [
                  {
                    "name": "testSpringBootApplicationAnnotationAndWelcomeMessage",
                    "value": "Verify that SupplyLinkApplication is annotated proper annotation and contains a public method to start the Spring Boot application."
                  }
                ]
            }
        ]
    },
     {
        day: 10,
        dayWiseTestcase: [
            {
                fileName: [
                    "DayTenTest.java"
                ],
                testcases: [
                  {
                    "name": "testProductControllerRestControllerAndResponseEntity",
                    "value": "Verify that ProductController is annotated with @RestController and all its controller methods use ResponseEntity as the return type."
                  },
                  {
                    "name": "testSupplierControllerRestControllerAndResponseEntity",
                    "value": "Verify that SupplierController is annotated with @RestController and all its controller methods use ResponseEntity as the return type."
                  }
                ]
            }
        ]
    },
     {
        day: 11,
        dayWiseTestcase: [
            {
                fileName: [
                    "DayElevenTest.java"
                ],
                testcases: [
                  {
                    "name": "testEntityIdAndGeneratedValueAnnotations",
                    "value": "Verify Product class contains @Entity and productId field contains @Id and @GeneratedValue(strategy = GenerationType.IDENTITY)"
                  }
                ]
            }
        ]
    },
     {
        day: 12,
        dayWiseTestcase: [
            {
                fileName: [
                    "DayTwelveTest.java"
                ],
                testcases: [
                  {
                    "name": "testAddSupplierToArrayList_Day5",
                    "value": "test Add Supplier To ArrayList_Day12"
                  },
                  {
                    "name": "testGetAllSuppliersSortedByNameFromArrayList_Day5",
                    "value": "test Get All Suppliers Sorted By Name From ArrayList_Day12"
                  },
                  {
                    "name": "testGetAllSupplier_Day5",
                    "value": "test Get All Supplier_Day12"
                  }
                ]
            }
        ]
    },
     {
        day: 13,
        dayWiseTestcase: [
            {
                fileName: [
                    "DayThirteenTest.java"
                ],
                testcases: [
                  {
                    "name": "testAddSupplierController_Day13",
                    "value": "test Add Supplier Controller_Day13"
                  },
                  {
                    "name": "testUpdateSupplierController_Day13",
                    "value": "test Update Supplier Controller_Day13"
                  },
                  {
                    "name": "testGetAllSupplierController_Day13",
                    "value": "test Get All Supplier Controller_Day13"
                  },
                  {
                    "name": "testGetSupplierById_Day13",
                    "value": "test Get Supplier By Id_Day13"
                  }
                ]
            }
        ]
    },
    {
        day: 14,
        dayWiseTestcase: [
            {
                fileName: [
                    "DayFourteenTest.java"
                ],
                testcases: [
                   {
      "name": "testGetAllWarehouse_Day14",
      "value": "test Get All Warehouse_Day14"
    },
    {
      "name": "testGetWarehousesBySupplier_Day14",
      "value": "test Get Warehouses By Supplier_Day14"
    },
    {
      "name": "testGetAllWarehouseSortedByCapacity_Day14",
      "value": "test Get All Warehouse Sorted By Capacity_Day14"
    },
    {
      "name": "testGetWarehousesBySupplierController_Day14",
      "value": "test Get Warehouses By Supplier Controller_Day14"
    },
    {
      "name": "testAddWarehouseController_Day14",
      "value": "test Add Warehouse Controller_Day14"
    }
                ]
            }
        ]
    },
    {
        day: 15,
        dayWiseTestcase: [
            {
                fileName: [
                    "DayFifteenTest.java"
                ],
                testcases: [
                  {
                    "name": "testGetProductByIdController_Day15",
                    "value": "test Get Product By Id Controller_Day15"
                  },
                  {
                    "name": "testDeleteProductController_Day15",
                    "value": "test Delete Product Controller_Day15"
                  },
                  {
                    "name": "testGetAllProductByWarehouse_Day15",
                    "value": "test Get All Product By Warehouse_Day15"
                  }
    ]
      }
        ]
      },
    {
        day: 16,
        dayWiseTestcase: [
            {
                fileName: [
                    "DaySixteeenTest.java"
                ],
                testcases: [
                  {
                    "name": "testSupplierAlreadyExistsException_Day16",
                    "value": "test Supplier Already Exists Exception_Day16"
                  },
                  {
                    "name": "testNoWarehouseFoundForSupplierException_Day16",
                    "value": "test No Warehouse Found For Supplier Exception_Day16"
                  }
                ]
            }
        ]
    },
    {
        day: 17,
        dayWiseTestcase: [
            {
                fileName: [
                    "DaySevenTeenTest.java"
                ],
                testcases: [
                  {
                    "name": "testGetAllShipments_Day17",
                    "value": "test Get All Shipments_Day17"
                  },
                  {
                    "name": "testGetShipmentById_Success_Day17",
                    "value": "test Get Shipment By Id Success_Day17"
                  },
                  {
                    "name": "testGetShipmentById_NotFound_Day17",
                    "value": "test Get Shipment By Id Not Found_Day17"
                  },
                  {
                    "name": "testAddShipment_Day17",
                    "value": "test Add Shipment_Day17"
                  }
                ]
            }
        ]
    },
    {
        day: 18,
        dayWiseTestcase: [
            {
                fileName: [
                    "DayEighteenTest.java"
                ],
                testcases: [
                  {
                    "name": "testGetAllInsurance_Day18",
                    "value": "test Get All Insurance_Day18"
                  },
                  {
                    "name": "testGetInsuranceById_Success_Day18",
                    "value": "test Get Insurance By Id Success_Day18"
                  },
                  {
                    "name": "testGetInsuranceById_NotFound_Day18",
                    "value": "test Get Insurance By Id Not Found_Day18"
                  },
                  {
                    "name": "testAddInsurance_Day18",
                    "value": "test Add Insurance_Day18"
                  }
                ]
            }
        ]
    },
    {
        day: 19,
        dayWiseTestcase: [
            {
                fileName: [
                    "DayNineteenTest.java"
                ],
                testcases: [
                  {
                    "name": "testSupplierControllerGetAllSupplier_Day19",
                    "value": "Verifies that the Supplier Controller successfully retrieves and returns the list of all suppliers."
                  },
                  {
                    "name": "testSupplierControllerAddSupplier_Day19",
                    "value": "Verifies that the Supplier Controller successfully adds a new supplier with valid supplier details."
                  },
                  {
                    "name": "testSupplierControllerDeleteSupplier_Day19",
                    "value": "Verifies that the Supplier Controller successfully deletes an existing supplier using the supplier ID."
                  },
                  {
                    "name": "testWarehouseControllerAddWarehouse_Day19",
                    "value": "Verifies that the Warehouse Controller successfully adds a new warehouse with valid warehouse details."
                  },
                  {
                    "name": "testWarehouseControllerGetWarehouseById_Day19",
                    "value": "Verifies that the Warehouse Controller successfully retrieves a warehouse using its warehouse ID."
                  },
                  {
                    "name": "testWarehouseControllerDeleteWarehouse_Day19",
                    "value": "Verifies that the Warehouse Controller successfully deletes an existing warehouse using the warehouse ID."
                  },
                  {
                    "name": "testProductControllerAddProduct_Day19",
                    "value": "Verifies that the Product Controller successfully adds a new product with valid product details."
                  },
                  {
                    "name": "testProductControllerDeleteProduct_Day19",
                    "value": "Verifies that the Product Controller successfully deletes an existing product using the product ID."
                  },
                  {
                    "name": "testUnauthorizedAddSupplierByUser_Day19",
                    "value": "Verifies that a user without the required authorization is prevented from adding a new supplier and receives an unauthorized or forbidden response."
                  },
                  {
                    "name": "testUnauthorizedDeleteWarehouseByUser_Day19",
                    "value": "Verifies that a user without the required authorization is prevented from deleting a warehouse and receives an unauthorized or forbidden response."
                  }
                ]
            }
        ]
    },
    {
        day: 20,
        dayWiseTestcase: [
            {
                fileName: [
                    "DayTwentyTest.java"
                ],
                testcases: [
                  
                  {
                    "name": "testWarehouseControllerAddWarehouse_Day20",
                    "value": "test Warehouse Controller Add Warehouse_Day20"
                  },
                  {
                    "name": "testWarehouseControllerGetWarehouseById_Day20",
                    "value": "test Warehouse Controller Get Warehouse By Id_Day20"
                  },
                  {
                    "name": "testWarehouseControllerDeleteWarehouse_Day20",
                    "value": "test Warehouse Controller Delete Warehouse_Day20"
                  },
                  {
                    "name": "testProductControllerAddProduct_Day20",
                    "value": "test Product Controller Add Product_Day20"
                  },
                  {
                    "name": "testProductControllerDeleteProduct_Day20",
                    "value": "test Product Controller Delete Product_Day20"
                  },
                  {
                    "name": "testUnauthorizedAddSupplierByUser_Day20",
                    "value": "test Unauthorized Add Supplier By User_Day13"
                  },
                  {
                    "name": "testUnauthorizedDeleteWarehouseByUser_Day20",
                    "value": "test Unauthorized Delete Warehouse By User_Day20"
                  }
                ]
            }
        ]
    },
    {
        day: 21,
        dayWiseTestcase: [
            {
                fileName: [
                    "day_14_15.test.js"
                ],
                testcases: [
                  {
                    "name": "registerFunctionShouldLogCorrectInformation_Day21",
                    "value": "register function should log correct information - Day 21"
                  },
                  {
                    "name": "loginFunctionShouldLogCorrectInformation_Day21",
                    "value": "login function should log correct information - Day 21"
                  }
                ]
            }
        ]
    },
     {
        day: 22,
        dayWiseTestcase: [
            {
                fileName: [
                    "day_22.spec.ts"
                ],
                testcases: [
                  {
                    "name": "warehouseDisplayInfoShouldLogCorrectInformation",
                    "value": "Warehouse displayInfo method should log correct information"
                  },
                  {
                    "name": "productDisplayInfoShouldLogCorrectInformation",
                    "value": "Product displayInfo method should log correct information"
                  }
                ]
            }
        ]
    },
     {
        day: 23,
        dayWiseTestcase: [
            {
                fileName: [
                    "day_23.spec.ts"
                ],
                testcases: [
                  {
                    "name": "warehouseSampleComponentShouldCreate",
                    "value": "WarehouseSampleComponent should create the component_Day17"
                  },
                  {
                    "name": "warehouseSampleComponentShouldDisplayInfo",
                    "value": "WarehouseSampleComponent should display warehouse information correctly_Day17"
                  },
                  {
                    "name": "supplierSampleComponentShouldCreate",
                    "value": "SupplierSampleComponent should create the component_Day17"
                  },
                  {
                    "name": "supplierSampleComponentShouldDisplayInfo",
                    "value": "SupplierSampleComponent should display supplier details correctly_Day17"
                  }
                ]
            }
        ]
    },
    {
        day: 24,
        dayWiseTestcase: [
            {
                fileName: [
                    "day_24.spec.ts"
                ],
                testcases: [
                  {
                    "name": "supplierArrayComponentShouldCreate",
                    "value": "SupplierArrayComponent should create the component_Day19"
                  },
                  {
                    "name": "supplierArrayComponentShouldDisplaySupplierInfo",
                    "value": "SupplierArrayComponent should display supplier information correctly_Day19"
                  }
                ]
            }
        ]
    },
    {
        day: 25,
        dayWiseTestcase: [
            {
                fileName: [
                    "day_25.spec.ts"
                ],
                testcases: [
                  {
                    "name": "supplierArrayComponentShouldCreate",
                    "value": "SupplierArrayComponent should create the component_Day24"
                  },
                  {
                    "name": "supplierArrayComponentShouldDisplaySupplierInfo",
                    "value": "SupplierArrayComponent should display supplier information_Day24"
                  },
                  {
                    "name": "supplierArrayComponentShouldApplyAngularPipes",
                    "value": "SupplierArrayComponent should apply Angular pipes to supplier information_Day24"
                  }
                ]
            }
        ]
    },
    {
      day: 26,
      dayWiseTestcase: [
          {
              fileName: [
                  "day_26.spec.ts"
              ],
              testcases: [
                {
                  "name": "supplierArrayComponentShouldCreate",
                  "value": "SupplierArrayComponent should create the component_Day24"
                },
                {
                  "name": "supplierArrayComponentShouldDisplayAllSuppliers",
                  "value": "SupplierArrayComponent should display all suppliers when no query parameter is provided_Day24"
                },
                {
                  "name": "supplierArrayComponentShouldReadRoleFromActivatedRoute",
                  "value": "SupplierArrayComponent should read role from ActivatedRoute queryParams and filter suppliers_Day24"
                },
                {
                  "name": "supplierArrayComponentShouldFilterAdminSuppliers",
                  "value": "SupplierArrayComponent should filter ADMIN suppliers based on route query parameter_Day24"
                }
              ]
          }
      ]
  },
  {
    day: 27,
    dayWiseTestcase: [
        {
            fileName: [
                "day_27.spec.ts"
            ],
            testcases: [
              {
                "name": "productComponentShouldCreate",
                "value": "ProductComponent should create the component_Day20"
              },
              {
                "name": "productComponentFormControls",
                "value": "ProductComponent should initialize the form with controls_Day20"
              },
              {
                "name": "productComponentOnSubmit",
                "value": "ProductComponent should create a product object on form submission__Day20"
              },
              {
                "name": "warehouseComponentFormControls",
                "value": "WarehouseComponent should set form controls as required_Day20"
              },
              {
                "name": "warehouseComponentFormValidation",
                "value": "WarehouseComponent should pass validation when all fields are valid_Day20"
              },
              {
                "name": "warehouseComponentCapacityValidation",
                "value": "WarehouseComponent should set capacity control as invalid if value is less than 0_Day20"
              }
            ]
        }
    ]
},
{
  day: 28,
  dayWiseTestcase: [
      {
          fileName: [
              "day_28.spec.ts"
          ],
          testcases: [
            {
              "name": "supplierComponentCreate",
              "value": "SupplierComponent should create the component_Day21"
            },
            {
              "name": "supplierComponentFormInitialization",
              "value": "SupplierComponent should initialize the form_Day21"
            },
            {
              "name": "supplierComponentFormControls",
              "value": "SupplierComponent should have form controls for supplierName, email, username, password, and role_Day21"
            },
            {
              "name": "supplierComponentFormSubmission",
              "value": "SupplierComponent should call onSubmit method on form submission_Day21"
            },
            {
              "name": "warehouseComponentCreate",
              "value": "WarehouseComponent should create the component_Day21"
            },
            {
              "name": "warehouseComponentSupplierIdValidation",
              "value": "WarehouseComponent should validate supplierId as required_Day21"
            },
            {
              "name": "warehouseComponentCapacityValidation",
              "value": "WarehouseComponent should validate capacity as non-negative_Day21"
            },
            {
              "name": "warehouseComponentValidForm",
              "value": "WarehouseComponent should pass validation when all fields are valid_Day21"
            }
          ]
      }
  ]
},
{
  day: 29,
  dayWiseTestcase: [
      {
          fileName: [
              "day_29.spec.ts"
          ],
          testcases: [
            {
              "name": "authServiceCreation",
              "value": "AuthService should be created_Day22"
            },
            {
              "name": "authServiceLogin",
              "value": "AuthService login should make a POST request_Day22"
            },
            {
              "name": "authServiceGetToken",
              "value": "AuthService getToken should return token from localStorage_Day22"
            },
            {
              "name": "authServiceCreateUser",
              "value": "AuthService createUser should make a POST request to create a user_Day22"
            },
            {
              "name": "loginComponentCreation",
              "value": "LoginComponent should create the component_Day22"
            },
            {
              "name": "loginComponentNgOnInit",
              "value": "LoginComponent ngOnInit should initialize the login form with empty fields_Day22"
            },
            {
              "name": "loginComponentOnSubmitInvalid",
              "value": "LoginComponent onSubmit should not call authService.login if the form is invalid_Day22"
            },
            {
              "name": "loginComponentOnSubmitValid",
              "value": "LoginComponent onSubmit should call authService.login with correct form data if valid_Day22"
            },
            {
              "name": "userComponentCreation",
              "value": "UserComponent should create the component_Day22"
            },
            {
              "name": "userComponentNgOnInit",
              "value": "UserComponent ngOnInit should initialize the user form with empty fields_Day22"
            },
            {
              "name": "supplierComponentCreate",
              "value": "SupplierComponent should create the component_Day22"
            },
            {
              "name": "supplierComponentFormInitialization",
              "value": "SupplierComponent should initialize the form_Day22"
            },
            {
              "name": "supplierComponentFormControls",
              "value": "SupplierComponent should have form controls for supplierName, email, username, password, and role_Day22"
            },
            {
              "name": "supplierComponentOnSubmitCalled",
              "value": "SupplierComponent should call onSubmit method on form submission_Day22"
            },
            {
              "name": "warehouseComponentCreate",
              "value": "WarehouseComponent should create the component_Day22"
            },
            {
              "name": "warehouseComponentSupplierIdValidation",
              "value": "WarehouseComponent should validate supplierId as required_Day22"
            },
            {
              "name": "warehouseComponentCapacityValidation",
              "value": "WarehouseComponent should validate capacity as non-negative_Day22"
            },
            {
              "name": "warehouseComponentFormValid",
              "value": "WarehouseComponent should pass validation when all fields are valid_Day22"
            }
          ]
      }
  ]
},
{
  day: 30,
  dayWiseTestcase: [
      {
          fileName: [
              "day_30.spec.ts"
          ],
          testcases: [
            {
              "name": "warehouseComponentCreate",
              "value": "WarehouseComponent should create the component_Day23"
            },
            {
              "name": "warehouseComponentNgOnInit",
              "value": "WarehouseComponent ngOnInit should initialize the warehouseForm with empty fields and validators_Day23"
            },
            {
              "name": "warehouseComponentOnSubmitValid",
              "value": "WarehouseComponent onSubmit should call SupplyLinkService.addWarehouse with the warehouse data if the form is valid_Day23"
            },
            {
              "name": "dashboardComponentCreate",
              "value": "DashboardComponent should create the component_Day23"
            },
            {
              "name": "dashboardComponentNgOnInitAdmin",
              "value": "DashboardComponent ngOnInit should call loadAdminData if role is ADMIN_Day23"
            },
            {
              "name": "dashboardComponentLoadAdminData",
              "value": "DashboardComponent loadAdminData should load suppliers, warehouses, and products for admin_Day23"
            }
          ]
      }
  ]
},
{
  day: 31,
  dayWiseTestcase: [
      {
          fileName: [
              "day_31.spec.ts"
          ],
          testcases: [
            {
              "name": "dashboardComponentCreate",
              "value": "DashboardComponent should create the component_Day24"
            },
            {
              "name": "dashboardComponentNgOnInitUser",
              "value": "DashboardComponent ngOnInit should call loadUserData if role is USER_Day24"
            },
            {
              "name": "dashboardComponentEditProductPopup",
              "value": "DashboardComponent editProduct should open the popup and patch the form with product data_Day24"
            },
            {
              "name": "dashboardComponentOnProductFormSubmit",
              "value": "DashboardComponent onProductFormSubmit should update the product when form is valid_Day24"
            },
            {
              "name": "productComponentCreate",
              "value": "ProductComponent should create the component_Day24"
            },
            {
              "name": "productComponentFormInitialization",
              "value": "ProductComponent should initialize form with required controls_Day24"
            },
            {
              "name": "productComponentFetchWarehouses",
              "value": "ProductComponent should fetch warehouses for the supplier on init_Day24"
            },
            {
              "name": "productComponentAddProductValid",
              "value": "ProductComponent should call addProduct when form is valid and submitted_Day24"
            },
            {
              "name": "productComponentAddProductError",
              "value": "ProductComponent should handle error when addProduct fails_Day24"
            },
            {
              "name": "productComponentFormInvalid",
              "value": "ProductComponent should not call addProduct if form is invalid_Day24"
            }
          ]
      }
  ]
},
{
  day: 32,
  dayWiseTestcase: [
      {
          fileName: [
              "day_32.spec.ts"
          ],
          testcases: [
            {
              "name": "supplierEditComponentCreate",
              "value": "SupplierEditComponent should create the component"
            },
            {
              "name": "supplierEditComponentFormInitialization",
              "value": "SupplierEditComponent should initialize the form with required controls_Day25"
            },
            {
              "name": "supplierEditComponentLoadDetails",
              "value": "SupplierEditComponent should load supplier details on init_Day25"
            },
            {
              "name": "supplierEditComponentUpdateValidForm",
              "value": "SupplierEditComponent should update supplier when form is valid and submitted_Day25"
            },
            {
              "name": "supplierEditComponentUpdateInvalidForm",
              "value": "SupplierEditComponent should not update supplier if the form is invalid_Day25"
            },
            {
              "name": "warehouseEditComponentCreate",
              "value": "WarehouseEditComponent should create the component_Day25"
            },
            {
              "name": "warehouseEditComponentLoadDetails",
              "value": "WarehouseEditComponent should load warehouse details on init_Day25"
            },
            {
              "name": "warehouseEditComponentUpdateValidForm",
              "value": "WarehouseEditComponent should update warehouse when form is valid and submitted_Day25"
            },
            {
              "name": "dashboardDeleteFunctionalityCreate",
              "value": "DashboardComponent should create the component_Day25"
            },
            {
              "name": "dashboardDeleteFunctionalityDeleteWarehouse",
              "value": "DashboardComponent should call deleteWarehouse when Delete button is clicked_Day25"
            }
          ]
      }
  ]
},
]
    
module.exports = {
    noOfDay,
    testSuites
};
