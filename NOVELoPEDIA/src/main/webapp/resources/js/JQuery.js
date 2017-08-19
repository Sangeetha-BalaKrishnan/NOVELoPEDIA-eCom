$(function() {
	// Active Menu
	/* document.write(menu); */
	switch (menu) {
	/* case 'About Us':
		 $('#About').addClass('active');
		 break;
	 */
	case 'All Products':
		$('#product').addClass('active');
		break;

	case 'Manage Products':
		$('#manageProducts').addClass('active');
		break;
	default:
		if (menu == "home")
			$("#home").addClass("active");
			break;
		$('#product').addClass('active');
		$('#a_' + menu).addClass('active');
		break;
		
	}

	// code for jquery dataTable

	var products = [ [ '1', 'abc', '23', '12' ], [ '2', 'abc', '23', '12' ],
			[ '3', 'abc', '23', '12' ], [ '15', 'abc', '23', '12' ],

	];

	var $table = $('#productListTable');

	if ($table.length) {

		// Create jsonUrl

		var jsonUrl = ' ';
		if (window.categoryId == ' ') {
			jsonUrl = window.contextRoot + '/json/data/all/products';
		} else {
			jsonUrl = window.contextRoot + '/json/data/category/'
					+ window.categoryId + '/products';
		}

		// execute the below code only where we have this table

		$table.DataTable({
		//	console.log('Inside The table!');
			lengthMenu : [ [ 1, 3,5, -1 ], [ '1 records', '3 records','5 records', 'ALL' ] ],
			pageLength : 5,
			ajax : {
				url : jsonUrl,
				dataSrc : ''
			},
 columns : [
	 {
		data: 'code',
		mRender: function(data, type , row) 
		 {
			return '<img src =" '+window.contextRoot+ '/resources/images/'+data+ '.jpg " style ="width:100px;height:100px"/>'
		 }
	 }, 
	 { 
	    	data : 'name'
	    }, 
	    { 
	    	data : 'author' 
	    },
	    { 
	    	data : 'unit_price',
	    	mRender: function(data,type,row){
	    		return '&#8377; ' +data
	    	}
	    },
	    {
	    	data :  'quantity' ,
	    	mRender: function(data, type, row){
	    		if(data < 1){
	    			return'<span style="color:red">Out of Stock!</span>';
	    		}
	    		return data;
	    	}
	    },
	    {
	    	data: 'id',
	    	bSortable: false,
	    	mRender: function(data, type, row)
	    	{
	    		var str = ' ';
	    		str += '<a href =" '+window.contextRoot+'/show/' +data+ '/product" class = "btn btn-primary"><span class="glyphicon glyphicon-eye-open"</span></a> &#160';
	    		
	    		if(row.quantity < 1){
	    			str+= '<a href =" javascript:void(0)" class = "btn btn-success disabled"><span class="glyphicon glyphicon-shopping-cart"></span></a>';
	    		}
	    		else{
	    			str += '<a href =" '+window.contextRoot+'/cart/add/' +data+ '/product" class = "btn btn-success"><span class="glyphicon glyphicon-shopping-cart"></span></a>';
	    		}
	    		
	    		return str;
	    	}
	    	
	    }
   ]
 
//			data: products
		});

	}

	
	//Dismissing alert

	var $alert = $('.alert');
	
	if($alert.length){
		
		setTimeout(function(){
			
			$alert.fadeOut('slow');
			
		}, 3000)
		
	}
	
	
	
	//bootbox alert
	
	$('.switch input[type="checkbox"]').on('change' , function(){
		
		var checkbox = $(this);
		var checked = checkbox.prop('checked');
		var dMsg =(checked)? 'You want to activate the product?':
												'you want to deactivate the product?';
		
		var value = checkbox.prop('value');
		
		bootbox.confirm({
			size: 'medium',
			tite: 'Product Activation & Deactivation',
			message:dMsg,
			callback: function(confirmed){
				
				if(confirmed){
					
					console.log(value);
					bootbox.alert({
						size: 'medium' ,
						title: 'Information',
						message: 'You are going to perform operation on product '+ value
					});
				}
				else{
					checkbox.prop('checked', !checked);
				}
			}
		
		
		});
	});

});