$(function() {
	
	switch(menu) {
		case 'About us':
			$('#aboutLinkPage').addClass('active');
			break;
		case 'Contact':
			$('#contactLinkPage').addClass('active');
			break;
		default:
			$('#homeLinkPage').addClass('active');
			break;
	}
	
});