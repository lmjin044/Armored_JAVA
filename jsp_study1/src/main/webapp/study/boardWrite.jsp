<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<form method="post" action="boardSave.jsp">
	<div id="wirteInput">
		<label>제목</label>
		<input type="text" name="title" id="title">
	</div>
	<div id="wirteInput">
		<label>이미지</label>
		<input type="file" name="" id="">
	</div>
	<div id="wirteInput">
		<label>내용</label>
		<textarea name="content" id="content"></textarea>
	</div>
	<button>작성</button>
</form>

