/**
 * 格式化日期选择框
 * @param s
 * @returns {Date}
 */
function myparser(s){
    if (!s) return new Date();
    var ss = (s.split('-'));
    var y = parseInt(ss[0],10);
    var m = parseInt(ss[1],10);
    var d = parseInt(ss[2],10);
    if (!isNaN(y) && !isNaN(m) && !isNaN(d)){
        return new Date(y,m-1,d);
    } else {
        return new Date();
    }
}

function myformatter(date){
    var y = date.getFullYear();
    var m = date.getMonth()+1;
    var d = date.getDate();
    return y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d);
}

function formatDate(val) {

    var datetime;
    if (val != null) {
        var year = parseInt(val.year) + 1900;
        var month = (parseInt(val.month) + 1);
        month = month > 9 ? month : ('0' + month);
        var day = parseInt(val.date);
        day = day > 9 ? day: ('0' + day);
        var hours = parseInt(val.hours);
        hours = hours > 9 ? hours : ('0' + hours);
        var minutes = parseInt(val.minutes);
        minutes = minutes > 9 ? minutes : ('0' + minutes);
        var seconds = parseInt(val.seconds);
        seconds = seconds > 9 ? seconds : ('0' + seconds);
        datetime= year + '-' + month + '-' + day + ' ' + hours + ':' + minutes
            + ':' + seconds;
    } else {
        var today = new Date();
        var year = parseInt(today.getFullYear());
        var month = (parseInt(today.getMonth()) + 1);
        month = month > 9 ? month : ('0' + month);
        var day = parseInt(today.getDate());
        day = day > 9 ? day: ('0' + day);
        var hours = parseInt(today.getHours());
        hours = hours > 9 ? hours : ('0' + hours);
        var minutes = parseInt(today.getMinutes());
        minutes = minutes > 9 ? minutes : ('0' + minutes);
        var seconds = parseInt(today.getSeconds());
        seconds = seconds > 9 ? seconds : ('0' + seconds);
        datetime= year + '-' + month + '-' + day + ' ' + hours + ':' + minutes
            + ':' + seconds;
    }
    return datetime;
}
