console.log('script.js loaded');

window.addEventListener('load', function(e) {
	init();
});

function init() {

	loadPeakTimes();
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
	//DOM

console.log('displayEvents called');

}

function deleteEvent(){

}




