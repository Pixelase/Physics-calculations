package physics.client.console;

import physics.library.core.quantities.Modifiers;
import physics.library.core.quantities.TimeModifiers;
import physics.library.core.quantities.Unit;
import physics.library.core.quantities.impl.*;

public class ConsoleExample {

	public static void main(String[] args) {

		// Объявление и инициализация всех переменных для исходных физических
		// величин
		Acceleration acceleration = new Acceleration(5);
		Distance distance = new Distance(1000);
		Force force = new Force(25);
		Power power = new Power(10);
		Pulse pulse = new Pulse(15);
		Radius radius = new Radius(3);
		Work work = new Work(300);

		/*
		 * Можно инициализировать физические величины используя различные
		 * множители. Также множители можно сочетать, для сложных физических
		 * величин. Значение будет автоматически приведено к формату СИ.
		 */
		Mass mass = new Mass(5, new Unit(Modifiers.KILO));
		Time time = new Time(2, new Unit(TimeModifiers.HOURS));
		Velocity velocity = new Velocity(50, new Unit(Modifiers.KILO
				/ TimeModifiers.HOURS));

		/* Объявление всех результирующих величин */
		Acceleration resultAcceleration = new Acceleration();
		Distance resultDistance = new Distance();
		Force resultForce = new Force();
		Power resultPower = new Power();
		Pulse resultPulse = new Pulse();
		Radius resultRadius = new Radius();
		Work resultWork = new Work();
		Mass resultMass = new Mass();
		Time resultTime = new Time();
		Velocity resultVelocity = new Velocity();

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
		;
		System.out.println("Resulting velocity value : "
				+ resultVelocity.getValue());

		// Работа
		resultWork.compute(force, distance, degree);
		System.out.println("Resulting work value : " + resultWork.getValue());

	}
}
