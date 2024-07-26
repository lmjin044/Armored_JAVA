<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <link rel="stylesheet" href ="boardWrite.css" >


<form method="post" action="boardSave.jsp" enctype="multipart/form-data">
<!-- enctype = 인코딩 타입 : 파일을 서버로 보낼 수 있도록 변환시켜줌 -->
	<div id="wirteInput">
		<label>제목</label>
		<input type="text" name="title" id="title">
	</div>
	<div id="wirteInput">
		<label>이미지</label>
		<input type="file" name="boardImg" id="boardImg" accept=".jpg, .png, .jpeg, .gif">
		<!-- 만약 확장자 카테고리 내 모든 확장자를 적용 하려면 "image/*", "video/*" 이런식으로
		단 진짜 제한 두려면 자바스크립트로 해야 함.  -->
	</div>
	<div id="wirteInput">
		<label>내용</label>
		<textarea name="content" id="content"></textarea>
	</div>
	<button>작성</button>
</form>

