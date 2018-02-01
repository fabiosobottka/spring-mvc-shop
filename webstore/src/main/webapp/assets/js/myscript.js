$(function() {
	
	switch(menu) {
		case 'About us':
			$('#aboutLinkPage').addClass('active');
			break;
		case 'Contact':
			$('#contactLinkPage').addClass('active');
			break;
		case 'All Products':
			$('#productsLinkPage').addClass('active');
			break;
		default:
			$('#productsLinkPage').addClass('active');
			$('#a_'+menu).addClass('active');
			break;
	}
	
});