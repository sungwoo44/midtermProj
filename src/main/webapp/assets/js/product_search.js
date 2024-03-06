const search = function() {

	const category = document.querySelector('select[name="category"]')
	const keyword = document.querySelector('input[name="keyword"]')
	const from = document.querySelector('input[name="from"]')
	const to = document.querySelector('input[name="to"]')
	const jsObj = {
		keyword: keyword.length == 0 ? undefined : keyword.value,
		category: category.length == 0 ? undefined : category.value,
		from: from.length == 0 ? undefined : from.value,
		to: to.length == 0 ? undefined : to.value
	}
	console.log('자바스크립트 객체 :', jsObj)
	const jsonData = JSON.stringify(jsObj)

	const xhr = new XMLHttpRequest()         //비동기 통신 객체 생성
	xhr.open('PUT', 'api/product/list')         //전송 보낼 준비 (url과 method)
	//전송할 데이터의 형식을 요청 헤더로 전달합니다.
	xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8")
	xhr.send(jsonData)                     //요청 전송
	xhr.onload = function() {               // 요청에 대한 응답받았을 때 onload 이벤트 생깁니다. onlaod 핸들러 함수
		if (xhr.status === 200 || xhr.status === 201) {         //reayState 가 DONE
			console.log("요청 응답 :", xhr.response)         //response 는 응답받은 내용을 저장한 프로퍼티
			const arr = JSON.parse(xhr.response)      //응답받은 json 문자열을 자바스크립트 객체의 배열로 변환(역직렬화)
			console.log("get api/product/list", arr)

			//json 문자열 응답을 자바스크립트 배열 객체로 변환하여 요소하나씩을 ele 변수에 대입한 후
			//화면에값을 태그요소에 출력하는 코드
			const list = document.querySelector('#list')
			list.innerHTML = ''
			arr.forEach((ele, index) => {
				const li = document.createElement('li')
				const ul = document.createElement('ul')
				ul.className = 'row'
				ul.innerHTML =
					`<li>${index + 1}</li>
            <li>${ele.pcode}</li>
            <li>${ele.category}</li>
            <li>${ele.pname}</li>
            <li style=\"text-align: right;\">${ele.price.toLocaleString('ko-KR')}</li>`
				li.appendChild(ul)
				list.appendChild(li)

			})


		} else {
			console.error('오류1', xhr.status)
			console.error('오류2', xhr.response)
		}
	}


}
document.querySelector('#search').addEventListener('click', search)
