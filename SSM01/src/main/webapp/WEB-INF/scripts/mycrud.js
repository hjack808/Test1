$(document).ready(function(){
    //给删除的<a>动态绑定事件
    $(".del").click(function(){
        //确认是否要删除
        var flag = window.confirm("是否要删除?");
        if(!flag){
            return false ;
        }
        //this :当前点击的dom对象
        //获取点击的超连接的href的值
        var href = $(this).attr("href");
        //将href的值设置到表单的action上，并提交
        $("form").attr("action",href).submit();
        //取消<a>的默认行为
        return false;
    });
});