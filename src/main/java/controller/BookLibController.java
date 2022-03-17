package controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import errors.NotFoundException;
import model.BookLibDAO;
import model.BookLibVO;
import model.BookSearch;

@Controller
@RequestMapping("/books")
public class BookLibController {
	private BookLibDAO booklibDAO;
	
	public void setBooklibDAO(BookLibDAO booklibDAO) {
		this.booklibDAO=booklibDAO;
	}
	
	
	@RequestMapping("/list")
	public String list(@ModelAttribute("book")BookLibVO vo,Model model) {
		List<BookLibVO> books = booklibDAO.selectAll();
		model.addAttribute("books", books);
		
		return "book_list";
	}
	
	@RequestMapping("/read/{bookisbn}")
	public String read(@PathVariable("bookisbn")Long bookisbn, Model model, HttpServletRequest req) throws NotFoundException {
		BookLibVO books = booklibDAO.selectonelist(bookisbn);
		if(books == null) {
			throw new NotFoundException();
		}
		String path = req.getSession().getServletContext().getRealPath("/");
		model.addAttribute("path", path);
		System.out.println("값이 보내짐" + books);
		model.addAttribute("books",books);
		return "book_detail";
	}
	

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(@ModelAttribute("search")BookSearch search, Model model) {
		System.out.println("검색op: " + search.getOp()+"검색밸류 : " + search.getKeyword());
		if(search.getKeyword() != null && search.getOp() != null) {
		List<BookLibVO> books = booklibDAO.selectsearch(search.getKeyword(),search.getOp());
		model.addAttribute("books", books);
		}
		return "book_list";
	
	}
	@ExceptionHandler(NotFoundException.class)
	public String errors() {
		return "errors";
	}
}
