console.log('script.js loaded');

window.addEventListener('load', function(e) {
	init();
});

function init() {

	loadPeakTimes();
	console.log(Date.get(now));




}

function loadPeakTimes(){
//AJAX

	let xhr = new XMLHttpRequest();

	xhr.open('GET', "api/events");
	xhr.onreadystatechange = function(){
	if(xhr.readyState === 4){
		if(xhr.status === 200){
			let eventList = JSON.parse(xhr.responseText);
			console.log(eventList);
			displayEvents(eventList);
		}
	}	else{

	}
	};

xhr.send();



}

function displayEvents(eventList) {
	



}

function deleteEvent(){
let xhr = new XMLHttpRequest(id);

xhr.open('DEL', 'api/events/${id}');

xhr.onreadystatechange = function(){
	if(xhr.readyState === 4){
		if(xhr.status === 200){
			console.log("delete works");
		}
	}else{
		console.log("delted didn't work");
	}
}





xhr.send();
}