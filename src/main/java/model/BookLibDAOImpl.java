package model;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

public class BookLibDAOImpl implements BookLibDAO{
	private SqlSessionTemplate sqlSessionTemplate;
	
	public BookLibDAOImpl(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate=sqlSessionTemplate;
	}
	@Override
	public int insert(AddCommand ac) {
		return sqlSessionTemplate.insert("insert", ac);
	}

	@Override
	public List<BookLibVO> selectAll() {
		return sqlSessionTemplate.selectList("selectAll");
	}

	
	@Override
	public BookLibVO selectonelist(Long bookisbn) {
		return sqlSessionTemplate.selectOne("selectBynumber" ,bookisbn);
	}
	@Override
	public List<BookLibVO> selectsearch(String search, String op) {
		HashMap<String , String> map = new HashMap<String , String>();
		map.put("search",search);
		map.put("op", op);
		return sqlSessionTemplate.selectList("selectsearch", map);
	}

}
