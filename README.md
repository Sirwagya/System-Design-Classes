# System Design Classes

Java implementations of SOLID principles and classic design patterns organized by chapter.

## Project Structure

```text
system design/
├── src/
│   ├── App.java                                  # Runs all chapter demos
│   ├── solid/
│   │   ├── Client.java
│   │   ├── interfaces/
│   │   │   ├── CanRun.java
│   │   │   ├── CanSwim.java
│   │   │   ├── Flyable.java
│   │   │   └── Singable.java
│   │   └── models/
│   │       ├── Bird.java
│   │       ├── Eagle.java
│   │       ├── Ostrich.java
│   │       ├── Penguin.java
│   │       └── Sparrow.java
│   ├── builder/
│   │   ├── Client.java
│   │   └── models/
│   │       └── Student.java
│   ├── adapter/
│   │   ├── Client.java
│   │   ├── PhonePe.java
│   │   ├── adapters/
│   │   │   ├── IciciBankAdapter.java
│   │   │   └── YesBankAdapter.java
│   │   ├── interfaces/
│   │   │   └── BankAPI.java
│   │   └── thirdparty/
│   │       ├── IciciBank.java
│   │       └── YesBank.java
│   ├── strategy/
│   │   ├── Client.java
│   │   ├── GoogleMap.java
│   │   ├── enums/
│   │   │   └── ModeType.java
│   │   ├── factory/
│   │   │   └── PathCalculatorFactory.java
│   │   ├── interfaces/
│   │   │   └── PathCalculator.java
│   │   └── strategies/
│   │       ├── BikePathCalculator.java
│   │       ├── CarPathCalculator.java
│   │       └── WalkPathCalculator.java
│   ├── decorator/
│   │   └── icecream/
│   │       ├── Client.java
│   │       ├── abstracts/
│   │       │   └── ToppingDecorator.java
│   │       ├── classes/
│   │       │   ├── ButterScotch.java
│   │       │   ├── Chocolate.java
│   │       │   ├── OrangeCone.java
│   │       │   └── Vanilla.java
│   │       └── interfaces/
│   │           └── IceCream.java
│   └── observor/
│       ├── client.java
│       ├── classes/
│       │   ├── Amazon.java
│       │   ├── emailService.java
│       │   ├── inventoryService.java
│       │   └── logisticService.java
│       └── interfaces/
│           ├── Publisher.java
│           └── Subscriber.java
├── lib/
└── .vscode/
```

## Compile and Run

Compile all Java sources into `bin/`:

```bash
javac -d bin -sourcepath src src/App.java
```

Run all demos together:

```bash
java -cp bin App
```

Or run an individual chapter:

```bash
java -cp bin solid.Client
java -cp bin builder.Client
java -cp bin adapter.Client
java -cp bin strategy.Client
java -cp bin decorator.icecream.Client
java -cp bin observor.client
```
