// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarusuarios();
  $('#usuarios').DataTable();
});

async function cargarusuarios(){


  const rawResponse = await fetch('usuario/2015', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });
  const content = await rawResponse.json();

  console.log(content);





};
