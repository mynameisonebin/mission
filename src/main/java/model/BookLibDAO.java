package model;

import java.util.List;

public interface BookLibDAO {
	public int insert(AddCommand ac);
	public List<BookLibVO> selectAll();
	public List<BookLibVO> selectsearch(String search, String op);
	public BookLibVO selectonelist(Long bookisbn);
	
}
