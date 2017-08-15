$(function() {
	// Active Menu
	/*document.write(menu);*/
	switch (menu) {
	/*case 'About Us':
		$('#About').addClass('active');
		break;*/
	case 'All Products':
		$('#product').addClass('active');
		break;

	case 'home':
		$('#home').addClass('active');
		break;
	default:
		if (menu == "home") break;
		$('#product').addClass('active');
		$('#a_'+ menu).addClass('active');
		break;
	}
	
	//code for jquery dataTable
	//create a dataset
	var products = [
							['1','AbC'],
							['2','AbC'],
							['3','AbC'],
							['4','AbC'],
							['5','AbC'],
							['6','AbC'],
							['7','AbC'],
							['8','AbC'],
							['9','AbC'],
							['10','AbC']
							
						];
	var $table = $('#productListTable');
	
	//execute the below code only where we have this table
	
	if($table.length)
		{
		console.log('Inside the table!');
		
		$table.DataTable({
			lengthMenu: [[1,3,5,-1],['1 records','3 Records','5 Records','ALL']],
			pageLength:5,
		data: products
		})
		
		
		
		}

})