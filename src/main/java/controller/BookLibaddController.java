package controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import model.AddCommand;
import model.BookLibDAO;

@Controller
@RequestMapping("/books/add")
public class BookLibaddController {
	private BookLibDAO booklibDAO;
	
	public void setBooklibDAO(BookLibDAO booklibDAO) {
		this.booklibDAO=booklibDAO;
	}
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String add(@ModelAttribute("add")AddCommand ac, Model model) {
		
		return "book_reg_form";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String add1(@ModelAttribute("add")AddCommand ac, @RequestParam("file") MultipartFile file,
			RedirectAttributes redirect, HttpServletRequest req, Error errors) throws IOException{
		try {
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		//각 개체를 고유하게 식별 가능한 값을 말한다.영숫자 문자 (대시 또는 다른 특수 기호 없음)에서만 
		//무작위 문자열을 생성하는 효율적인 방법을 찾고 있습니다.( - 을 "" 으로 생략한다.)
		String name = uuid + file.getOriginalFilename();
		String originalname = file.getOriginalFilename();
		ac.setOriginalimage(originalname);
		String filepath = req.getSession().getServletContext().getRealPath("/") + "fileUpload/upload";
		File comverFile = new File(filepath, name);
		//file 을 생성할 때 경로와 중복을 피하기 위해 uuid(랜덤 문자열) + 파일명으로 파일객체를 생성한다.
		file.transferTo(comverFile);//위에서 만든 경로와 파일을 이용하여 업로드를 처리한다.
		String msg = file.getOriginalFilename() + "파일 업로드 성공";
		ac.setImage(name);
		redirect.addFlashAttribute("msg",msg); 
		//리다이렉트로 요청을 하면 key 값으로 msg value 값은 위에 정의한 msg 값이 들어간다.
		int books = booklibDAO.insert(ac);
		if (books != 0) {
			System.out.println("들어감");
		}else {
			System.out.println("안 들어감");
		}
		return "redirect:/books/list";
		}catch (Exception e) {
			return "sqlerrors";
		}
	}
}
