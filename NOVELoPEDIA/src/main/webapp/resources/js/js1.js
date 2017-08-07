$(function() {
	// Active Menu
	switch (menu) {
	case 'About Us':
		$('#About').addClass('active');
		break;
	case 'Product':
	 $('#Product').addClass('active');
	 break;
	default:
		$('#home').addClass('active');
		break;
	}

})