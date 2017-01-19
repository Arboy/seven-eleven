var $form = $("form"),
    $successMsg = $(".alert");
$form.find("button[type='submit']").on("click", function(e){
    e.preventDefault();
    if($form.smkValidate()){
        $successMsg.show();
    }
});