package guru.qa.niffler.jupiter.annotation;

import guru.qa.niffler.enums.CurrencyValuesEnum;
import guru.qa.niffler.jupiter.extension.SpendExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@ExtendWith(SpendExtension.class)
public @interface Spending {
  String category();

  String description();

  double amount();

  CurrencyValuesEnum currency();
}