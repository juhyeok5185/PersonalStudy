'use strict'
let list = [];
$(document).ready(function () {
$('#comment-submit').click(function(){
  const board = {
    content:$('#comment').val(),
    date:$('#input-date').val()
  }
  list.push(board);
  $('#comment').val(" ");
  $('#content').text(list);
})


});