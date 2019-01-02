## CUBA example: Default Values for session

This example shows how to define default values for a given user. Those default values will be used in other screens where those values can be placed into.

Example:

A `Customer` has an attribute `name`. In the default values screen a global `name` attribute value can be entered (e.g. "Fred"). For every invocation of the customer editor screen, the `name` field of the Customer will be set to the value "Fred".

The `Order` and an `Invoice` entities both have values for `dueDate` and `customer`. In the default values screen a global `dueDate` and `customer` attribute value can be entered (e.g. "01/02/2019" & "Customer: Fred"). For every invocation of the invoice and order editor screen, the `dueDate` field  will be set to the value "01/02/2019" and the `customer` field  will be set to the value "Customer: Fred" .

### How it looks in action

![overview](https://github.com/mariodavid/cuba-example-session-default-values/blob/master/img/overview.gif)


### How to use it

In order to use it the following steps have to be taken:

1. In the `DefaultValues` interface an additional field has to be registered: `String ASSIGNED_TO = "defaultValue-assignedTo"; 

2. add an additional field to `default-values-screen.xml` defines which default values are possible for the application: `<pickerField width="100%" id="assignedToField" metaClass="sec$User" caption="msg://user"/>`

2. register new field in `ApplicationDefaultValuesScreen` in the `init` method like this: 
```
  @Inject
  protected PickerField assignedToField;

  @Override
  public void init(Map<String, Object> params) {
    super.init(params);

    // ...
    
    addToDefaultValues(assginedToField, DefaultValues.ASSIGNED_TO);`
  }

```


3. In the destination screen (e.g. `OrderEdit`) the fields that should be populated with a default value need the annotation:

```
  @InitWithDefault(DefaultValues.ASSIGNED_TO)
  @Named("fieldGroup.assignedTo")
  protected PickerField assignedToField;
```


With those changes in place, a user can be set as the default assigned to person for every new Order that is created.