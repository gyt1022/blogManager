package com.guo.service;import com.guo.entity.BlogUserExample;import com.guo.entity.BlogUserWithBLOBs;import java.util.List;import java.util.Map;/** * @author guoyutao * @date 2019/04/07 */public interface IUserService {    BlogUserWithBLOBs queryById(String userId);    List<BlogUserWithBLOBs> queryAll(BlogUserExample userExample);    void updateByExample(BlogUserWithBLOBs userWithBLOBs,BlogUserExample userExample);}