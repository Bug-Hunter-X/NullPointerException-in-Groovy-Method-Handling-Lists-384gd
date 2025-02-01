```groovy
def myMethod(List<String> list) {
    if (list == null) { 
        return [] // Return an empty list instead of null
    }
    // ... rest of your code
}

// Example usage 
println myMethod(null) //Should print [] instead of null
println myMethod(['a', 'b', 'c']) //should print ['a','b','c']
```