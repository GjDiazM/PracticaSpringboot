// Call the dataTables jQuery plugin
$(document).ready(function() {
    cargarusuarios();
  $('#usuarios').DataTable();
});

async function cargarusuarios(){


  const rawResponse = await fetch('usuarios', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });
  const content = await rawResponse.json();

  console.log(content);
  let listadohtml='';
  for (let users of content){
  let usersHTML='<tr><td>'+users.id+'</td><td>'+users.nombre+'  '+users.apellido+'</td><td>'+users.telefono+'</td><td>'+users.email+'</td><td>'+users.ciudad+'</td><td><a href="#" class="btn btn-danger btn-circle btn-sm"> <i class="fas fa-trash"></i> </a></td></tr>'

    listadohtml +=usersHTML;
  }




  document.querySelector('#usuarios tbody').outerHTML= listadohtml;






};
