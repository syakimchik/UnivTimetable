window.onload = init;

Date.prototype.getWeekNumber = function() {
	var fs = new Date(this.getFullYear() - (this.getMonth() > 7 ? 0 : 1), 8, 1);
	var r = Math.ceil((((this - fs) / 86400000)+fs.getDay()) / 7);
	while(r > 4) r -= 4;
	return r;
}

Date.prototype.getWeekDay = function() {
	var wd = this.getDay();
	return (wd == 0) ? 7 : wd;
}

function init() {

	window.bsuir921702 = {};
	window.bsuir921702.fullList = [[[],[],[],[],[],[]],[[],[],[],[],[],[]],[[],[],[],[],[],[]],[[],[],[],[],[],[]]];
	
	// ĞÀÑÏÈÑÀÍÈÅ
	// ïí
	addListItem([1,2,3,4], 1, 3, "ÑÎÈÂ", "ëê", "712", 5);
	addListItem([1,2,3,4], 1, 4, "ÎÑ", "ëê", "712", 5);
	addListItem([1,2], 1, 5, "İÏ", "ëğ", "319", 1);
	addListItem([3,4], 1, 5, "ÎÃÈÒ", "ëğ", "612", 5);
	addListItem([3,4], 1, 6, "ÎÑ", "ëğ", "607", 5);
	
	// âò
	addListItem([1,2,3,4], 2, 2, "Ôèç-ğà", "", "", 2);
	addListItem([1,3], 2, 3, "ÏÁÇ", "ëê", "114", 3);
	addListItem([2,4], 2, 3, "Ñîöèîëîãèÿ", "ëê", "114", 3);
	addListItem([1,2,3,4], 2, 4, "İÏ", "ëê", "114", 3);
	addListItem([1,2], 2, 5, "ÑÎÈÂ", "ëğ", "607", 5);
	
	// ñğ
	addListItem([1,2,3,4], 3, 1, "ÂÎÅÍÊÀ", "", "", 3);
	addListItem([1,2,3,4], 3, 2, "ÂÎÅÍÊÀ", "", "", 3);
	addListItem([1,2,3,4], 3, 3, "ÂÎÅÍÊÀ", "", "", 3);
	addListItem([1,2,3,4], 3, 4, "ÂÎÅÍÊÀ", "", "", 3);
	
	// ÷ò
	addListItem([1], 4, 2, "ÎÃÈÒ", "ïç", "612", 5);
	addListItem([2,4], 4, 2, "İÏ", "ïç", "318", 1);
	addListItem([1,2,3,4], 4, 3, "Ôèç-ğà", "", "", 2);
	addListItem([1,2,3,4], 4, 4, "ÎÃÈÒ", "ëê", "414", 5);
	addListItem([1,3], 4, 5, "ÎÃÈÒ", "ëê", "414", 5);
	addListItem([2,4], 4, 5, "Ñîöèîëîãèÿ", "ïç", "416", 4);
	
	// ïò
	addListItem([2,4], 5, 2, "ÏÁÇ", "ëğ", "612À", 5);
	addListItem([1,3], 5, 2, "ËÎÈÑ", "ïç", "612", 5);
	addListItem([1,2,3,4], 5, 3, "ÏÁÇ", "ëê", "414", 5);
	addListItem([1,2,3,4], 5, 4, "ËÎÈÑ", "ëê", "414", 5);
	addListItem([1,3], 5, 5, "ÏÁÇ", "ëğ", "612À", 5);
	
	// ñá
	addListItem([1,3], 6, 1, "ßÏÈÑ", "ëê", "414", 5);
	addListItem([1,3], 6, 2, "ßÏÈÑ", "ëê", "414", 5);
	addListItem([2,4], 6, 1, "ßÏÈÑ", "ëğ", "612", 5);
	addListItem([2,4], 6, 2, "ßÏÈÑ", "ëğ", "612", 5);
	addListItem([1], 6, 3, "ËÎÈÑ", "ïç", "409", 5);
	addListItem([1], 6, 4, "ËÎÈÑ", "ïç", "409", 5);
	
	document.getElementById('wn').onclick = function() {
		document.getElementById('weeks').style.display = 'block';
	}
	document.getElementById('wd').onclick = function() {
		document.getElementById('weekdays').style.display = 'block';
	}
	document.getElementById('weeks').onclick = function() {
		document.getElementById('weeks').style.display = 'none';
	}
	document.getElementById('weekdays').onclick = function() {
		this.style.display = 'none';
	}
	document.getElementById('w1').onclick = function() {
		setCurDate(1, window.bsuir921702.cur_weekDay);
		this.parentNode.style.display = 'none';
	}
	document.getElementById('w2').onclick = function() {
		setCurDate(2, window.bsuir921702.cur_weekDay);
		this.parentNode.style.display = 'none';
	}
	document.getElementById('w3').onclick = function() {
		setCurDate(3, window.bsuir921702.cur_weekDay);
		this.parentNode.style.display = 'none';
	}
	document.getElementById('w4').onclick = function() {
		setCurDate(4, window.bsuir921702.cur_weekDay);
		this.parentNode.style.display = 'none';
	}
	
	document.getElementById('wd1').onclick = function() {
		setCurDate(window.bsuir921702.cur_week, 1);
		this.parentNode.style.display = 'none';
	}
	document.getElementById('wd2').onclick = function() {
		setCurDate(window.bsuir921702.cur_week, 2);
		this.parentNode.style.display = 'none';
	}
	document.getElementById('wd3').onclick = function() {
		setCurDate(window.bsuir921702.cur_week, 3);
		this.parentNode.style.display = 'none';
	}
	document.getElementById('wd4').onclick = function() {
		setCurDate(window.bsuir921702.cur_week, 4);
		this.parentNode.style.display = 'none';
	}
	document.getElementById('wd5').onclick = function() {
		setCurDate(window.bsuir921702.cur_week, 5);
		this.parentNode.style.display = 'none';
	}
	document.getElementById('wd6').onclick = function() {
		setCurDate(window.bsuir921702.cur_week, 6);
		this.parentNode.style.display = 'none';
	}
	document.getElementById('wd7').onclick = function() {
		setCurDate(window.bsuir921702.cur_week, 7);
		this.parentNode.style.display = 'none';
	}

	updateDate();
	update();
	
}

function setCurDate(week, weekDay) {
	window.bsuir921702.list = updateList(week, weekDay);
	rebuild();
}

function update() {

	if(new Date().getDate() != window.bsuir921702.day) updateDate();
	rebuild();
	setTimeout('update();', 5000);

}

function rebuild() {

	var pair = 0;
	for(var w = 1; w <= 7; w++) {
		document.getElementById('wd' + w).className = 
		((w == window.bsuir921702.cur_weekDay) ? 'current ' : '') + ((w == window.bsuir921702.weekDay && window.bsuir921702.cur_week == window.bsuir921702.week) ? 'active' : '');
	}
	document.getElementById('wn').getElementsByTagName('b')[0].innerHTML = window.bsuir921702.cur_week;
	document.getElementById('wn').className = ((window.bsuir921702.cur_week == window.bsuir921702.week) ? 'week active' : 'week');
	document.getElementById('wd').getElementsByTagName('b')[0].innerHTML = document.getElementById('wd' + window.bsuir921702.cur_weekDay).getElementsByTagName('i')[0].innerHTML;
	document.getElementById('wd').className = ((window.bsuir921702.cur_weekDay == window.bsuir921702.weekDay) ? 'weekday active' : 'weekday');
	for(var x = 1; x <= 6; x++) {
		if(typeof(window.bsuir921702.list[x+10]) == 'object') {
			var tms = getTimesByPeriod(x+10);
			if(window.bsuir921702.cur_weekDay == window.bsuir921702.weekDay && window.bsuir921702.cur_week == window.bsuir921702.week) {
				var prd = getPeriodNum();
				document.getElementById('p' + x).className = (prd == (x+10) ? 'row active' : 'row');
			} else {
				document.getElementById('p' + x).className = 'row';
			}
			document.getElementById('p' + x).style.display = 'block';
			document.getElementById('p' + x).getElementsByTagName('span')[0].innerHTML = window.bsuir921702.list[x+10][0];
			document.getElementById('p' + x).getElementsByTagName('span')[1].innerHTML = tms[0] + ' - ' + tms[1];
			document.getElementById('p' + x).getElementsByTagName('span')[2].innerHTML = window.bsuir921702.list[x+10][1];
			document.getElementById('p' + x).getElementsByTagName('span')[3].innerHTML = (window.bsuir921702.list[x+10][2] == '' ? '' : window.bsuir921702.list[x+10][2] + '-' + window.bsuir921702.list[x+10][3]);
			pair++;
		} else {
			document.getElementById('p' + x).style.display = 'none';
		}
	}
	document.getElementById('day-off').style.display = (pair > 0) ? "none" : "block";
	
}

function printArray(name, arr, t) {

	var str = t + name + ' = [\n';
	for(x in arr) {
		str += ((typeof(arr[x]) == 'object') ? printArray(x, arr[x], t + '\t') : t + '\t' + x + ' = ' + arr[x] + '\n');
	}
	str += t + ']\n';
	return str;
	
}

function updateDate() {

	var dt = new Date();
	window.bsuir921702.day = dt.getDate();
	window.bsuir921702.period = getPeriodNum();
	window.bsuir921702.week = new Date(dt.getFullYear(), dt.getMonth(), dt.getDate()).getWeekNumber();
	window.bsuir921702.weekDay = dt.getWeekDay();
	window.bsuir921702.list = updateList(window.bsuir921702.week, window.bsuir921702.weekDay);
	for(var i = 1; i <= 4; i++) {
		document.getElementById('w' + i).style.color = (i == window.bsuir921702.week) ? '#28bf28' : '#ffffff';
	}

}

function addListItem(weeks, day, period, name, tp, aud, kor) {
	
	for(var w in weeks) {
		window.bsuir921702.fullList[weeks[w]-1][day-1][period+10] = [name, tp, aud, kor];
	}
	
}

function updateList(week, weekDay) {

	window.bsuir921702.cur_week = week;
	window.bsuir921702.cur_weekDay = weekDay;
	var list = Array();
	for(p in window.bsuir921702.fullList[week-1][weekDay-1]) {
		list[p] = window.bsuir921702.fullList[week-1][weekDay-1][p];
	}
	return list;

}

function getPeriodNum() {

	var dt = new Date();
	var h = dt.getHours();
	var m = dt.getMinutes();
	var tm = h*60 + m;
	
	if(tm < 480) return 10;
	if(tm >= 480 && tm < 575) return 11;	// 08:00 - 09:35
	if(tm >= 575 && tm < 585) return 21;
	if(tm >= 585 && tm < 680) return 12;	// 09:45 - 11:20
	if(tm >= 680 && tm < 700) return 22;
	if(tm >= 700 && tm < 795) return 13;	// 11:40 - 13:15
	if(tm >= 795 && tm < 805) return 23;
	if(tm >= 805 && tm < 900) return 14;	// 13:25 - 15:00
	if(tm >= 900 && tm < 920) return 24;
	if(tm >= 920 && tm < 1015) return 15;	// 15:20 - 16:55
	if(tm >= 1015 && tm < 1025) return 25;
	if(tm >= 1025 && tm < 1120) return 16;	// 17:05 - 18:40
	return 26;

}

function getTimesByPeriod(period) {

	var ret = Array();
	switch(Number(period)) {
	case 11: 
		ret[0] = '08:00';
		ret[1] = '09:35';
		break;
	case 12:
		ret[0] = '09:45';
		ret[1] ='11:20';
		break;
	case 13:
		ret[0] = '11:40';
		ret[1] ='13:15';
		break;
	case 14:
		ret[0] = '13:25';
		ret[1] ='15:00';
		break;
	case 15:
		ret[0] = '15:20';
		ret[1] ='16:55';
		break;
	case 16:
		ret[0] = '17:05';
		ret[1] ='18:40';
		break;
	}
	return ret;

}