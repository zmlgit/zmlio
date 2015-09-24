/**
 * Project Name:cdms-common
 * File Name:DistrictUtils.java
 * Package Name:com.qtong.healthcare.cdms.common.utils
 * Date:2015年1月5日上午11:22:41
 * Copyright (c) 2015, 中移全通系统集成有限公司 All Rights Reserved.
 *
 */

package cn.zmlio.utils;

import java.io.IOException;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * ClassName:DistrictUtils <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015年1月5日 上午11:22:41 <br/>
 * 
 * @author ZML
 * @version
 * @since JDK 1.6
 * @see
 */
public class DistrictUtils {
	private static final String URL = "http://www.xzqh.org/html/sitemap.html";

	public static Map<String, Map<String, Set<String>>> getNewestCounties()
			throws IOException {

		Document document = Jsoup.connect(URL).get();

		Element site_map = document.select("#site_map").first();
		String[] stringList = site_map.html().split("\n");
		String provincestmp = null;
		String citytmp = null;
		List<String> lines = new ArrayList<String>();
		for (String string : stringList) {
			if (string.contains("中国")) {
				continue;
			} else if (string.contains("h3")) {
				Document h3 = Jsoup.parse(string);
				provincestmp = h3.select("a").first().html();
				citytmp = provincestmp;
			} else {
				if (string.contains("<ul></ul>")) {
					continue;
				} else if (string.contains("<ul>") || string.contains("</ul>")) {
					continue;
				}
				if (string.contains("span")) {
					Document span = Jsoup.parse(string);
					Elements a = span.select("span").first().select("a");
					if (a == null || a.size() == 0) {
						citytmp = span.select("span").first().html();
					} else {
						citytmp = span.select("span").first().select("a")
								.html();
					}

				} else {
					Document li = Jsoup.parse(string);
					Elements a = li.select("a");
					String text = null;
					if (a == null || a.size() == 0) {
						text = li.select("li").first().html();
					} else {
						text = li.select("a").first().html();
					}
					// System.out.println();
					lines.add(provincestmp + ":" + citytmp + ":" + text);
				}
			}
		}
		Map<String, Map<String, Set<String>>> provinces = new TreeMap<>();
		Map<String, Set<String>> citys = new TreeMap<String, Set<String>>();
		Set<String> stricts = new HashSet<>();
		provincestmp = null;
		citytmp = null;
		for (String line : lines) {
			String[] district = line.split(":");
			if (district[0].equals(provincestmp)) {
				if (district[1].equals(citytmp)) {
					stricts.add(district[2]);
				} else {
					stricts = new HashSet<String>();
					citytmp = district[1];
					citys.put(district[1], stricts);
					stricts.add(district[2]);
				}
			} else {
				provincestmp = district[0];
				citytmp = district[1];
				citys = new HashMap<String, Set<String>>();
				stricts = new HashSet<String>();
				stricts.add(district[2]);
				citys.put(district[1], stricts);
				provinces.put(district[0], citys);
			}
		}
		StringBuffer sb = new StringBuffer();

		for (String prname : provinces.keySet()) {
			sb.append("#").append(prname).append("$");
			Map<String, Set<String>> cmap = provinces.get(prname);
			for (String c : cmap.keySet()) {
				// Map
				if (sb.charAt(sb.length() - 1) != '$') {
					sb.append("|");
				}
				sb.append(c);
				//
				for (String d : cmap.get(c)) {
					sb.append("," + d);
				}
			}

		}
		return provinces;
	}
    public static void main(String...args) throws IOException {
        System.out.print(getNewestCounties().toString());
    }
}
