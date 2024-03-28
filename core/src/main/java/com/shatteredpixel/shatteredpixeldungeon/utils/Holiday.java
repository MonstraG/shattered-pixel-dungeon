/*
 * Pixel Dungeon
 * Copyright (C) 2012-2015 Oleg Dolya
 *
 * Shattered Pixel Dungeon
 * Copyright (C) 2014-2024 Evan Debenham
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.shatteredpixel.shatteredpixeldungeon.utils;

import java.util.Calendar;
import java.util.GregorianCalendar;

public enum Holiday {

	NONE,

	//TODO many of these don't actually do anything atm
	LUNAR_NEW_YEAR,         //Varies, sometime in late Jan to Late Feb              (7 days)
	APRIL_FOOLS,            //April 1st, can override easter                        (1 day)
	EASTER,                 //Varies, sometime in Late Mar to Late Apr              (6-7 days)
	//Nothing in May
	PRIDE,                  //Jun 24th to Jun 30th                                  (7 days)
	//Nothing in Jul
	SHATTEREDPD_BIRTHDAY,   //Aug 1st to Aug 7th                                    (7 days)
	//Nothing in Sept
	HALLOWEEN,              //Oct 24th to Oct 31st                                  (7 days)
	//Nothing in Nov
	PD_BIRTHDAY,            //Dec 1st to Dec 7th                                    (7 days)
	WINTER_HOLIDAYS,        //Dec 15th to Dec 26th                                  (12 days)
	NEW_YEARS;              //Dec 27th to Jan 2nd                                   (7 days)

	//total of 61-62 festive days each year, mainly concentrated in Late Oct to Early Feb

	//we cache the holiday here so that holiday logic doesn't suddenly shut off mid-game
	//this gets cleared on game launch (of course), and whenever leaving a game scene
	private static Holiday cached;

	public static void clearCachedHoliday() {
		cached = null;
	}

	public static Holiday getCurrentHoliday() {
		if (cached == null) {
			cached = getHolidayForDate((GregorianCalendar) GregorianCalendar.getInstance());
		}
		return cached;
	}

	//requires a gregorian calendar
	public static Holiday getHolidayForDate(GregorianCalendar cal) {

		//legacy holiday logic from late 2016 to early 2024
		//only halloween and winter holidays, and they had longer dates determined by week of month
		//TODO maybe remove this after early 2024 passes?
		// Do we really care about historical accuracy for folks who turn their system date back?
		if (cal.get(Calendar.YEAR) < 2024
				|| (cal.get(Calendar.YEAR) == 2024 && cal.get(Calendar.DAY_OF_YEAR) <= 10)) {
			switch (cal.get(Calendar.MONTH)) {
				case Calendar.JANUARY:
					if (cal.get(Calendar.WEEK_OF_MONTH) == 1)
						return WINTER_HOLIDAYS;
					break;
				case Calendar.OCTOBER:
					if (cal.get(Calendar.WEEK_OF_MONTH) >= 2)
						return HALLOWEEN;
					break;
				case Calendar.NOVEMBER:
					if (cal.get(Calendar.DAY_OF_MONTH) == 1)
						return HALLOWEEN;
					break;
				case Calendar.DECEMBER:
					if (cal.get(Calendar.WEEK_OF_MONTH) >= 3)
						return WINTER_HOLIDAYS;
					break;
			}
		}

		//Lunar New Year
		if (isLunarNewYear(cal.get(Calendar.YEAR),
				cal.get(Calendar.DAY_OF_YEAR))) {
			return LUNAR_NEW_YEAR;
		}

		//April Fools
		if (cal.get(Calendar.MONTH) == Calendar.APRIL
				&& cal.get(Calendar.DAY_OF_MONTH) == 1) {
			return APRIL_FOOLS;
		}

		//Easter
		if (isEaster(cal.get(Calendar.YEAR),
				cal.get(Calendar.DAY_OF_YEAR),
				cal.getActualMaximum(Calendar.DAY_OF_YEAR) == 366)) {
			return EASTER;
		}

		//Pride
		if (cal.get(Calendar.MONTH) == Calendar.JUNE
				&& cal.get(Calendar.DAY_OF_MONTH) >= 24) {
			return PRIDE;
		}

		//Shattered's Birthday
		if (cal.get(Calendar.MONTH) == Calendar.AUGUST
				&& cal.get(Calendar.DAY_OF_MONTH) <= 7) {
			return SHATTEREDPD_BIRTHDAY;
		}

		//Halloween
		if (cal.get(Calendar.MONTH) == Calendar.OCTOBER
				&& cal.get(Calendar.DAY_OF_MONTH) >= 24) {
			return HALLOWEEN;
		}

		//Pixel Dungeon's Birthday
		if (cal.get(Calendar.MONTH) == Calendar.DECEMBER
				&& cal.get(Calendar.DAY_OF_MONTH) <= 7) {
			return PD_BIRTHDAY;
		}

		//Winter Holidays
		if (cal.get(Calendar.MONTH) == Calendar.DECEMBER
				&& cal.get(Calendar.DAY_OF_MONTH) >= 15
				&& cal.get(Calendar.DAY_OF_MONTH) <= 26) {
			return WINTER_HOLIDAYS;
		}

		//New Years
		if ((cal.get(Calendar.MONTH) == Calendar.DECEMBER && cal.get(Calendar.DAY_OF_MONTH) >= 27)
				|| (cal.get(Calendar.MONTH) == Calendar.JANUARY && cal.get(Calendar.DAY_OF_MONTH) <= 2)) {
			return NEW_YEARS;
		}

		return NONE;
	}

	//has to be hard-coded on a per-year basis =S
	public static boolean isLunarNewYear(int year, int dayOfYear) {
		int lunarNewYearDayOfYear = switch (year) {
			//yes, I really did hardcode this all the way to 2100
			default -> 31 + 5;     //defaults to February 5th
			case 2024 -> 31 + 10;    //February 10th
			case 2025 -> 29;       //January 29th
			case 2026 -> 31 + 17;    //February 17th
			case 2027 -> 31 + 6;     //February 6th
			case 2028 -> 26;       //January 26th
			case 2029 -> 31 + 13;    //February 13th
			case 2030 -> 31 + 3;     //February 3rd
			case 2031 -> 23;       //January 23rd
			case 2032 -> 31 + 11;    //February 11th
			case 2033 -> 31;       //January 31st
			case 2034 -> 31 + 19;    //February 19th
			case 2035 -> 31 + 8;     //February 8th
			case 2036 -> 28;       //January 28th
			case 2037 -> 31 + 15;    //February 15th
			case 2038 -> 31 + 4;     //February 4th
			case 2039 -> 24;       //January 24th
			case 2040 -> 31 + 12;    //February 12th
			case 2041 -> 31 + 1;     //February 1st
			case 2042 -> 22;       //January 22nd
			case 2043 -> 31 + 10;    //February 10th
			case 2044 -> 30;       //January 30th
			case 2045 -> 31 + 17;    //February 17th
			case 2046 -> 31 + 6;     //February 6th
			case 2047 -> 26;       //January 26th
			case 2048 -> 31 + 14;    //February 14th
			case 2049 -> 31 + 2;     //February 2nd
			case 2050 -> 23;       //January 23rd
			case 2051 -> 31 + 11;    //February 11th
			case 2052 -> 31 + 1;     //February 1st
			case 2053 -> 31 + 19;    //February 19th
			case 2054 -> 31 + 8;     //February 8th
			case 2055 -> 28;       //January 28th
			case 2056 -> 31 + 15;    //February 15th
			case 2057 -> 31 + 4;     //February 4th
			case 2058 -> 24;       //January 24th
			case 2059 -> 31 + 12;    //February 12th
			case 2060 -> 31 + 2;     //February 2nd
			case 2061 -> 21;       //January 21st
			case 2062 -> 31 + 9;     //February 9th
			case 2063 -> 29;       //January 29th
			case 2064 -> 31 + 17;    //February 17th
			case 2065 -> 31 + 5;     //February 5th
			case 2066 -> 26;       //January 26th
			case 2067 -> 31 + 14;    //February 14th
			case 2068 -> 31 + 3;     //February 3rd
			case 2069 -> 23;       //January 23rd
			case 2070 -> 31 + 11;    //February 11th
			case 2071 -> 31;       //January 31st
			case 2072 -> 31 + 19;    //February 19th
			case 2073 -> 31 + 7;     //February 7th
			case 2074 -> 27;       //January 27th
			case 2075 -> 31 + 15;    //February 15th
			case 2076 -> 31 + 5;     //February 5th
			case 2077 -> 24;       //January 24th
			case 2078 -> 31 + 12;    //February 12th
			case 2079 -> 31 + 2;     //February 2nd
			case 2080 -> 22;       //January 22nd
			case 2081 -> 31 + 9;     //February 9th
			case 2082 -> 29;       //January 29th
			case 2083 -> 31 + 17;    //February 17th
			case 2084 -> 31 + 6;     //February 6th
			case 2085 -> 26;       //January 26th
			case 2086 -> 31 + 14;    //February 14th
			case 2087 -> 31 + 3;     //February 3rd
			case 2088 -> 24;       //January 24th
			case 2089 -> 31 + 10;    //February 10th
			case 2090 -> 30;       //January 30th
			case 2091 -> 31 + 18;    //February 18th
			case 2092 -> 31 + 7;     //February 7th
			case 2093 -> 27;       //January 27th
			case 2094 -> 31 + 15;    //February 15th
			case 2095 -> 31 + 5;     //February 5th
			case 2096 -> 25;       //January 25th
			case 2097 -> 31 + 12;    //February 12th
			case 2098 -> 31 + 1;     //February 1st
			case 2099 -> 21;       //January 21st
			case 2100 -> 31 + 9;     //February 9th
		};

		//celebrate for 7 days total, with Lunar New Year on the 5th day
		return dayOfYear >= lunarNewYearDayOfYear - 4 && dayOfYear <= lunarNewYearDayOfYear + 2;
	}

	//has to be algorithmically computed =S
	public static boolean isEaster(int year, int dayOfYear, boolean isLeapYear) {
		//if we're not in March or April, just skip out of all these calculations
		if (dayOfYear < 59 || dayOfYear > 121) {
			return false;
		}

		//Uses the Anonymous Gregorian Algorithm
		int a = year % 19;
		int b = year / 100;
		int c = year % 100;
		int d = b / 4;
		int e = b % 4;
		int f = (b + 8) / 25;
		int g = (b - f + 1) / 3;
		int h = (a * 19 + b - d - g + 15) % 30;
		int i = c / 4;
		int k = c % 4;
		int l = (32 + 2 * e + 2 * i - h - k) % 7;
		int m = (a + h * 11 + l * 22) / 451;
		int n = (h + l - m * 7 + 114) / 31;
		int o = (h + l - m * 7 + 114) % 31;

		int easterDayOfYear = 0;

		if (n == 3) {
			easterDayOfYear += 59; //march
		} else {
			easterDayOfYear += 90; //april
		}

		if (isLeapYear) {
			easterDayOfYear += 1; //add an extra day to account for February 29th
		}

		easterDayOfYear += (o + 1); //add day of month

		//celebrate for 7 days total, with Easter Sunday on the 5th day
		return dayOfYear >= easterDayOfYear - 4 && dayOfYear <= easterDayOfYear + 2;
	}

}
