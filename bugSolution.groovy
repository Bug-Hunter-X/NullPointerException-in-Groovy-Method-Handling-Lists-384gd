```groovy
def myMethod(List<String> list) {
    if (list == null) { 
        return [] // Return an empty list instead of null
    }
    // ... rest of your code
    return list // or other processing of list
}

// Example usage
println myMethod(null) // Prints []
println myMethod(['a', 'b', 'c']) // Prints [a, b, c]
```