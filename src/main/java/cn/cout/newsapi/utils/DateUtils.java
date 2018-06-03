package cn.cout.newsapi.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static String getLong2DateTimeFormat(Long currents, String dateformat) {
		SimpleDateFormat sfd = new SimpleDateFormat(dateformat);
		Date date = new Date(currents);
		return sfd.format(date);
	}
}
