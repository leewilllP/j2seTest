package JDBC;

import OOP.Hero;

import java.util.List;

/*
* DataAccess Object
* 数据访问对象
 * */
public interface JDBCDAO{
    //增加
    public void add(Hero hero);
    //修改
    public void update(Hero hero);
    //删除
    public void delete(int id);
    //获取
    public Hero get(int id);
    //查询
    public List<Hero> list();
    //分页查询
    public List<Hero> list(int start, int count);

}
