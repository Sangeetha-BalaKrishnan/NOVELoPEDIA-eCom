$(function() {
	// Active Menu
	switch (menu) {
	case 'About Us':
		$('#About').addClass('active');
		break;
	// case 'About Us':
	// $('#About').addClass('active');
	default:
		$('#home').addClass('active');
		break;
	}

})