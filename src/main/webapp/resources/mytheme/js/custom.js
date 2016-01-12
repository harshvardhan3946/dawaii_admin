toastr.options = {
    "closeButton": true,
    "debug": false,
    "positionClass": "toast-center",
    "onclick": null,
    "showDuration": "300",
    "hideDuration": "1000",
    "timeOut": "2000",
    "extendedTimeOut": "1000",
    "showEasing": "swing",
    "hideEasing": "linear",
    "showMethod": "fadeIn",
    "hideMethod": "fadeOut"
};
$(document).ready(function(){
		//for mobile footer
		$('.combinedBttns div').on('click',function(){
			$(this).parent().find('div').removeClass('active');
			$(this).addClass('active');
			var id=$(this).attr('id');
			var content=$('.footerContent').find('.'+id+'1').html();
			$('.targetCont').html('');
			$('.targetCont').removeClass().addClass('targetCont').addClass(id);
			$('.targetCont').html(content);
		});//for mobile footer ends
		
		
});