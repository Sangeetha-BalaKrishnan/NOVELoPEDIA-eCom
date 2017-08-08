$(function() {
	// Active Menu
	switch (menu) {
	case 'home':
		$('#home').addClass('active');
		break;
	case 'About Us':
		$('#About').addClass('active');
		break;
	case 'All Products':
		$('#Product').addClass('active');
		break;
	default:
		$('#Product').addClass('active');
		$('#a_' + menu).addClass('active');
		break;
	}

})