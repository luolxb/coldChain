package com.coldchain.common.utils;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

/**
 * Ehcache 工具类
 * 创建日期：2019年11月20
 */
public class EhcacheUtils {

    private CacheManager cacheManager;
    private static final String path = "/ehcache/ehcache-shiro.xml";//ehcache的配置文件的路径
    private static EhcacheUtils ehcache;

    /**
     * 创建缓存对象
     *
     * @param path
     */
    private EhcacheUtils(String path) {
        cacheManager = CacheManager.create(getClass().getResource(path));
    }

    public static EhcacheUtils getInstance() {
        if (ehcache == null) {
            ehcache = new EhcacheUtils(path);
        }
        return ehcache;
    }

    /**
     * 缓存一个对象
     *
     * @param cacheName
     * @param key
     * @param value
     */
    public void putCache(String cacheName, Object key, Object value) {
        Cache cache = cacheManager.getCache(cacheName);
        Element element = new Element(key, value);
        cache.put(element);
    }

    /**
     * 获取一个缓存对象
     *
     * @param cacheName
     * @param key
     * @return
     */
    public String getCache(String cacheName, String key) {
        Cache cache = cacheManager.getCache(cacheName);
        Element element = cache.get(key);
        return element == null ? null : element.getObjectValue().toString();
    }

    public Cache getCache(String cacheName) {
        return cacheManager.getCache(cacheName);
    }

    /**
     * 移除一个缓存对象
     *
     * @param cacheName
     * @param key
     */
    public void removeCache(String cacheName, String key) {
        Cache cache = cacheManager.getCache(cacheName);
        cache.remove(key);
    }
}
