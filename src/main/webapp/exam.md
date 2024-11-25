# 코딩테스트
## 자바
### basic
#### 1. 주어진 배열에서 홀수의 개수를 세는 메서드를 작성하세요.

- 배열의 요소는 0 이상 100 이하의 정수입니다.
- 결과는 int 타입으로 반환합니다.
```
public class Main {
    public static int countOddNumbers(int[] numbers) {
        int count = 0;
        // 빈칸 채우기
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(countOddNumbers(numbers)); // 
    }
}
[출력 결과]
4
```
#### 2. 사용자로부터 입력받은 숫자가 1에서 100 사이인지 확인하는 메서드를 작성하세요.

- 값이 범위 밖이면 IllegalArgumentException을 발생시킵니다.
- 적절한 메시지를 포함한 예외를 발생시켜야 합니다.
```
public class Main {
    public static void validateNumber(int number) {
        // 빈칸 채우기
    }

    public static void main(String[] args) {
        try {
            validateNumber(50); // 정상 실행
            validateNumber(150); // 예외 발생
        } catch (IllegalArgumentException e) {
            System.out.println("에러 발생: " + e.getMessage());
        }
    }
}

[출력 결과]
에러 발생 : 값의 범위를 초과했습니다.
```
#### 3. 다음 조건을 만족하는 인터페이스와 클래스를 작성하세요.

- Vehicle 인터페이스는 void move() 메서드를 정의합니다.
- Car 클래스는 Vehicle을 구현하며, move()를 호출하면 "The car is driving."를 출력합니다.
- Main 클래스에서 Vehicle 타입의 객체를 생성하고 move() 메서드를 호출합니다.
```
interface Vehicle {
    // 빈칸 채우기
}

class Car implements Vehicle {
    // 빈칸 채우기
}

public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Car();
        // 빈칸 채우기
    }
}

[출력 결과]
The car is driving.
```
#### 4. 주어진 제네릭 클래스와 메서드를 활용해 스택 자료구조를 구현하세요.

- Stack&lt;T&gt; 클래스는 push(T element)와 T pop() 메서드를 가집니다.
- push(T element)는 요소를 스택에 추가합니다.
- pop()은 가장 마지막에 추가된 요소를 제거하고 반환합니다.
- 메인 메서드에서 스택에 문자열을 추가하고 꺼내는 코드를 작성하세요.
```
import java.util.ArrayList;
import java.util.List;

class Stack<T> {
    private List<T> elements = new ArrayList<>();

    public void push(T element) {
        // 빈칸 채우기
    }

    public T pop() {
        // 빈칸 채우기
    }
}

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");
        System.out.println(stack.pop()); 
        System.out.println(stack.pop()); 
    }
}

[출력 결과]
World
Hello
```

### Spring Boot
#### 5 스프링 AOP를 활용하여 특정 메서드의 실행 시간을 측정하는 로직을 작성하세요.

- @LogExecutionTime라는 커스텀 어노테이션을 정의합니다.
- AOP를 사용하여 이 어노테이션이 붙은 메서드의 실행 시간을 측정하고 로그로 출력합니다.
- MyService 클래스의 process() 메서드에 @LogExecutionTime 어노테이션을 추가합니다.
- 빈칸을 채워 아래 코드를 완성하세요.

```
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LogExecutionTime { }

@Aspect
@Component
public class LoggingAspect {
    @Around("@annotation(LogExecutionTime)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        // 빈칸 채우기

        long finish = System.currentTimeMillis();
        System.out.println("Execution time of " + joinPoint.getSignature() + ": " + (finish - start) + " ms");

        return proceed;
    }
}

@Component
public class MyService {
    @LogExecutionTime
    public void process() {
        // 예제 로직: 1초 대기
        Thread.sleep(1000);
    }
}

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        MyService myService = context.getBean(MyService.class);
        myService.process();
    }
}

[출력 결과]
Execution time of process(): 1024 ms

```

## 프론트엔드 웹
### HTML
6. 
### CSS
7. 
### Javascript
8.
9.
10.
