package nocommit_all;

public class NoCommit_1 {

	public static void main(String[] args) {
	/*
		1. NoCommit_1.java 파일을 생성하기 이전부터
		  .gitignore 파일속에 /MyGitExample/src/nocommit_all/ 이라고 폴더를 등록해 둔 상태 입니다.
	
		2. NoCommit_1.java 파일을 생성하여 내용에 변경을 하고 저장하더라도
		   /MyGitExample/src/nocommit_all/ 폴더속에 있는 파일이므로 
		   Unstaged Changes(관리를 받지 않는 단계) 와 Staged Changes(관리를 받는 단계)에 등록이 되지 않으므로  
		   Commit 대상에서 빠지게 됩니다. 
		      그러므로 이파일은 Push 대상에서도 빠지게 됩니다.
		      
		3. Project Explorer 에 가보면  NoCommit_1.java 파일의 아이콘에 아무런 딱지가 없는것으로 보이는데
		      이모양이 ignored 이다.       
	*/
		System.out.println("== NoCommit_1.java 파일입니다 =="); 
	}

}
