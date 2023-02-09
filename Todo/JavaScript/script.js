'use strict'
let list = [];
let num = 0;



$(document).ready(function () {
$('#btn-submit').click(function(){
  const board = {
    content:$('#comment').val(),
    date:$('#input-date').val()
  }
  list.push(board);
  $('#comment').val(" ");
  $('#tbody').append("<tr>");
  $('#tbody').append("<td><a href='#' id='textdeco'>"+ list[num].content +"</a></td>");
  $('#tbody').append("<td>"+ list[num].date +"</td>");
  $('#tbody').append("<td> <input class='form-check-input' type='checkbox' id='check'></td>");
  $('#tbody').append("</tr>");
  num++;
})


});