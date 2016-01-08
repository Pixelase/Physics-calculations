package physics.client.console;

import physics.library.core.quantity.impl.*;
import physics.library.core.quantity.unit.Unit;
import physics.library.core.quantity.unit.prefix.BasePrefix;
import physics.library.core.quantity.unit.prefix.TimePrefix;

public class ConsoleExample {

    public static void main(String[] args) {

        // Объявление и инициализация всех переменных для исходных физических
        // величин
        final Acceleration acceleration = new Acceleration(5);
        final Distance distance = new Distance(1000);
        final Force force = new Force(25);
        final Power power = new Power(10);
        final Pulse pulse = new Pulse(15);
        final Radius radius = new Radius(3);
        final Work work = new Work(300);

		/*
         * Можно инициализировать физические величины используя различные
		 * множители. Также множители можно сочетать, для сложных физических
		 * величин. Значение будет автоматически приведено к формату СИ.
		 */
        final Unit massUnit = Unit.newBuilder().setUpperPrefixes(BasePrefix.KILO).build();
        final Mass mass = new Mass(5, massUnit);

        final Unit velocityUnit = Unit.newBuilder()
                .setUpperPrefixes(BasePrefix.KILO)
                .setLowerPrefixes(TimePrefix.HOURS)
                .build();
        final Velocity velocity = new Velocity(50, velocityUnit);

        /*
         * Возможен и такой вариант, то есть задание модификатора вручную в виде числа;
         */
        final Time time = new Time(2, new Unit(TimePrefix.HOURS.getValue()));



		/* Объявление всех результирующих величин */
        final Acceleration resultAcceleration = new Acceleration();
        final Distance resultDistance = new Distance();
        final Force resultForce = new Force();
        final Power resultPower = new Power();
        final Pulse resultPulse = new Pulse();
        final Radius resultRadius = new Radius();
        final Work resultWork = new Work();
        final Mass resultMass = new Mass();
        final Time resultTime = new Time();
        final Velocity resultVelocity = new Velocity();

		/*
         * Пример использования некоторых встроенных методов для вычисления
		 * значения физических величин.
		 */

        // Ускорение
        resultAcceleration.compute(force, mass);
        System.out.println("Resulting acceleration value : "
                + resultAcceleration.getValue());

        // Путь
        double degree = 45;
        resultDistance.compute(work, force, degree);
        System.out.println("Resulting distance value : "
                + resultDistance.getValue());

        // Сила
        resultForce.compute(mass, acceleration);
        System.out.println("Resulting force value : " + resultForce.getValue());

        // Масса
        resultMass.compute(pulse, velocity);
        System.out.println("Resulting mass value : " + resultMass.getValue());

        // Мощность
        resultPower.compute(work, time);
        System.out.println("Resulting power value : " + resultPower.getValue());

        // Импульс
        resultPulse.compute(mass, velocity);
        System.out.println("Resulting pulse value : " + resultPulse.getValue());

        // Радиус
        resultRadius.compute(velocity, acceleration);
        System.out.println("Resulting radius value : " + resultRadius.getValue());

        // Время
        resultTime.compute(work, power);
        System.out.println("Resulting time value : " + resultTime.getValue());

        // Скорость
        resultVelocity.compute(acceleration, radius);
        System.out.println("Resulting velocity value : "
                + resultVelocity.getValue());

        // Работа
        resultWork.compute(force, distance, degree);
        System.out.println("Resulting work value : " + resultWork.getValue());

    }
}
