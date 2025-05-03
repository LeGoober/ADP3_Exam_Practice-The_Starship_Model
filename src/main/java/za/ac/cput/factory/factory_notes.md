# Factory Modelling
>The process of modelling a Factory allows us to create various instances
> of an object. This allows us to create multiple objects without having 
> to manually churn them out, and with the factory, we are working in conjunction
> to the Helper class defined in the Utility package
> 
> 
#### The main aim of the Factory classes
>With any domain objects that require various instances to be verified before
>their construction, we have to use the factory to pass in a method that first
> verified the parameters of the domain before constructuon and that's where the
> Helper class comes into play, as:
>  - wee an use various dependencies, such as the Apache Commons dependency or
>  - various methods, such as Regex(regular expressions) in order to ensure that parameters such as
>  - emails rpasswords can be verified or the entire instance of the object returns a null value.