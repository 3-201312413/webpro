package org.zerock.web3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.ProductVO;

@Controller
public class SampleController5 {

	@RequestMapping("/doJSON")
	public @ResponseBody ProductVO doJSON(){
		
		ProductVO vo = new ProductVO("샘플",30000);
		
		return vo;
		
	}
}
