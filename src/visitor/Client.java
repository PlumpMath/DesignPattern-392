package visitor;

import java.util.List;

/**
 * 访问者模式
 * @author Jianyong
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Element> list = ObjectStructure.getList();
		for (Element e:list){
			e.accept(new Visitor());
		}
	}

}
