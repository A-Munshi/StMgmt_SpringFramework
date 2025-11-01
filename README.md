## 🌱 Spring Framework Dependency Injection
A mini **Spring Framework** project showcasing both **Constructor Injection** and **Setter Injection** using **XML configuration** (no annotations, no Java-based config).
Includes a **menu-driven console app** to explore object dependencies interactively.

### Goal
To demonstrate how Spring manages dependencies between beans using:
* Constructor Injection (`<constructor-arg>`)
* Setter Injection (`<property>`)
* XML-based Bean Configuration

### Key Concepts
```
| Concept                     | Demonstrated In             | Description                                    |
| --------------------------- | --------------------------- | ---------------------------------------------- |
| **Constructor Injection**   | `Address`, `Teacher`        | Dependencies passed through class constructors |
| **Setter Injection**        | `Student`, `Course`         | Dependencies injected via setter methods       |
| **Bean References**         | XML `<property ref="..."/>` | Links multiple beans together                  |
| **Menu-Driven Console App** | `MenuApp`                   | Interactive CLI to view details dynamically    |
```
### Project Structure
```
StMgmt_SpringFramework/
│
├── src/com/
│   ├── example/       → Basic DI example (Student + Address)
│   ├── example2/      → Multi-bean DI (Student + Teacher + Course)
│   └── example3/      → Menu-driven DI app│
└── src/resources/
    ├── applicationContext.xml
    ├── applicationContext2.xml
    └── applicationContext3.xml
```
### ### OUTPUT
<img width="1708" height="2044" alt="image" src="https://github.com/user-attachments/assets/03445ddd-2384-4be4-bad5-640142dfe6ec" />

### Technologies Used
* **Java 25**
* **Spring Framework 6**
* **Maven**
* **XML-based Configuration**
* **OOP + Dependency Injection principles**

### Learning Outcomes
✅ Understood **Constructor vs Setter Injection**
✅ Learned how **Spring IoC Container** manages beans
✅ Created **modular and reusable** Java components
✅ Built a **menu-driven Spring application**
