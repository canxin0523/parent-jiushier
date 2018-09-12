//服务层
app.service('deliveryCenterService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../deliveryCenter/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../deliveryCenter/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../deliveryCenter/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../deliveryCenter/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../deliveryCenter/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../deliveryCenter/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../deliveryCenter/search.do?page='+page+"&rows="+rows, searchEntity);
	}    	
});
